package Store;
import Media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        itemInStore.add(media);
        System.out.println("Media added");
    }

    public void removeMedia(Media media) {
        for (int i = 0; i < itemInStore.size(); i++) {
            if (itemInStore.get(i).equals(media)) {
                itemInStore.remove(i);
                System.out.println("Media removed");
                return;
            }
        }
        System.out.println("Media not available");
    }

    public ArrayList<Media> searchStore(String title) {
        int flag = 0;
        ArrayList<Media> list = new ArrayList<Media>();

        for (int i = 0; i < itemInStore.size(); i++) {
            if (itemInStore.get(i).isMatch(title)) {
                flag++;
                list.add(itemInStore.get(i));
                System.out.println("Search result: " + itemInStore.get(i).toString());
            }
        }
        if (flag == 0) System.out.println("Search result: Media title not available");
        return list;
    }

    public void printStore() {
        if (itemInStore.size() > 0) {
            System.out.println("STORE\n----------------------------------------------------------------------------------------------");
            for (Media m : itemInStore) {
                System.out.println(m.toString());
            }
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("Total number of items in store: " + itemInStore.size());
        } else System.out.println("No item in store");
    }
}
