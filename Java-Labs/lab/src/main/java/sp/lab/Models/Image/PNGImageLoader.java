package sp.lab.Models.Image;

public class PNGImageLoader implements IImageLoader {
    private String url;

    public PNGImageLoader(String url) {
        this.url = url;
    }

    public ImageContent load(String url) {
        return new ImageContent(url);
    }
}
