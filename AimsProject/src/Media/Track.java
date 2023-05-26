package Media;

import java.util.Objects;

public class Track implements Playable{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track() {

    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track Length: " + this.getLength());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Track track)) return false;
        return length == track.length && Objects.equals(title, track.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length);
    }
}
