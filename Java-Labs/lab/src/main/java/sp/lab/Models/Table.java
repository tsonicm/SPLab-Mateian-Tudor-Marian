package sp.lab.Models;

public class Table implements IElement {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table with title: " + this.title);
    }

    public int getIndex() {
        return 3;
    }
}
