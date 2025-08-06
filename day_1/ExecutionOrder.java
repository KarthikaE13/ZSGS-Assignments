package day_1;
//Write a program that illustrate the execution order of static block and initializer block?

public class ExecutionOrder {

    // Static block
    static {
        System.out.println("Static Block: Executed once when the class is loaded.");
    }

    // Instance initializer block
    {
        System.out.println("Initializer Block: Executed every time an object is created, before constructor.");
    }

    // Constructor
    public ExecutionOrder() {
        System.out.println("Constructor: Executed after the initializer block.");
    }

    public static void main(String[] args) {
        System.out.println("Main Method: Program starts here.");

        System.out.println("\nCreating first object:");
        ExecutionOrder obj1 = new ExecutionOrder();

        System.out.println("\nCreating second object:");
        ExecutionOrder obj2 = new ExecutionOrder();
    }
}
