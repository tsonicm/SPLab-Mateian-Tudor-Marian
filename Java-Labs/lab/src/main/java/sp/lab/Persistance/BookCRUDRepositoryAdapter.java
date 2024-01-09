package sp.lab.Persistance;

import java.util.List;
import java.util.Optional;

import sp.lab.Models.Book;

public class BookCRUDRepositoryAdapter implements IBookCRUDRepository{
    private final IBookJPARepository bookJPARepository;

    public BookCRUDRepositoryAdapter(IBookJPARepository bookJPARepository) {
        this.bookJPARepository = bookJPARepository;
    }

    @Override
    public List<Book> findAll() {
        return bookJPARepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookJPARepository.findById(id).orElse(null);
    }

    @Override
    public Book save(Book book) {
        return bookJPARepository.save(book);
    }

    @Override
    public void deleteById(Long id) {
        bookJPARepository.deleteById(id);
    }

    @Override
    public Book update(Long id, Book updateBook) {
        Optional<Book> foundBook = bookJPARepository.findById(id);

        if (foundBook.isPresent()) {
            foundBook.get().setTitle(updateBook.getTitle());
            foundBook.get().setAuthorList(updateBook.getAuthorList());
            foundBook.get().setElementList(updateBook.getElementList());
            bookJPARepository.save(foundBook.get());
        }
        return foundBook.orElse(null);
    }
}
