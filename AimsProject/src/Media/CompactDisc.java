package Media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title, String category, float cost, String artist) {
        super(title, category, cost);
        this.artist = artist;
    }

    public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
        super(title, category, cost, length, director);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (tracks.indexOf(track) == -1) {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (tracks.indexOf(track) != -1) {
            tracks.remove(track);
        }
    }

    public int getLength() {
        int sum = 0;
        for (Track track : tracks) {
            sum += track.getLength();
        }
        return sum;
    }

    public void play() {
        for (Track track : tracks) {
            for (int i = 0; i < tracks.size(); i++) {
                if (i == tracks.indexOf(track)) {
                    System.out.print("\t");
                    tracks.get(i).play();
                }else {
                    System.out.println((i+1) + ". " + tracks.get(i).getTitle() + " (" + tracks.get(i).getLength() + ")");
                }
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
