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
}
