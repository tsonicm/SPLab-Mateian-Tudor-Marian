package sp.lab.Services;

import sp.lab.Models.Book;
import sp.lab.Models.IVisitor;
import sp.lab.Models.Image;
import sp.lab.Models.ImageProxy;
import sp.lab.Models.Paragraph;
import sp.lab.Models.Section;
import sp.lab.Models.Table;
import sp.lab.Models.TableOfContents;

public class TableOfContentsUpdate implements IVisitor{
    private TableOfContents tableOfContents;
    private int pageIndex;

    public TableOfContentsUpdate() {
        this.tableOfContents = new TableOfContents();
        this.pageIndex = 0;
    }

    @Override
    public void visitBook(Book book) {
        this.pageIndex++;
    }

    @Override
    public void visitSection(Section section) {
        String entry = section.getTitle() + ' ';
        while(entry.length() <= 20) {
            entry += '.';
        }
        entry += ' ' + this.pageIndex;
        
        this.tableOfContents.addEntry(entry);
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.pageIndex++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        this.pageIndex++;
    }

    @Override
    public void visitImage(Image image) {
        this.pageIndex++;
    }

    @Override
    public void visitTable(Table table) {
        this.pageIndex++;
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {}

    public TableOfContents getTableOfContents() {
        return this.tableOfContents;
    }
}
