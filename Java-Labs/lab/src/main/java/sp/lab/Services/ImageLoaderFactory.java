package sp.lab.Services;

import sp.lab.Models.ImageContent;

public class ImageLoaderFactory {
    private IImageLoader imageLoader;

    public ImageLoaderFactory() {
        this.imageLoader = null;
    }

    public ImageContent createImageLoader(String url) {
        String extension = url.substring(url.lastIndexOf(".") + 1);

        if (extension.equals("jpg")) {
            this.imageLoader = new JPGImageLoader(url);
        } else {
            this.imageLoader = new PNGImageLoader(url);
        }

        return this.imageLoader.load(url);
    }
}
