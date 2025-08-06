public class WPattern {
    public static void main(String[] args) {
        int i = 1;
        int n = 3; // peak row

        // Increasing part
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("w ");
                j++;
            }
            System.out.println();
            i++;
        }

        // Decreasing part
        i = n - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("w ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}

