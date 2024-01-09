package sp.lab.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import sp.lab.Models.Book;
@Component
public class BookService implements IBookService{
    List<Book> books = new ArrayList<>();

    @Override
    public Book getBookByID(int id) {
        return books.get(id);
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Book createBook(Book book) {
        books.add(book);
        return books.get(books.size() - 1);
    }

    @Override
    public Book updateBook(Book book, int id) {
        books.set(id, book);
        return books.get(id);
    }

    @Override
    public Book deleteBook(int id) {
        return books.remove(id);
    }
}
