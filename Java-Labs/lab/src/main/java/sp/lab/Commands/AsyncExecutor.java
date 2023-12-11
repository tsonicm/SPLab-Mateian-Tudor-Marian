package sp.lab.Commands;

import sp.lab.Services.BookService;

public class AsyncExecutor implements ICommandExecutor{
    @Override
    public Request executeCommand(ICommand command, BookService bookService) {
        return new Request<>(0, command, false, null);
    }
}
