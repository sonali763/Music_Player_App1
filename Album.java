//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList();
    }

    public Album() {
    }

    public Song findSong(String title) {
        Iterator var2 = this.songs.iterator();

        Song checkedSong;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            checkedSong = (Song)var2.next();
        } while(!checkedSong.getTitle().equals(title));

        return checkedSong;
    }

    public boolean addSong(String title, double duration) {
        if (this.findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList) {
        int index = trackNumber - 1;
        if (index > 0 && index <= this.songs.size()) {
            PlayList.add((Song)this.songs.get(index));
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> PlayList) {
        Iterator var3 = this.songs.iterator();

        Song checkedSong;
        do {
            if (!var3.hasNext()) {
                return false;
            }

            checkedSong = (Song)var3.next();
        } while(!checkedSong.getTitle().equals(title));

        PlayList.add(checkedSong);
        return true;
    }
}
