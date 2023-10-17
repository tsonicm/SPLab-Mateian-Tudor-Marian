package wut.sp.Models;

import wut.sp.Interfaces.IElement;

public class Table implements IElement{
    private String name;

    public Table() {
    }

    public Table(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("Table with Title: " + this.name);
    }

    @Override
    public void add(IElement element) {
        System.out.println("Cannot add element to table");
    }

    @Override
    public void remove(IElement element) {
        System.out.println("Cannot remove element from table");
    }

    @Override
    public IElement getElement(int index) {
        System.out.println("Cannot get element from table");
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }
}
