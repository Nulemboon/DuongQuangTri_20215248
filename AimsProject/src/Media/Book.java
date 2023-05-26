package Media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();

    public Book() {

    }

    public void addAuthor(String authorName) {
        if (authors.indexOf(authorName) == -1) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.indexOf(authorName) != -1) {
            authors.remove(authorName);
        }
    }
}
