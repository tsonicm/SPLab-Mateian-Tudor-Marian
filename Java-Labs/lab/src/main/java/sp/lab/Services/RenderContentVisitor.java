package sp.lab.Services;

import sp.lab.Models.Book;
import sp.lab.Models.IVisitor;
import sp.lab.Models.Image;
import sp.lab.Models.ImageProxy;
import sp.lab.Models.Paragraph;
import sp.lab.Models.Section;
import sp.lab.Models.Table;
import sp.lab.Models.TableOfContents;

public class RenderContentVisitor implements IVisitor{
    @Override
    public void visitBook(Book book) {
        System.out.println(book.getTitle());
    }

    @Override
    public void visitSection(Section section) {
        System.out.println(section.getTitle());
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraph.print();
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.print();
    }

    @Override
    public void visitImage(Image image) {
        image.print();
    }

    @Override
    public void visitTable(Table table) {
        table.print();
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        tableOfContents.print();
    }
}
