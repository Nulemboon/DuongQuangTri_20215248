package Aims;

import Cart.Cart;
import Media.*;

import java.util.ArrayList;
import java.util.Collections;

public class Aims {
    public static void main (String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);

        Book book1 = new Book ("Star Wars", "Science Fiction", 24.95f);
        book1.addAuthor("George Lucas");

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.90f);

        Book book2 = new Book("Dune", "Science Fiction", 10.9f);
        book2.addAuthor("Frank Herbert");

        CompactDisc cd = new CompactDisc("Greatest Hits", "Rock", 10.9f, "Journey");

        ArrayList<Media> mediaList = new ArrayList<Media>();
        mediaList.add(dvd1);
        mediaList.add(dvd2);
        mediaList.add(dvd3);
        mediaList.add(book1);
        mediaList.add(book2);
        mediaList.add(cd);

        Collections.sort(mediaList, Media.COMPARE_BY_COST_TITLE);

        anOrder.addMedia(mediaList);

        anOrder.printCart();
    }
}