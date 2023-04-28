package AIMS;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            if (qtyOrdered == 19) {
                System.out.println("The cart is almost full");
            }
            System.out.println("The disc has been added");
        } else {
            System.out.println("Cannot add! The cart is full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) return;
        int mark = -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
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
}