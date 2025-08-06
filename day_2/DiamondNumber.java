public class DiamondNumber {
    public static void main(String[] args) {
        int num = 1;
        int i = 1;

        // Upper half (lines 1 to 3)
        while (i <= 3) {
            int space = 1;
            while (space <= 3 - i) {
                System.out.print(" ");
                space++;
            }

            int j = 1;
            while (j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }

            System.out.println();
            i++;
        }

        // Lower half (lines 4 to 5)
        i = 2;
        while (i >= 1) {
            int space = 1;
            while (space <= 3 - i) {
                System.out.print(" ");
                space++;
            }

            int j = 1;
            while (j <= i) {
                System.out.print(num + " ");
                num++;
                j++;
            }

            System.out.println();
            i--;
        }
    }
}

