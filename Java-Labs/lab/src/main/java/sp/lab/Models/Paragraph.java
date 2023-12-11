package sp.lab.Models;

public class Paragraph implements IElement{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + this.text);
    }

    public int getIndex() {
        return 1;
    }
}
