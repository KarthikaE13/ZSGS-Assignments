package day_2;

import java.util.Scanner;

public class StudentMark {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStudents = 10;
        int[] rollNos = new int[numStudents];
        int[][] marks = new int[numStudents][3]; // 3 subjects
        int[] total = new int[numStudents];
        double[] average = new double[numStudents];

        // Input roll numbers and marks
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter roll number for student " + (i + 1) + ":");
            rollNos[i] = sc.nextInt();

            System.out.println("Enter marks for 3 subjects:");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }

            average[i] = total[i] / 3.0;
        }

       
        System.out.println("\nRoll No\tTotal Marks\tAverage");
        System.out.println("-----------------------------------");

        // Print each student's result
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t%d\t\t%.2f\n", rollNos[i], total[i], average[i]);
        }

        sc.close();
    }
}
