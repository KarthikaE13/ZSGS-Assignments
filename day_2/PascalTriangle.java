public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int i = 0;

        do {
            int space = 1;
            int j = 0;
            // Print spaces
            do {
                System.out.print(" ");
                space++;
            } while (space <= rows - i);

            int number = 1;
            j = 0;

            // Print numbers in each row
            do {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
                j++;
            } while (j <= i);

            System.out.println();
            i++;
        } while (i < rows);
    }
}


