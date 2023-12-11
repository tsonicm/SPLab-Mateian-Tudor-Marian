package sp.lab.Models;

public class ImageProxy extends Element implements IPicture{
    private String name;
    private Image realImage;

    public ImageProxy(String name) {
        this.name = name;
        realImage = null;
    }

    public Image loadImage() {
        if(realImage == null) {
            realImage = new Image(this.name);
        }
        return realImage;
    }

    @Override
    public void print() {
        this.loadImage();
        this.realImage.print();
    }
}
