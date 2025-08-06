package day_9;
import java.util.Scanner;
//custom exception for atm pin check with 3 conditions

public class AtmPincheck {
	 static class AtmException extends RuntimeException{
		public AtmException(String message) {
	        super(message);
		
	}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter pin");
		String pin = sc.nextLine();

        try {
            validatePin(pin);
            System.out.println("PIN is valid.");
        } catch(AtmException  e) {
            System.out.println("Invalid PIN: " + e.getMessage());
        }

	}
	public static void validatePin(String pin) {
		if (pin.length() != 4)
            throw new AtmException("PIN must be exactly 4 digits long.");

		for (char ch : pin.toCharArray()) {
            if (!Character.isDigit(ch))
                throw new AtmException("PIN must contain only numeric characters.");
        }

        if (pin.charAt(0) == '0')
            throw new AtmException("PIN must not start with 0.");
    }
		
	}




