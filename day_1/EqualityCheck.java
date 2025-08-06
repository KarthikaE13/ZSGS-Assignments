package day_1;
//Write a program to check whether the given two numbers are equal or not w/o using comparison operator?
public class EqualityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 100;
		int b=1000;
		int c= a^b;
		switch (c){
		case 0:
			System.out.println("Equal");
	break; 
		default:
			System.out.println("Not Equal");
			break; 
	}

}
}
