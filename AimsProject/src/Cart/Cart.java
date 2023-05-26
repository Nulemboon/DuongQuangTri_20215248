package Cart;
import Media.Media;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("Item has been added");
            if (itemsOrdered.size() == 19) {
                System.out.println("The cart is almost full");
            } else if (itemsOrdered.size() == 20) {
                System.out.println("The cart is full");
            }
        } else {
            System.out.println("Cannot add! The cart is full");
        }
    }
    public void addMedia(Media[] mediaList) {
        for (Media media : mediaList) {
            addMedia(media);
        }
    }
    public void addMedia(Media media1, Media media2) {
        addMedia(media1);
        addMedia(media2);
    }
    public void removeMedia(Media media) {
        if (itemsOrdered.size() == 0) return;
        if (itemsOrdered.indexOf(media) != -1) {
            itemsOrdered.remove(media);
            System.out.println("Item has been removed");
        } else System.out.println("Item is not in your cart");

    }
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }

    public void printCart() {
        System.out.println("********************CART********************");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println(itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("********************************************");
    }

    public void searchCart(int id) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (id == itemsOrdered.get(i).getId()) {
                System.out.println("Search result: " + itemsOrdered.get(i).toString());
                return;
            }
        }
        System.out.println("Search result: DVD id not available");
    }

    public void searchCart(String title) {
        int flag = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).isMatch(title)) {
                flag++;
                System.out.println("Search result: " + itemsOrdered.get(i).toString());
            }
        }
        if (flag == 0) System.out.println("Search result: DVD title not available");
    }
}