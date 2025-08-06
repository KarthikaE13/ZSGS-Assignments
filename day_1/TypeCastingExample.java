package day_1;
//Write a program that illustrate the Explicit type casting?

public class TypeCastingExample {
    public static void main(String[] args) {
        
        // Declare a double (larger type)
        double doubleValue = 45.67;

        // Explicitly cast to int (smaller type)
        int intValue = (int) doubleValue;

        // Declare a long
        long longValue = 100000L;

        // Explicitly cast to short
        short shortValue = (short) longValue;

        // Declare a float
        float floatValue = 99.99f;

        // Explicitly cast to byte
        byte byteValue = (byte) floatValue;

        // Output the results
        System.out.println("Original double value: " + doubleValue);
        System.out.println("After casting to int: " + intValue);

        System.out.println("Original long value: " + longValue);
        System.out.println("After casting to short: " + shortValue);

        System.out.println("Original float value: " + floatValue);
        System.out.println("After casting to byte: " + byteValue);
    }
}
