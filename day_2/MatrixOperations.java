package day_2;

import java.util.Scanner;

public class MatrixOperations {

    // Method to input matrix elements
    static void inputMatrix(int[][] A, int m, int n, Scanner sc) {
        System.out.println("Enter " + (m * n) + " elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display matrix
    static void displayMatrix(int[][] A, int m, int n) {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to calculate sum of all elements
    static void sumAll(int[][] A, int m, int n) {
        int sum = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                sum += A[i][j];
        System.out.println("Sum of all elements: " + sum);
    }

    // Method for row-wise sum
    static void rowWiseSum(int[][] A, int m, int n) {
        System.out.println("Row-wise Sum:");
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += A[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }
    }

    // Method for column-wise sum
    static void colWiseSum(int[][] A, int m, int n) {
        System.out.println("Column-wise Sum:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++) {
                colSum += A[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
    }

    // Method to display transpose
    static void transpose(int[][] A, int m, int n) {
        System.out.println("Transpose of matrix:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Main method with menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter columns (n): ");
        int n = sc.nextInt();

        int[][] A = new int[m][n];

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Input Matrix");
            System.out.println("2. Display Matrix");
            System.out.println("3. Sum of All Elements");
            System.out.println("4. Row-wise Sum");
            System.out.println("5. Column-wise Sum");
            System.out.println("6. Transpose");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: inputMatrix(A, m, n, sc); break;
                case 2: displayMatrix(A, m, n); break;
                case 3: sumAll(A, m, n); break;
                case 4: rowWiseSum(A, m, n); break;
                case 5: colWiseSum(A, m, n); break;
                case 6: transpose(A, m, n); break;
                case 7: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}
