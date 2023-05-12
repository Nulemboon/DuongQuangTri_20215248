package DigitalVideoDisc;

import java.util.Objects;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDisc = 0;

    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
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
