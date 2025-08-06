package day_2;

import java.util.Scanner;

public class DetectCapitalUsage {

    public static boolean detectCapitalUse(String word) {
       
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        sc.close();

        if (detectCapitalUse(word)) {
            System.out.println("Correct usage of capital letters.");
        } else {
            System.out.println("Incorrect usage of capital letters.");
        }
    }
}
