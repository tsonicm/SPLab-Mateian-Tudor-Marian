package wut.sp.Models;

import java.util.ArrayList;
import java.util.List;

import wut.sp.Interfaces.IElement;

public class Section implements IElement{
    private String title;
    private List<IElement> content;

    public Section() {
    }

    public Section(String title) {
        this.title = title;
        this.content = new ArrayList<IElement>();
    }

    public Section(String title, List<IElement> content) {
        this.title = title;
        this.content = new ArrayList<IElement>();
    }

    public void addElement(IElement element) {
        this.content.add(element);
    }

    @Override
    public void add(IElement element) {
        this.content.add(element);
    }

    @Override
    public void remove(IElement element) {
        this.content.remove(element);
    }

    @Override
    public IElement getElement(int index) {
        return this.content.get(index);
    }

    @Override
    public void print() {
        System.out.println(this.title);
        for (IElement element : this.content) {
            element.print();
        }
    }
}