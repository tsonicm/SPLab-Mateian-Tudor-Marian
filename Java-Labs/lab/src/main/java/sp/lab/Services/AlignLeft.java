package sp.lab.Services;

public class AlignLeft implements IAlignStrategy{
    public void render(String content) {
        System.out.println(content + "+++++");
    }
}
