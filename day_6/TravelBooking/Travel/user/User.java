package travel.user;

import travel.booking.Ticket;

public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bookTicket(String ticketId, String destination, double fare) {
        System.out.println("User: " + name + ", Age: " + age);
        Ticket ticket = new Ticket(ticketId, destination, fare); // Access Ticket from another package
        ticket.displayTicket();
    }
}

