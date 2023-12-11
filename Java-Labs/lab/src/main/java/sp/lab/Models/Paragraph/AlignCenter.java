package sp.lab.Models.Paragraph;

public class AlignCenter implements IAlignStrategy{
    public void render(String content) {
        System.out.println("+++++" + content + "+++++");
    }
}
