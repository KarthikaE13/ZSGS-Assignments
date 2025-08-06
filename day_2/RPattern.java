import java.util.Scanner;

public class RPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of R (recommended >= 5): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("R"); // left vertical line

            for (int j = 0; j < n - 2; j++) {
                if ((i == 0 || i == n / 2)) {
                    System.out.print("R"); // top and middle horizontal lines
                } else if (j == n - 3 && i < n / 2) {
                    System.out.print("R"); // top half right vertical line
                } else if (j == i - 1 && i > n / 2) {
                    System.out.print("R"); // diagonal leg
                } else {
                    System.out.print(" ");
                }
            }

            if (i != 0 && i != n / 2) {
                System.out.print(" "); // spacing for alignment
            }

            System.out.println();
        }

        sc.close();
    }
}


