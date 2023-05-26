package Media;

import java.util.Objects;

public abstract class Media {
    private int id;
    private String title, category;
    private float cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media() {

    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public boolean isMatch(String title) {
        return this.getTitle().contains(title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Media media)) return false;
        return Objects.equals(title, media.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
