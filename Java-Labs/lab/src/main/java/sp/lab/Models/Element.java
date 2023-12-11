package sp.lab.Models;

import lombok.Getter;
import lombok.Setter;

public abstract class Element {
    
    @Getter
    @Setter
    private Element parent = null;

    abstract void print();
    void add(Element element) throws Exception {}
    void remove(Element element) {}
    Element get(int index) {return null;}
}