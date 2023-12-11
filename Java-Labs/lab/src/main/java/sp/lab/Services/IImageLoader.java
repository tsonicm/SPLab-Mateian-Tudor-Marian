package sp.lab.Services;

import sp.lab.Models.ImageContent;

public interface IImageLoader {
    ImageContent load(String url);
}
