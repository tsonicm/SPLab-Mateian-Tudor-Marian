package sp.lab.Commands;

import lombok.AllArgsConstructor;
import sp.lab.Models.Book;
import sp.lab.Services.BookService;

@AllArgsConstructor
public class DeleteBook implements ICommand{
    private int id;

    @Override
    public Book execute(BookService bookService) {
        return bookService.deleteBook(id);
    }
}
