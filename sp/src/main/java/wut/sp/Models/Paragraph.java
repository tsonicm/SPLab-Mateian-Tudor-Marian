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
}
