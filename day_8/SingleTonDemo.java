package day_8;
class Add{
	private static Add a = new Add();//private static instance of class
	
	private Add() { }// make a constructor private
	public static Add getInstance() { //public static method to return instance
		return a;
	}
	 public int add(int a, int b) {
	        return a + b;
}
}
public class SingleTonDemo {

	public static void main(String[] args) {
		// Add b = new Add();
		Add ad = Add.getInstance();
		 System.out.println("Sum: " + ad.add(4, 6));
		 
	}
		

	}


