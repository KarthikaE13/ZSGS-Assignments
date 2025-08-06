package day_8;

import java.util.*;

class Bookstore {
    int id;
    String name;
    String author;
    double price;

    public Bookstore(int id, String name, String author, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "[ " + id + ", " + name + ", " + author + ", " + price + " ]";
    }
}


class PriceComparator implements Comparator<Bookstore> {
    public int compare(Bookstore b1, Bookstore b2) {
        return Double.compare(b1.price, b2.price);
    }
}

class NameComparator implements Comparator<Bookstore> {
    public int compare(Bookstore b1, Bookstore b2) {
        return b1.name.compareTo(b2.name);
    }
}

class AuthorComparator implements Comparator<Bookstore> {
    public int compare(Bookstore b1, Bookstore b2) {
        return b1.author.compareTo(b2.author);
    }
}

class IdComparator implements Comparator<Bookstore> {
    public int compare(Bookstore b1, Bookstore b2) {
        return Integer.compare(b1.id, b2.id);
    }
}

public class Booksorter {
    public static void main(String[] args) {
        ArrayList<Bookstore> bookshelf = new ArrayList<>();
        bookshelf.add(new Bookstore(123, "The Secret", "Rhonda Byrne", 250.00));
        bookshelf.add(new Bookstore(934, "Alchemist", "Paulo Coelho", 299.00));
        bookshelf.add(new Bookstore(57, "Eat that Frog", "Brian Tracy", 400.00));
        bookshelf.add(new Bookstore(876, "Power of Subconscious Mind", "Joseph Murphy", 500.00));

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println(" Choose sorting option:");
            System.out.println("1. Sort by Price");
            System.out.println("2. Sort by Name");
            System.out.println("3. Sort by Author");
            System.out.println("4. Sort by ID");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Collections.sort(bookshelf, new PriceComparator());
                    System.out.println("Books sorted by Price:");
                    break;
                case 2:
                    Collections.sort(bookshelf, new NameComparator());
                    System.out.println("Books sorted by Name:");
                    break;
                case 3:
                    Collections.sort(bookshelf, new AuthorComparator());
                    System.out.println(" Books sorted by Author:");
                    break;
                case 4:
                    Collections.sort(bookshelf, new IdComparator());
                    System.out.println("Books sorted by ID:");
                    break;
                case 5:
                    exit = true;
                    System.out.println(" Exiting...");
                    continue;
                default:
                    System.out.println(" Invalid choice. Try again.");
                    continue;
            }

            System.out.println(bookshelf);
            }
        }

       
    }


