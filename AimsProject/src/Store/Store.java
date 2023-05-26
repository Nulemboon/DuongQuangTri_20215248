package Store;
import Media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        itemInStore.add(media);
        System.out.println("Item added");
    }

    public void removeMedia(Media media) {
        for (int i = 0; i < itemInStore.size(); i++) {
            if (itemInStore.get(i).equals(media)) {
                itemInStore.remove(i);
                System.out.println("Item removed");
                return;
            }
        }
        System.out.println("Item not available");
    }
}
