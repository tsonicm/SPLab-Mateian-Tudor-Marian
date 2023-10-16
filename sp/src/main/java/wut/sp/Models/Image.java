package wut.sp.Models;

import wut.sp.Interfaces.IElement;

public class Image implements IElement{
    private String name;

    public Image() {
    }

    public Image(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + this.name);
    }
}
