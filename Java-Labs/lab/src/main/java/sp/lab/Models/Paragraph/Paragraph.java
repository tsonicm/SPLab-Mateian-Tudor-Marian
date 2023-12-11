package sp.lab.Models.Paragraph;

import sp.lab.Models.Element;

public class Paragraph extends Element{
    private String text;
    private IAlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = null;
    }

    public void setAlignStrategy(IAlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public void print() {
        if(this.alignStrategy != null) {
            this.alignStrategy.render("Paragraph: " + this.text);
        } else {
            System.out.println("Paragraph: " + this.text);
        }
    }
}
