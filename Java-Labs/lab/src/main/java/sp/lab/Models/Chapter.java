package sp.lab.Models;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapterList;

    public Chapter(String name) {
        this.name = name;
        this.subChapterList = new ArrayList<>();
    }

    public int createSubChapter(String subChapterName) {
        SubChapter subChapter = new SubChapter(subChapterName);
        this.subChapterList.add(subChapter);
        return this.subChapterList.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index) {
        return this.subChapterList.get(index);
    }

    public void print() {
        System.out.println("Chapter: " + this.name);

        for (SubChapter subChapter : this.subChapterList) {
            subChapter.print();
        }
    }
}
