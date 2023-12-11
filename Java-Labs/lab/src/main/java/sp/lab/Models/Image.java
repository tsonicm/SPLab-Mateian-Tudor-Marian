package sp.lab.Models;

public class Image extends Element{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Image with name: " + this.name);
    }
}
