package day_2;
// Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
import java.util.Scanner;
public class AddOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= 10;
		int[] ar= new int[n];
		
System.out.println("Enter the elements");
for(int i=0;i<n;i++) {
	ar[i]=sc.nextInt();	
}
	int res= FindSum(ar);
	System.out.println(res);

	}
	public static int FindSum(int[] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2!=0)
				sum+=ar[i];
		}
		return sum;
	}

}
