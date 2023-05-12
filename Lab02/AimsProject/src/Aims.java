public class Aims {
    public static void main (String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);

        anOrder.removeDigitalVideoDisc(new DigitalVideoDisc("Aladin", "Animation", 18.99f));
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin", "Animation", 19f);
        anOrder.addDigitalVideoDisc(dvd4);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd5);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd6);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd7);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd8);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd9);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd10);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd11 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd11);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd12 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd12);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd13 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd13);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd14 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd14);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd15 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd15);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd16 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd16);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd17 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd17);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd18 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd18);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd19 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd19);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd20 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd20);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd21 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd21);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);
        DigitalVideoDisc dvd22 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd22);
        System.out.println("number of items in cart: " + anOrder.qtyOrdered);

        System.out.println("The total cost is: " + anOrder.totalCost());
    }
}