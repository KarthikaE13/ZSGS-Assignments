package day_1;
//Write a program to find the first set bit of a number?
public class FirstSetBit {
    public static void main(String[] args) {
        int num = 18; // Example: 18 in binary is 10010

        int position = 1;

        // Find the first set bit
        while ((num & 1) == 0 && num > 0) {
            num = num >> 1;
            position++;
        }

        if (num == 0) {
            System.out.println("No set bits found (number is 0).");
        } else {
            System.out.println("The first set bit is at position: " + position);
        }
    }
}


