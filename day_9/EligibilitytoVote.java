package day_9;
//. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters.
import java.util.Scanner;
 class UnderEighteenException extends RuntimeException{
	public UnderEighteenException(String message) {
		super(message);
	}
}

public class EligibilitytoVote {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age");
		int age= sc.nextInt();
		try {
			check(age);
			System.out.println("You are eligible to vote");
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
		public static void check(int age) {
			if (age<=17)
				throw new UnderEighteenException("Your are under 18 age");
		}
	}


