package StoreTest;

import Store.Store;
import Media.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc media1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addMedia(media1);

        DigitalVideoDisc media2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addMedia(media2);

        DigitalVideoDisc media3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addMedia(media3);

        store.removeMedia(media3);
    }

}
