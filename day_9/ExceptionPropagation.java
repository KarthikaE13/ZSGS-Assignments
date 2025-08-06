package day_9;
// Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1.

public class ExceptionPropagation {
	public static void method1() {
		System.out.println("I am method1");
		try {
			method2();
		}
		catch(Exception e) {
			System.out.println("Cant divde by zero");
		}
	}
	public static void method2() {
		System.out.println("I am method2");
		method3();
		
	}
	public static void method3() {
		System.out.println("I am method3");
		int result=10/0;
	}

	public static void main(String[] args) {
		method1();
		
		System.out.println("End...");
	}

}
