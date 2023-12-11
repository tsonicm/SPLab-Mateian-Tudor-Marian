package sp.lab.Services;

import sp.lab.Models.ImageContent;

public class JPGImageLoader implements IImageLoader{
    private String url;

    public JPGImageLoader(String url) {
        this.url = url;
    }

    public ImageContent load(String url) {
        return new ImageContent(url);
    }
}
