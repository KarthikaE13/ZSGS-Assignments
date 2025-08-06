package day_9;

// Create a program where try block contains a return statement. Ensure that finally block executes before the method returns. Show this with output.
public class FinallyBlockDemo {
	public static int print() {
		try {
			System.out.println("I am try block");
			return 100;
		}
		finally {
			System.out.println("I am finally block"); // executed before return
		//return 1000;//When both try and finally have return statements, the finally return value overrides the one in try.
		}
	}

	public static void main(String[] args) {
		int a = print();
		System.out.println(a);
		
		
		

	}

}
