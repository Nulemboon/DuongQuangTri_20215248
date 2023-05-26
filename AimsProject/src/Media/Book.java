package Media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();
    public static int nbOfBook = 0;
    public Book() {
        nbOfBook++;
        this.setId((nbOfBook));
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
        nbOfBook++;
        this.setId(nbOfBook);
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }

    @Override
    public String toString() {
        return this.getId() + ". Book - " + this.getTitle() + " - " + this.getCategory() + " - " + this.authors.toString() + ": " + this.getCost() + "$";
    }
}
