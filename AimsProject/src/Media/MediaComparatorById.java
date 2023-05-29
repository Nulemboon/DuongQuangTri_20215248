package Media;

import java.util.Comparator;

public class MediaComparatorById implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        return (o1.getId() > o2.getId() ? 1 : 0);
    }
}
