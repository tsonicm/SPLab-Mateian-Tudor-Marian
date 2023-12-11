package sp.lab.Models;

import java.util.concurrent.TimeUnit;

public class Image extends Element implements IPicture{
    private String name;

    public Image(String name) {
        this.name = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Image with name: " + this.name);
    }
}
