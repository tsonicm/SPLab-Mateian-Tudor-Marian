package sp.lab.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientComponent {
    private final TransientComponent transientComponent;
    private final SingletonComponent singletonComponent;

    @Autowired
    public ClientComponent(TransientComponent tc, SingletonComponent sc) {
        this.transientComponent = tc;
        this.singletonComponent = sc;

        System.out.println("ClientComponent::ClientComponent = " + this);
        System.out.println(" - SingletonComponent = " + this.singletonComponent);
        System.out.println(" - TransientComponent = " + this.transientComponent);
    }

    public void operation() {
        System.out.println("Invoked ClientComponent::operation() on " + this);
        System.out.println(" - SingletonComponent = " + this.singletonComponent);
        System.out.println(" - TransientComponent = " + this.transientComponent);
    }
}
