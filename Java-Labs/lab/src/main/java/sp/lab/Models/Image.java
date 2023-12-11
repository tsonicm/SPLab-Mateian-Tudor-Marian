package sp.lab.Models;

public class Image implements IElement{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Image with name: " + this.name);
    }

    public int getIndex() {
        return 2;
    }
}
