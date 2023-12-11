package sp.lab.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class SubChapter {
    private String name;
    private List<IElement> elementList;

    public SubChapter(String name) {
        this.name = name;
        this.elementList = new ArrayList<>();
    }

    public void addElement(IElement element) {
        this.elementList.add(element);

        this.elementList.sort(new Comparator<IElement>() {
            @Override public int compare(IElement o1, IElement o2) {
                return o1.getIndex() - o2.getIndex();
            }
        });
    }

    public void createNewParagraph(String paragraphName) {
        this.elementList.add(new Paragraph(paragraphName));
    }

    public void createNewImage(String imageName) {
        this.elementList.add(new Image(imageName));
    }

    public void createNewTable(String tableName) {
        this.elementList.add(new Table(tableName));
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);

        for (IElement element : this.elementList) {
            element.print();
        }
    }
}
