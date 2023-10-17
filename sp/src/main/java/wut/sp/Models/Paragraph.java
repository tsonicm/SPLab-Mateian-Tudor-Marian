package wut.sp.Models;

import wut.sp.Interfaces.IElement;

public class Paragraph implements IElement{
    private String text;

    public Paragraph() {
    }

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + this.text);
    }

    @Override
    public void add(IElement element) {
        System.out.println("Cannot add element to paragraph");
    }

    @Override
    public void remove(IElement element) {
        System.out.println("Cannot remove element from paragraph");
    }

    @Override
    public IElement getElement(int index) {
        System.out.println("Cannot get element from paragraph");
        return null;
    }
}
