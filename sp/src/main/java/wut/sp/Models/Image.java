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

    @Override
    public void add(IElement element) {
        System.out.println("Cannot add element to image");
    }

    @Override
    public void remove(IElement element) {
        System.out.println("Cannot remove element from image");
    }

    @Override
    public IElement getElement(int index) {
        System.out.println("Cannot get element from image");
        return null;
    }
}
