package day_2;
import java.util.Scanner;

public class BinaryAdder {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = bitA + bitB + carry;

            result.append(sum % 2);  
            carry = sum / 2;         
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter st 1");
    	String a1= sc.nextLine();
    	System.out.println("Enter st 2");
    	String b1=sc.nextLine();
        
        System.out.println("Sum: " + addBinary(a1, b1)); 

        
    }
}
