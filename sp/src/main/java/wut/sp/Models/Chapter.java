package wut.sp.Models;

import java.util.List;
import java.util.ArrayList;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters;

    public Chapter() {
    }

    public Chapter(String name) {
        this.name = name;
    }

    public Chapter(String name, List<SubChapter> subChapters) {
        this.name = name;
        this.subChapters = subChapters;
    }

    public int createSubChapter(String string) {
        SubChapter subChapter = new SubChapter(string);
        if (this.subChapters == null) {
            this.subChapters = new ArrayList<SubChapter>();
        }
        this.subChapters.add(subChapter);
        return this.subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return this.subChapters.get(indexSubChapterOneOne);
    }

    public String getName() {
        return this.name;
    }
}
