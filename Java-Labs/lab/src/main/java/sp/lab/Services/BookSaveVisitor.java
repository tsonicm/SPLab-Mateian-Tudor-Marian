package sp.lab.Services;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import sp.lab.Models.Book;
import sp.lab.Models.IVisitor;
import sp.lab.Models.Image;
import sp.lab.Models.ImageProxy;
import sp.lab.Models.Paragraph;
import sp.lab.Models.Section;
import sp.lab.Models.Table;
import sp.lab.Models.TableOfContents;


public class BookSaveVisitor implements IVisitor{
    private JSONArray jasonArray;

    public BookSaveVisitor() {
        this.jasonArray = new JSONArray();
    }

    @Override
    public void visitBook(Book book) {
    }

    @Override
    public void visitSection(Section section) {
        JSONObject obj = new JSONObject();
        JSONObject item = new JSONObject();

        item.put("title", section.getTitle());
        obj.put("section", item);

        this.jasonArray.put(obj);
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        JSONObject obj = new JSONObject();
        JSONObject item = new JSONObject();

        item.put("text", paragraph.getText());
        obj.put("paragraph", item);

        this.jasonArray.put(obj);
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        JSONObject obj = new JSONObject();
        JSONObject item = new JSONObject();

        item.put("url", imageProxy.getUrl());
        obj.put("imageProxy", item);

        this.jasonArray.put(obj);
    }

    @Override
    public void visitImage(Image image) {
        JSONObject obj = new JSONObject();
        JSONObject item = new JSONObject();

        item.put("url", image.getUrl());
        obj.put("image", item);

        this.jasonArray.put(obj);
    }

    @Override
    public void visitTable(Table table) {
        JSONObject obj = new JSONObject();
        JSONObject item = new JSONObject();

        item.put("title", table.getTitle());
        obj.put("table", item);

        this.jasonArray.put(obj);
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        
    }

    public void exportJSON() {
        try (FileWriter file = new FileWriter("book.json")) {
            file.write(this.jasonArray.toString(4));
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
