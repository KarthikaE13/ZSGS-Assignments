package day_3;

public class Employeee {
    String name;
    int yearOfJoining;
    String address;

    // Constructor
    Employeee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // display() method using format
    public void display() {
        System.out.format("%-10s %-15d %-20s\n", name, yearOfJoining, address);
    }

    public static void main(String[] args) {
        // Create employee objects
        Employeee emp1 = new Employeee("Robert", 1994, "64C- WallsStreat");
        Employeee emp2 = new Employeee("Sam", 2000, "68D- WallsStreat");
        Employeee emp3 = new Employeee("John", 1999, "26B- WallsStreat");

        // Print table header
        System.out.format("%-10s %-15s %-20s\n", "Name", "Year of Joining", "Address");
        System.out.println("------------------------------------------------------");

        // Call display method for each employee
        emp1.display();
        emp2.display();
        emp3.display();
    }
}
