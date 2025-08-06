package day_2;

import java.util.Scanner;

public class SumDigits {

   
    public static void print(int x[], int n) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int i = 0; i < n; i++) {
            int num = Math.abs(x[i]); // To handle negative numbers

            if (num >= 0 && num <= 9) {
                singleDigitSum += x[i];
            } else if (num >= 10 && num <= 99) {
                doubleDigitSum += x[i];
            }
        }

        System.out.println("Sum of single-digit elements: " + singleDigitSum);
        System.out.println("Sum of double-digit elements: " + doubleDigitSum);
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter " + len + " elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

       
        print(arr, len);

        sc.close();
    }
}
