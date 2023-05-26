package Media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        if (o1.getTitle() == o2.getTitle()) {
            return (o1.getCost() < o2.getCost() ? 1 : -1);
        }
        return (o2.getTitle().compareTo(o1.getTitle()));
    }
}
