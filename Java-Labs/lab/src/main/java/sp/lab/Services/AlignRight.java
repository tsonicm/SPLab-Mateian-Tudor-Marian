package sp.lab.Services;

public class AlignRight implements IAlignStrategy{
    public void render(String content) {
        System.out.println("+++++" + content);
    }
}
