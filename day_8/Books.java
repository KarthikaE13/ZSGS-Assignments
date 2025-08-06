package day_8;
//3. Develop a Java program which illustrates the usage of Comparable Interface.

import java.util.ArrayList;
import java.util.Collections;

public class Books implements Comparable<Books> {
	int id;
    String name;
    String author;
    double price;
   

    public Books(int id,String name, String author, double price) {
    	this.id=id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    
   public int compareTo(Books b) {
        //return Double.compare(this.price, b.price); 
        //return this.name.compareTo(b.name); 
        return this.id-b.id;
    }

    
   public String toString() {
        return "[ "+ id +", "+ name + ", " + author + ", " + price + "]";
  }

    public static void main(String[] args) {
        ArrayList<Books> bookshelf = new ArrayList<>();
        bookshelf.add(new Books(123,"The Secret", "Rhonda Byrne", 250.00));
        bookshelf.add(new Books(934,"Alchemist", "Paulo Coelho", 299.00));
        bookshelf.add(new Books(57,"Eat that Frog", "Brian Tracy", 400.00));
        bookshelf.add(new Books(876,"Power of Subconscious Mind", "Joseph Murphy", 500.00));

        Collections.sort(bookshelf); 

        System.out.println("Books sorted by price:");
        System.out.println(bookshelf);

    }
}
