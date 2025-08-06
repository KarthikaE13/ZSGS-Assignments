package day_8;
//Write a program to illustrate the usage of clone() and find out what kind of copy it will make.
//Author class (nested object)
class Author {
 String name;

Author(String name) {
    this.name = name;
 }
}

public class Book implements Cloneable {

 String title;
 double price;
 Author author; 

 Book(String title, double price, Author author) {
     this.title = title;
     this.price = price;
     this.author = author;
 }

 void display() {
     System.out.println("Title: " + title);
     System.out.println("Price: " + price);
     System.out.println("Author: " + author.name);
 }

 public Object clone() throws CloneNotSupportedException {
     return super.clone(); 
 }

 public static void main(String[] args) throws CloneNotSupportedException {
    Author author = new Author("Paulo Coelho");
     Book b1 = new Book("Alchemist", 500.01,author);
     Book b2 = (Book) b1.clone();

     System.out.println("Before modification:");
     b1.display();
     b2.display();

     // Modify original object and nested object
     //This is a shallow copy, but since the fields are primitive and immutable types, it behaves just like a deep copy in this case.

     b1.title = "The Secret"; 
     b1.price = 200.45;
    b1.author.name = "Rhonda Byrne"; 

     System.out.println("\nAfter modification:");
     b1.display();
     b2.display(); // b2.author.name is also changed — SHALLOW COPY!
 }
}
