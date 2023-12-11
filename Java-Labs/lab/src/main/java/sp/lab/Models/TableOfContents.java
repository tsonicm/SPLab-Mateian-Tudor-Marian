package sp.lab.Models;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents extends Element{
    private List<String> entries;

    public TableOfContents() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String entry) {
        this.entries.add(entry);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitTableOfContents(this);
    }

    @Override
    public void print() {
        System.out.println("Table of contents: ");
        for (String entry : this.entries) {
            System.out.println(entry);
        }
    }
}
