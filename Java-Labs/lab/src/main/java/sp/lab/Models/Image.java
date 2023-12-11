package sp.lab.Models;

import java.util.concurrent.TimeUnit;

import lombok.Getter;
import sp.lab.Services.ImageLoaderFactory;

public class Image extends Element implements IPicture{
    
    @Getter
    private String url;
    private ImageContent imageContent;

    public Image(String url) {
        this.url = url;
        ImageLoaderFactory imageLoaderFactory = new ImageLoaderFactory();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void print() {
        System.out.println(this.url);
    }

    public void accept(IVisitor visitor) {
        visitor.visitImage(this);
    }
}
