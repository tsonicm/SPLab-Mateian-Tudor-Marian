package sp.lab.Models.Image;

import lombok.Getter;

public class Size {
    
    @Getter
    private int width;
    @Getter
    private int height;

    public Size(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
