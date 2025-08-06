package day_2;
//Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
//{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
import java.util.Arrays;
import java.util.Scanner;

public class Graduation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int key = sc.nextInt();

        int[] years = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
        Arrays.sort(years); 

        int left = 0;
        int right = years.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (years[mid] == key) {
                found = true;
                break;
            } else if (years[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (found)
            System.out.println("Record exists");
        else
            System.out.println("Record doesn't exist");

        sc.close();
    }
}

