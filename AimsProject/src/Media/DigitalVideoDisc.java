package Media;

import java.util.Objects;

public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDisc = 0;

    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title) {
        this.setTitle(title);
        nbDigitalVideoDisc++;
        this.setId(nbDigitalVideoDisc);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nbDigitalVideoDisc++;
        this.setId(nbDigitalVideoDisc);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
        nbDigitalVideoDisc++;
        this.setId(nbDigitalVideoDisc);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }

    @Override
    public String toString() {
        return this.getId() + ". DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + "$";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitalVideoDisc that = (DigitalVideoDisc) o;
        return this.getLength() == that.getLength() && Float.compare(that.getCost(), this.getCost()) == 0 && Objects.equals(this.getTitle(), that.getTitle()) && Objects.equals(this.getCategory(), that.getCategory()) && Objects.equals(getDirector(), that.getDirector());
    }
}
