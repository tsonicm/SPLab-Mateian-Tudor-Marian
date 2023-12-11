package sp.lab.Services;

import java.util.List;

import sp.lab.Models.Book;

public interface IBookService {
    Book getBookByID(int id);
    List<Book> getBooks();
    Book createBook(Book book);
    Book updateBook(Book book, int id);
    Book deleteBook(int id);
}
