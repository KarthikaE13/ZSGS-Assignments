package day_4;
import java.util.Scanner;

public class MyString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        System.out.println("Enter start index:");
        int start = Integer.parseInt(sc.nextLine());

        System.out.println("Enter end index:");
        int end = Integer.parseInt(sc.nextLine());

        System.out.println("Enter index to find char:");
        int i = Integer.parseInt(sc.nextLine());

        System.out.println("Enter a character to find in first string:");
        char letter = sc.nextLine().charAt(0);

        System.out.println("Enter a character to replace:");
        char oldChar = sc.nextLine().charAt(0);

        System.out.println("Enter new character:");
        char newChar = sc.nextLine().charAt(0);

        System.out.println("Enter substring to check:");
        String sub = sc.nextLine();

        findLength(s1);
        convertUppercase(s1);
        convertLowercase(s1);
        checkEqual(s1, s2);
        doConcat(s1, s2);
        findSubstring(s1, start, end);
        findchar(s1, i);
        findIndexofChar(s1, letter);
        containsSubstring(s1, sub);
        replaceChar(s1, oldChar, newChar);
    }

    public static int findLength(String s1) {
        int l = 0;
        char[] ch = s1.toCharArray();
        for (char c : ch) {
            l++;
        }
        System.out.println("The length: " + l);
        return l;
    }

    public static void convertUppercase(String s1) {
        char[] ch = s1.toCharArray();
        String res = "";
        for (char c : ch) {
            if (c >= 'a' && c <= 'z') {
                res += (char) (c - 32);
            } else {
                res += c;
            }
        }
        System.out.println("UpperCase: " + res);
    }

    public static void convertLowercase(String s1) {
        char[] ch = s1.toCharArray();
        String res = "";
        for (char c : ch) {
            if (c >= 'A' && c <= 'Z') {
                res += (char) (c + 32);
            } else {
                res += c;
            }
        }
        System.out.println("LowerCase: " + res);
    }

    public static void checkEqual(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        int lenA = findLength(s1);
        int lenB = findLength(s2);

        if (lenA != lenB) {
            System.out.println("Not equal");
            return;
        }

        int xor = 0;
        for (int i = 0; i < lenA; i++) {
            xor = xor ^ a[i] ^ b[i];
        }

        if (xor == 0)
            System.out.println("Both are equal");
        else
            System.out.println("Not equal");
    }

    public static void doConcat(String s1, String s2) {
        System.out.print("Concatenated string: ");
        for (char c : s1.toCharArray()) {
            System.out.print(c);
        }
        for (char c : s2.toCharArray()) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void findchar(String s1, int i) {
        char[] ch = s1.toCharArray();
        int len = findLength(s1);
        if (i >= 0 && i < len) {
            System.out.println("Character at index " + i + " is: " + ch[i]);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void findSubstring(String s1, int a, int b) {
        char[] ch = s1.toCharArray();
        int len = findLength(s1);

        if (a < 0 || b > len || a >= b) {
            System.out.println("Invalid start or end index.");
            return;
        }

        String result = "";

        for (int i = a; i < b; i++) {
            result += ch[i];
        }

        System.out.println("Substring from index " + a + " to " + (b - 1) + " is: " + result);
    }

    public static void findIndexofChar(String s1, char letter) {
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == letter) {
                System.out.println("Character '" + letter + "' found at index: " + i);
                return;
            }
        }
        System.out.println("Character '" + letter + "' not found.");
    }

    public static void containsSubstring(String s1, String sub) {
        char[] main = s1.toCharArray();
        char[] pattern = sub.toCharArray();

        boolean found = false;
        for (int i = 0; i <= main.length - pattern.length; i++) {
            int j = 0;
            while (j < pattern.length && main[i + j] == pattern[j]) {
                j++;
            }
            if (j == pattern.length) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Substring is present.");
        else
            System.out.println("Substring is not present.");
    }

    public static void replaceChar(String s1, char oldChar, char newChar) {
        char[] ch = s1.toCharArray();
        String result = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == oldChar)
                result += newChar;
            else
                result += ch[i];
        }
        System.out.println("After replacement: " + result);
    }
}

