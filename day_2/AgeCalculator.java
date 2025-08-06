package day_2;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of array");
		int n= sc.nextInt();
		int[] ages= new int[n];
	System.out.println("Enter ages");
	for(int i=0;i<n;i++) {
		ages[i]=sc.nextInt();
	}
	int minor=0;
	int middleage=0;
	int senior=0;
	for(int i=0;i<n;i++) {
		if(ages[i]<18)
			minor++;
		else if(ages[i]>60)
			senior++;
		else middleage++;
	}
	System.out.println("minor : "+minor);
	System.out.println("middleage : "+middleage);
	System.out.println("senior : "+senior);

	}

}
