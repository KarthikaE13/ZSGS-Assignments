package day_9;

public class VotingEligibility {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 0, 7}; // Array with length 6 (valid indices: 0 to 5)

        try {
            // Check quotient operation (this line will throw ArrayIndexOutOfBoundsException)
            int quotient = arr[7] / arr[4];  // arr[7] is invalid; arr[4] = 0 (could cause ArithmeticException)
            System.out.println("Quotient: " + quotient);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid index in the array.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }

        // Now check voting eligibility
        int age = 17;

        try {
            if (age >= 18) {
                System.out.println("Person is eligible to vote.");
            } else {
                throw new IllegalArgumentException("Person is not eligible to vote. Minimum age is 18.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Voting Eligibility Error: " + e.getMessage());
        }
    }
}
