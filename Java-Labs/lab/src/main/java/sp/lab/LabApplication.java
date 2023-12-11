package sp.lab;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import sp.lab.Models.Book;
import sp.lab.Models.Image;
import sp.lab.Models.ImageProxy;
import sp.lab.Models.Paragraph;
import sp.lab.Models.Section;
import sp.lab.Models.Table;
import sp.lab.Services.BookSaveVisitor;


@SpringBootApplication
public class LabApplication {

	public static void main(String[] args) throws Exception {
		Book b = new Book("The book");
        Section cap1 = new Section("Chapter 1");
        Section cap11 = new Section("Subchapter 1.1");
        Section cap2 = new Section("Chapter 2");
        cap1.add(new Paragraph("Paragraph 1"));
        cap1.add(new Paragraph("Paragraph 2"));
        cap1.add(new Paragraph("Paragraph 3"));

        cap11.add(new ImageProxy("ImageOne", 10, 10));
        cap11.add(new Image("ImageTwo"));

        cap2.add(new Paragraph("Paragraph 4"));
        cap1.add(cap11);
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));

        b.addContent(cap1);
        b.addContent(cap2);

        BookSaveVisitor bookSaveVisitor = new BookSaveVisitor();
        b.accept(bookSaveVisitor);
        bookSaveVisitor.exportJSON();
	}

}
