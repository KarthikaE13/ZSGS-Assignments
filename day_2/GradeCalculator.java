package day_2;
//Use both if and switch case statement  as two ways to find the grade of a student.
//Percent>=85 && Percent<=100 Grade ‘A’
//Percent>=70 Grade ‘B’
//Percent>=50 Grade ‘C’
//otherwise print ”Fail”

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        int percent = sc.nextInt();

      
        System.out.print("Using if-else: ");
        if (percent >= 85 && percent <= 100) {
            System.out.println("Grade A");
        } else if (percent >= 70) {
            System.out.println("Grade B");
        } else if (percent >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        
        System.out.print("Using switch-case: ");
        switch (percent / 10) {
            case 10:  
            case 9:   
            case 8:   
                System.out.println("Grade A");
                break;
            case 7:   
                System.out.println("Grade B");
                break;
            case 6:   
            case 5:   
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Fail");
        }

        sc.close();
    }
}
