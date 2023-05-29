package Aims;

import Cart.Cart;
import Media.*;
import Store.Store;

import java.util.*;

public class Aims {
    static Cart cart = new Cart();
    static Store store = new Store();
    static Scanner sc = new Scanner(System.in);
    public static void showMenu() {
        int option = -1;
        while (option != 0) {
            System.out.println("AIMS: ");

            System.out.println("--------------------------------");

            System.out.println("1. View store");

            System.out.println("2. Update store");

            System.out.println("3. See current cart");

            System.out.println("0. Exit");

            System.out.println("--------------------------------");

            System.out.println("Please choose a number: 0-1-2-3");

            option = sc.nextInt();
            sc.nextLine();

            switch(option) {
                case 1: {
                    store.printStore();
                    storeMenu();
                    break;
                }
                case 2: {
                    updateStore();
                    break;
                }
                case 3: {
                    cartMenu();
                    break;
                }
                case 0: {
                    System.exit(1);
                }
                default: {
                    System.out.println("Invalid input!! Re-enter please");
                }
            }
        }
    }

    public static void storeMenu() {
        int option = -1;
        while (option != 0) {

            System.out.println("Options: ");

            System.out.println("--------------------------------");

            System.out.println("1. See a media’s details");

            System.out.println("2. Add a media to cart");

            System.out.println("3. Play a media");

            System.out.println("4. See current cart");

            System.out.println("0. Back");

            System.out.println("--------------------------------");

            System.out.println("Please choose a number: 0-1-2-3-4");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    mediaDetailsMenu();
                    break;
                }
                case 2: {
                    addCart();
                    break;
                }
                case 3: {
                    playMedia();
                    break;
                }
                case 4: {
                   cartMenu();
                   break;
                }
                case 0: {
                    return;
                }
                default: {
                    System.out.println("Invalid input!! Re-enter please");
                }
            }
        }
    }

    public static Media inputTitle() {
        System.out.println("Input the title you are looking for: ");
        String title = sc.nextLine();
        System.out.println("Matching results: ");
        ArrayList<Media> list = store.searchStore(title);
        if (list.size() > 0) {
            System.out.println("-----------------------------------\nChoose between: 1 - " + list.size());
            int option = sc.nextInt();
            sc.nextLine();
            return list.get(option - 1);
        } else {
            System.out.println("No matching results!");
            return null;
        }
    }

    public static void mediaDetailsMenu() {
        Media m = inputTitle();
        if (m == null) return;

        int option = -1;
        while (option != 0) {

            System.out.println("Options: ");

            System.out.println("--------------------------------");

            System.out.println("1. Add to cart");
            if (m instanceof  CompactDisc || m instanceof DigitalVideoDisc) {
                System.out.println("2. Play");

                System.out.println("0. Back");

                System.out.println("--------------------------------");

                System.out.println("Please choose a number: 0-1-2");
            } else {
                System.out.println("0. Back");

                System.out.println("--------------------------------");

                System.out.println("Please choose a number: 0-1");
            }

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    cart.addMedia(m);
                    break;
                }
                case 2: {
                    if (m instanceof  CompactDisc || m instanceof DigitalVideoDisc) {
                        System.out.println("Invalid input!! Re-enter please");
                        continue;
                    }
                    m.play();
                    break;
                }
                case 0: {
                    return;
                }
                default: {
                    System.out.println("Invalid input!! Re-enter please");
                }
            }
        }
    }

    public static void updateStore() {
        int option = -1;
        while (option != 0) {
            System.out.println("Options: ");

            System.out.println("--------------------------------");

            System.out.println("1. Add item");

            System.out.println("2. Remove item");

            System.out.println("0. Back");

            System.out.println("--------------------------------");

            System.out.println("Please choose a number: 0-1-2");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    System.out.println("Choose media type: ");

                    System.out.println("--------------------------------");

                    System.out.println("1. Digital Video Disc");

                    System.out.println("2. Book");

                    System.out.println("3. Compact Disc");

                    System.out.println("--------------------------------");

                    System.out.println("Please choose a number: 1-2-3");

                    int type = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Title: ");
                    String title = sc.nextLine();
                    System.out.println("Category: ");
                    String category = sc.nextLine();
                    System.out.println("Cost: ");
                    float cost = sc.nextFloat();

                    switch (type) {
                        case 1: {
                            System.out.println("Length: ");
                            int length = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Director: ");
                            String director = sc.nextLine();

                            store.addMedia(new DigitalVideoDisc(title, category, director, length, cost));
                            break;
                        }

                        case 2: {
                            store.addMedia(new Book(title, category, cost));
                            break;
                        }

                        case 3: {
                            System.out.println("Artist: ");
                            String artist = sc.nextLine();

                            store.addMedia(new CompactDisc(title, category, cost, artist));
                            break;
                        }

                        default: {
                            System.out.println("Invalid input");
                        }
                    }
                    break;
                }

                case 2: {
                    Media m = inputTitle();
                    store.removeMedia(m);
                    break;
                }
                case 0: return;

                default: {
                    System.out.println("Invalid input! Re-enter please");
                }
            }
        }
    }

    public static void addCart() {
        Media m = inputTitle();

        if (m == null) return;

        cart.addMedia(m);
    }

    public static void playMedia() {
        Media m = inputTitle();

        if (m == null) return;
        if (m instanceof  CompactDisc || m instanceof DigitalVideoDisc) {
            m.play();
        } else {
            System.out.println("Media cannot be played!");
        }
    }
    public static void cartMenu() {
        int option = -1;
        while (option != 0) {
            System.out.println("Options: ");

            System.out.println("--------------------------------");

            System.out.println("1. Filter medias in cart");

            System.out.println("2. Sort medias in cart");

            System.out.println("3. Remove media from cart");

            System.out.println("4. Play a media");

            System.out.println("5. Place order");

            System.out.println("0. Back");

            System.out.println("--------------------------------");

            System.out.println("Please choose a number: 0-1-2-3-4-5");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    System.out.println("Options: ");

                    System.out.println("--------------------------------");

                    System.out.println("1. Filter medias by id");

                    System.out.println("2. Filter medias by title");

                    System.out.println("--------------------------------");

                    System.out.println("Please choose a number: 1 - 2");

                    int opt = sc.nextInt();
                    sc.nextLine();

                    ArrayList<Media> list = cart.getItemsOrdered();

                    switch (opt) {
                        case 1: {
                            Collections.sort(list, Media.COMPARE_BY_TITLE_COST);
                            break;
                        }
                        case 2: {
                            Collections.sort(list, Media.COMPARE_BY_ID);
                            break;
                        }
                        default: {
                            System.out.println("Invalid input");
                        }

                    }
                    for (Media m : list) {
                        System.out.println(m.toString());
                    }
                    break;
                }
                case 2: {
                    System.out.println("Options: ");

                    System.out.println("--------------------------------");

                    System.out.println("1. Sort medias by title - cost");

                    System.out.println("2. Filter medias by cost - title");

                    System.out.println("--------------------------------");

                    System.out.println("Please choose a number: 1 - 2");

                    int opt = sc.nextInt();
                    sc.nextLine();

                    ArrayList<Media> list = cart.getItemsOrdered();

                    switch (opt) {
                        case 1: {
                            Collections.sort(list, Media.COMPARE_BY_TITLE_COST);
                            break;
                        }
                        case 2: {
                            Collections.sort(list, Media.COMPARE_BY_COST_TITLE);
                            break;
                        }
                        default: {
                            System.out.println("Invalid input");
                        }

                    }
                    for (Media m : list) {
                        System.out.println(m.toString());
                    }
                    break;
                }
                case 3: {
                    ArrayList<Media> list = cart.getItemsOrdered();
                    cart.printCart();
                    System.out.println("-----------------------------------\nChoose between: 1 - " + list.size());
                    int opt = sc.nextInt();
                    sc.nextLine();
                    cart.removeMedia(list.get(opt - 1));
                    break;
                }
                case 4: {
                    ArrayList<Media> list = cart.getItemsOrdered();
                    cart.printCart();
                    System.out.println("-----------------------------------\nChoose between: 1 - " + list.size());
                    int opt = sc.nextInt();
                    sc.nextLine();
                    list.get(opt - 1).play();
                    break;
                }
                case 5: {
                    System.out.println("Ordered Succesfully");
                    cart = new Cart();
                    showMenu();
                    break;
                }
                case 0: {
                    return;
                }
                default: {
                    System.out.println("Invalid input!! Re-enter please");
                }
            }
        }

    }

    public static void main (String[] args) {
        showMenu();
    }
}