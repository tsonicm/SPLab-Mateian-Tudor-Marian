package sp.lab.Models;

import lombok.Getter;
import sp.lab.Services.IAlignStrategy;

public class Paragraph extends Element{
    @Getter
    private String text;
    private IAlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = null;
    }

    public void setAlignStrategy(IAlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public void accept(IVisitor visitor) {
        visitor.visitParagraph(this);
    }

    public void print() {
        if(this.alignStrategy != null) {
            this.alignStrategy.render("Paragraph: " + this.text);
        } else {
            System.out.println("Paragraph: " + this.text);
        }
    }
}
