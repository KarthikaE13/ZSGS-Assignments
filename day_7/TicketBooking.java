package day_7;
import java.util.Scanner;
abstract class Ticket{
	abstract void bookTicket();
	String name;
	String pickupPoint;
	String dropPoint;
	String dateOfJourney;
	Ticket(String name,String pickupPoint,String dropPoint,String dateOfJourney){
		this.name=name;
		this.pickupPoint=pickupPoint;
		this.dropPoint=dropPoint;
		this.dateOfJourney=dateOfJourney;
	}
	
}
class BusTicket extends Ticket{
	String seatType;
	BusTicket(String name,String pickupPoint,String dropPoint,String dateOfJourney,String seatType){
		super(name, pickupPoint, dropPoint, dateOfJourney);
        this.seatType = seatType;
	}
	void bookTicket() {
		System.out.println("Booking Bus Ticket...");
        System.out.println("Passenger Name: " + name);
        System.out.println("Pickup Point: " + pickupPoint);
        System.out.println("Drop Point: " + dropPoint);
        System.out.println("Date of Journey: " + dateOfJourney);
        System.out.println("Seat Type: " + seatType);
        System.out.println(" Bus Ticket Booked Successfully!");
		
	}
}
class TrainTicket extends Ticket{
	String trainClass;
	TrainTicket(String name,String pickupPoint,String dropPoint,String dateOfJourney,String trainClass){
		super(name, pickupPoint, dropPoint, dateOfJourney);
        this.trainClass = trainClass;
	}
	
		void bookTicket() {
			System.out.println("Booking Bus Ticket...");
	        System.out.println("Passenger Name: " + name);
	        System.out.println("Pickup Point: " + pickupPoint);
	        System.out.println("Drop Point: " + dropPoint);
	        System.out.println("Date of Journey: " + dateOfJourney);
	        System.out.println("Class Type: " +trainClass);
	        System.out.println(" Train Ticket Booked Successfully!");
			
		}
		
	}

class FlightTicket extends Ticket{
	String airLine;
	FlightTicket(String name,String pickupPoint,String dropPoint,String dateOfJourney,String airLine){
		super(name, pickupPoint, dropPoint, dateOfJourney);
        this.airLine = airLine;
	}
	void bookTicket() {
		System.out.println("Booking Flight Ticket...");
        System.out.println("Passenger Name: " + name);
        System.out.println("Pickup Point: " + pickupPoint);
        System.out.println("Drop Point: " + dropPoint);
        System.out.println("Date of Journey: " + dateOfJourney);
        System.out.println("airLine Type: " +airLine);
        System.out.println(" Flight Ticket Booked Successfully!");
	}
}

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket t = null;

        // Common input
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Pickup Point: ");
        String pickup = sc.nextLine();

        System.out.print("Enter Drop Point: ");
        String drop = sc.nextLine();

        System.out.print("Enter Date of Journey (dd/mm/yyyy): ");
        String date = sc.nextLine();

        
        System.out.println("\nChoose Mode of Travel:");
        System.out.println("1. Bus");
        System.out.println("2. Train");
        System.out.println("3. Flight");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter Seat Type (Sleeper/Seater): ");
                String seatType = sc.nextLine();
                t = new BusTicket(name, pickup, drop, date, seatType);
                break;

            case 2:
                System.out.print("Enter Train Class (AC/Non AC): ");
                String trainClass = sc.nextLine();
                t = new TrainTicket(name, pickup, drop, date, trainClass);
                break;

            case 3:
                System.out.print("Enter Airline Name: ");
                String airline = sc.nextLine();
                t = new FlightTicket(name, pickup, drop, date, airline);
                break;

            default:
                System.out.println(" Invalid choice.");
                System.exit(0);
        }

        t.bookTicket();
    }
}