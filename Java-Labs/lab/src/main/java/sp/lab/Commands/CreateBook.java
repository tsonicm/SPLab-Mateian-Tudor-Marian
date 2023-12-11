package sp.lab.Commands;

import lombok.AllArgsConstructor;
import sp.lab.Models.Book;
import sp.lab.Services.BookService;

@AllArgsConstructor
public class CreateBook implements ICommand{
    private String title;

    @Override
    public Book execute(BookService bookService) {
        return bookService.createBook(new Book(title));
    }
}
