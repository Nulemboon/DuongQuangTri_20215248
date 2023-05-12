package AIMS;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
            if (qtyOrdered == 19) {
                System.out.println("The cart is almost full");
            } else if (qtyOrdered == 20) {
                System.out.println("The cart is full");
            }
        } else {
            System.out.println("Cannot add! The cart is full");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) return;
        int mark = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                mark = i;
            }
        }
        if (mark == -1) {
            System.out.println("The disc is not available");
            return;
        }
        for (int i = mark; i < qtyOrdered; i++) {
            itemsOrdered[i] = itemsOrdered[i + 1];
        }
        qtyOrdered--;
        itemsOrdered[qtyOrdered] = null;
        System.out.println("The disc has been removed");
    }
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void printCart() {
        System.out.println("********************CART********************");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("********************************************");
    }
}