package day_9;
//Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.
import java.util.Scanner;
public class Numberformatexcep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b=0;
		try {
			 b = Integer.parseInt(a);
		}
		catch(NumberFormatException e) {
			System.out.println("Enter valid num");
		}
		System.out.println(b);
		System.out.println("End of the program");
		sc.close();

	}

}
