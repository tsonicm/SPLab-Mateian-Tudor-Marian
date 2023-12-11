package sp.lab.Commands;

import lombok.AllArgsConstructor;
import sp.lab.Models.Book;
import sp.lab.Services.BookService;

@AllArgsConstructor
public class UpdateBook implements ICommand{
    private int id;
    private String title;

    @Override
    public Book execute(BookService bookService) {
        return bookService.updateBook(new Book(title), id);
    }
}
