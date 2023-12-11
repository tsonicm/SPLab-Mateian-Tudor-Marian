package sp.lab.Models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Section extends Element{
    
    @Getter
    private String title;
    List<Element> elementList;

    public Section(String title) {
        this.title = title;
        elementList = new ArrayList<>();
    }

    @Override
    public void add(Element element) throws Exception {
        if (element.getParent() == null) {
            element.setParent(this);
            elementList.add(element);
        } else {
            throw new Exception("Element already present!");
        }
    }

    @Override
    public void remove(Element element) {
        elementList.remove(element);
        element.setParent(null);
    }

    @Override
    public Element get(int index) {
        return elementList.get(index);
    }

    public void accept(IVisitor visitor) {
        visitor.visitSection(this);
        for (Element element : this.elementList) {
            element.accept(visitor);
        }
    }

    public void print() {
        System.out.println("Section: " + this.title);

        for (Element element : this.elementList) {
            element.print();
        }
    }
}
