package wut.sp.Models;

import java.util.ArrayList;
import java.util.List;

import wut.sp.Interfaces.IElement;

public class SubChapter implements IElement{
    private String name;
    private List<IElement> elements;

    public SubChapter() {
    }

    public SubChapter(String name) {
        this.name = name;
        this.elements = new ArrayList<IElement>();
    }

    public SubChapter(String name, List<IElement> elements) {
        this.name = name;
        this.elements = new ArrayList<IElement>();
    }

    public void createNewParagraph(String string) {
        Paragraph paragraph = new Paragraph(string);
        if (this.elements == null) {
            this.elements = new ArrayList<IElement>();
        }
        this.elements.add(paragraph);
    }

    public void createNewImage(String string) {
        Image image = new Image(string);
        if (this.elements == null) {
            this.elements = new ArrayList<IElement>();
        }
        this.elements.add(image);
    }

    public void createNewTable(String string) {
        Table table = new Table(string);
        if (this.elements == null) {
            this.elements = new ArrayList<IElement>();
        }
        this.elements.add(table);
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
        for (IElement element : this.elements) {
            element.print();
        }
    }
}
