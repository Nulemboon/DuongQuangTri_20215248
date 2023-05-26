package Media;

import java.util.Objects;

public class DigitalVideoDisc extends Disc {
    private static int nbDigitalVideoDisc = 0;

    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDisc++;
        super.setId(nbDigitalVideoDisc);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nbDigitalVideoDisc++;
        super.setId(nbDigitalVideoDisc);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
        nbDigitalVideoDisc++;
        super.setId(nbDigitalVideoDisc);
    }

    public boolean isMatch(String title) {
        return this.title.contains(title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, category, director, length, cost);
    }

    @Override
    public String toString() {
        return id + ". DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + "$";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitalVideoDisc that = (DigitalVideoDisc) o;
        return length == that.length && Float.compare(that.cost, cost) == 0 && Objects.equals(title, that.title) && Objects.equals(category, that.category) && Objects.equals(director, that.director);
    }
}
