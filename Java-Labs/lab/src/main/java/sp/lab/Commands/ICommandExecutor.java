package sp.lab.Commands;

import sp.lab.Services.BookService;

public interface ICommandExecutor {
    abstract Request executeCommand(ICommand command, BookService bookService);
}
