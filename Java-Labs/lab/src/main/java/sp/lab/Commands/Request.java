package sp.lab.Commands;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Request<T> {
    private int id;
    private ICommand command;
    private boolean complete;
    private T result;
}
