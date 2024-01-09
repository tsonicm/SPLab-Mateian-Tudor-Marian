package sp.lab.Persistance;

import java.util.List;

import org.springframework.stereotype.Component;

import sp.lab.Models.Book;

@Component
public class BookRepository {
    private final IBookCRUDRepository booksCrudRepository;

    public BookRepository(IBookCRUDRepository booksCrudRepository) {
        this.booksCrudRepository = booksCrudRepository;
    }

    public List<Book> findAllBooks() {
        return booksCrudRepository.findAll();
    }

    public Book findBookById(Long id) {
        return booksCrudRepository.findById(id).orElse(null);
    }

    public Book saveBook(Book book) {
        return booksCrudRepository.save(book);
    }

    public void deleteBookById(Long id) {
        booksCrudRepository.deleteById(id);
    }
}
