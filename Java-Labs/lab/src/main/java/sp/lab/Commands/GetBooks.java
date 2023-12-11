package sp.lab.Commands;

import java.util.List;

import lombok.AllArgsConstructor;
import sp.lab.Models.Book;
import sp.lab.Services.BookService;

@AllArgsConstructor
public class GetBooks implements ICommand{
    @Override
    public List<Book> execute(BookService bookService) {
        return bookService.getBooks();
    }
}
