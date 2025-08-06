package day_2;

public class FibonacciArray {
    public static void main(String[] args) {
        int[] fib = new int[30]; 

        // First two terms
        fib[0] = 0;
        fib[1] = 1;

       
        for (int i = 2; i < 30; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

       
        System.out.println("First 30 Fibonacci numbers:");
        for (int i = 0; i < 30; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
