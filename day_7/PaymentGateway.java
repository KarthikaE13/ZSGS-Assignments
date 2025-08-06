package day_7;
//Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). 
//Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. 
//Write a main class where you can accept payment using different methods. 
import java.util.Scanner;
interface PaymentMethod{
	 void pay(double amount);
		

}
class CreditCardPayment implements PaymentMethod{
	public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
	
}
}
	
	class DebitCardPayment implements PaymentMethod {
	   
	    public void pay(double amount) {
	        System.out.println("Paid " + amount + " using Debit Card.");
	    }
	}
	
	 class UPIPayment implements PaymentMethod {
	    
	    public void pay(double amount) {
	        System.out.println("Paid " + amount + " using UPI.");
	    }
	}

	

	public class PaymentGateway {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        PaymentMethod method = null;

	        System.out.println("Enter amount to pay: ");
	        double amount = scanner.nextDouble();
	        scanner.nextLine(); // consume newline

	        System.out.println("Choose payment method:");
	        System.out.println("1. Credit Card");
	        System.out.println("2. Debit Card");
	        System.out.println("3. UPI");

	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                method = new CreditCardPayment();
	                break;
	            case 2:
	                method = new DebitCardPayment();
	                break;
	            case 3:
	                method = new UPIPayment();
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                System.exit(0);
	        }

	        method.pay(amount);
	        
	    }
	}


