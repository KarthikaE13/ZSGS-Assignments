package day_9;
import java.util.Scanner;

public class StringException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int div =0;
		try {
		int i1= Integer.parseInt(s1);
		int i2=Integer.parseInt(s2);
		 div = i1/i2;
	
	}
//		catch(InputMismatchException e) {
//			System.out.println("Input mismatch error!");
//			
//		}
		catch(NumberFormatException e) {
			System.out.println("Please enter valid numbers!");
			
		}
		
		catch(ArithmeticException e) {
			System.out.println("Cant divide by zero");
		}
		catch(Exception e) {
			System.out.println("Error occured");
		}
		
		System.out.println(div);
		
		
	}

}
