package AIMS;


import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemInStore = new ArrayList<DigitalVideoDisc>();

    public void addDVD(DigitalVideoDisc disc) {
        itemInStore.add(disc);
        System.out.println("DVD added");
    }

    public void removeDVD(DigitalVideoDisc disc) {
        for (int i = 0; i < itemInStore.size(); i++) {
            if (itemInStore.get(i).equals(disc)) {
                itemInStore.remove(i);
                System.out.println("DVD removed");
                return;
            }
        }
        System.out.println("DVD not available");
    }
}
