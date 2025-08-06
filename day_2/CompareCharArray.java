package day_2;

public class CompareCharArray {

    public static void main(String[] args) {
        char[] X = {'m', 'n', 'o', 'p'};
        char[] Y = {'m', 'n', 'q', 'p'};

        boolean identical = true;

        
        if (X.length != Y.length) {
            identical = false;
        } else {
            // Compare each element
            for (int i = 0; i < X.length; i++) {
                if (X[i] != Y[i]) {
                    identical = false;
                    break;
                }
            }
        }

        // Print result
        if (identical) {
            System.out.println("The two arrays are IDENTICAL.");
        } else {
            System.out.println("The two arrays are NOT identical.");
        }
    }
}
