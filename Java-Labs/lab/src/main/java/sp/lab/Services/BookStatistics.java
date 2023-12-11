package sp.lab.Services;

import sp.lab.Models.Book;
import sp.lab.Models.IVisitor;
import sp.lab.Models.Image;
import sp.lab.Models.ImageProxy;
import sp.lab.Models.Paragraph;
import sp.lab.Models.Section;
import sp.lab.Models.Table;
import sp.lab.Models.TableOfContents;

public class BookStatistics implements IVisitor{
    private int images, tables, paragraphs;

    public BookStatistics() {
        this.images = 0;
        this.tables = 0;
        this.paragraphs = 0;
    }

    @Override
    public void visitBook(Book book) {}

    @Override
    public void visitSection(Section section) {}

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.paragraphs++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        this.images++;
    }

    @Override
    public void visitImage(Image image) {
        this.images++;
    }

    @Override
    public void visitTable(Table table) {
        this.tables++;
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {}

    public void printStatistics() {
        System.out.println("Book statistics: ");
        System.out.println("\tImages: " + this.images);
        System.out.println("\tTables: " + this.tables);
        System.out.println("\tParagraphs: " + this.paragraphs);
    }
}
