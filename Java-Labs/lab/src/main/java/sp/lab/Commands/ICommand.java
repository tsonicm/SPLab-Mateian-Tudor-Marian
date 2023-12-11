package sp.lab.Commands;

import sp.lab.Services.BookService;

public interface ICommand {
    <T> T execute(BookService bookService);
}
