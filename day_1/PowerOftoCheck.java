package day_1;
//Write a program to check if a number is a power of 2?
public class PowerOftoCheck {
    public static void main(String[] args) {
        int num = 64;

        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is NOT a power of 2.");
        }
    }
}
