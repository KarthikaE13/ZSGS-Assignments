package day_5;
//Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.

import java.util.Scanner;

class Travel {
    void bookTicket() {
        System.out.println("Booking a ticket...");
    }
}

class Bus extends Travel {
    void bookTicket() {
        System.out.println("Bus ticket booked!");
    }
}

class Train extends Travel {
    void bookTicket() {
        System.out.println("Train ticket booked!");
    }
}

class Flight extends Travel {
    void bookTicket() {
        System.out.println("Flight ticket booked!");
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose mode of travel:");
        System.out.println("1. Bus");
        System.out.println("2. Train");
        System.out.println("3. Flight");

        int choice = sc.nextInt();
        Travel t;

        if (choice == 1) {
            t = new Bus();
        } else if (choice == 2) {
            t = new Train();
        } else if (choice == 3) {
            t = new Flight();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        t.bookTicket(); 
        sc.close();
    }
}
