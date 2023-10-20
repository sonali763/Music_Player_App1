//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public Song() {
    }

    public String getTitle() {
        return this.title;
    }

    public double getDuration() {
        return this.duration;
    }

    public String toString() {
        return "Song{title='" + this.title + "', duration=" + this.duration + "}";
    }
}
