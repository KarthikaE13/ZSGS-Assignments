public class CommandLineStrings {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No strings passed through command-line.");
            return;
        }

        System.out.println("You entered:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("String " + (i + 1) + ": " + args[i]);
        }
    }
}

