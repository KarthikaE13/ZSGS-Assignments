package day_2;

import java.util.Scanner;

public class SubSequenceCheck {

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s (subsequence): ");
        String s = sc.nextLine();

        System.out.print("Enter string t (main string): ");
        String t = sc.nextLine();

        sc.close();

        if (isSubsequence(s, t)) {
            System.out.println("Yes, \"" + s + "\" is a subsequence of \"" + t + "\".");
        } else {
            System.out.println("No, \"" + s + "\" is not a subsequence of \"" + t + "\".");
        }
    }
}
