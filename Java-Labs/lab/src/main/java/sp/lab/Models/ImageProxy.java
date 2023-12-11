package sp.lab.Models;

import lombok.Getter;

public class ImageProxy extends Element implements IPicture{
    
    @Getter
    private String url;
    private Image realImage;
    private Size size;

    public ImageProxy(String url, int width, int height) {
        this.url = url;
        this.size = new Size(width, height);
        this.realImage = null;
    }

    public Image loadImage() {
        if(realImage == null) {
            realImage = new Image(this.url);
        }
        return realImage;
    }

    public void accept(IVisitor visitor) {
        visitor.visitImageProxy(this);
    }

    public void print() {
        this.loadImage();
        this.realImage.print();
    }
}
