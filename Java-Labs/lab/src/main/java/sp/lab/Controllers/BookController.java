package sp.lab.Controllers;

import org.springframework.web.bind.annotation.RestController;

import sp.lab.Commands.AsyncExecutor;
import sp.lab.Commands.CreateBook;
import sp.lab.Commands.DeleteBook;
import sp.lab.Commands.GetBookByID;
import sp.lab.Commands.GetBooks;
import sp.lab.Commands.ICommandExecutor;
import sp.lab.Commands.Request;
import sp.lab.Commands.SyncExecutor;
import sp.lab.Commands.UpdateBook;
import sp.lab.Models.Book;
import sp.lab.Models.Image;
import sp.lab.Models.ImageProxy;
import sp.lab.Models.Paragraph;
import sp.lab.Models.Section;
import sp.lab.Models.Table;
import sp.lab.Services.BookService;
import sp.lab.Services.BookStatistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BookController {
    BookService bookService = new BookService();
    List<Request<?>> requests;
    ICommandExecutor syncCommandExecutor;
    ICommandExecutor asyncCommandExecutor;
    ExecutorService executorService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
        this.requests = new ArrayList<>();

        this.syncCommandExecutor = new SyncExecutor();
        this.asyncCommandExecutor = new AsyncExecutor();

        this.executorService = Executors.newFixedThreadPool(2);

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(this::processRequests, 0, 10, TimeUnit.SECONDS)
    }

    @GetMapping("/requests/{id}")
    public ResponseEntity<?> getRequest(@PathVariable int id) {
        if (id >= requests.size()) {
            return new ResponseEntity<>("Request not found", HttpStatus.NOT_FOUND);
        }

        Request req = requests.get(id);

        if (req.isComplete()) {
            return new ResponseEntity<>(req.getResult(), HttpStatus.OK);
        }

        return new ResponseEntity<>("Request not complete", HttpStatus.OK);
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        GetBooks getBooks = new GetBooks();
        return getBooks.execute(bookService);
    }

    @GetMapping("/books/{id}")
    public Book getBookByID(@PathVariable int id){
        GetBookByID getBookByID = new GetBookByID(id);

        return getBookByID.execute(bookService);
    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Map<String, String> book) {
        CreateBook createBook = new CreateBook(book.get("title"));
        return createBook.execute(bookService);
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Map<String, String> book) {
        UpdateBook updateBook = new UpdateBook(id, book.get("title"));
        return updateBook.execute(bookService);
    }

    @DeleteMapping("/books/{id}")
    public Book deleteBook(@PathVariable int id) {
        DeleteBook deleteBook = new DeleteBook(id);
        return deleteBook.execute(bookService);
    }

    public void processRequests() {
        System.out.println("Processing requests");

        for (Request req: requests) {
            if(!req.isComplete()) {
                executorService.submit(() -> {
                    System.out.println("Executing request " + req.getId());

                    req.setResult(req.getCommand().execute(bookService));
                    req.setComplete(true);

                    System.out.println("Request " + req.getId() + " completed");
                });
            }
        }
    }

    @GetMapping("/stats")
    public ResponseEntity<?> printStats() {
        Section cap1 = new Section("Capitolul 1");

        try {
            Paragraph p1 = new Paragraph("Paragraph 1");
            cap1.add(p1);

            Paragraph p2 = new Paragraph("Paragraph 2");
            cap1.add(p2);

            Paragraph p3 = new Paragraph("Paragraph 3");
            cap1.add(p3);

            Paragraph p4 = new Paragraph("Paragraph 4");
            cap1.add(p4);

            cap1.add(new ImageProxy("ImageOne", 10, 10));
            cap1.add(new Image("ImageTwo"));
            cap1.add(new Paragraph("Some text"));
            cap1.add(new Table("Table 1"));

            BookStatistics stats = new BookStatistics();
            cap1.accept(stats);
            stats.printStatistics();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
