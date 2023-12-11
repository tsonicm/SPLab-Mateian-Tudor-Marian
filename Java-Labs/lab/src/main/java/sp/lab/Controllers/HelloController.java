package sp.lab.Controllers;

import sp.lab.Components.ClientComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final ClientComponent clientComponent;

    @GetMapping("/")
    public String hello() {
        return "Hello from ClientComponent = " + clientComponent.toString();
    }
}