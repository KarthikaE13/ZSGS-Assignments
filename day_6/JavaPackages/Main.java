import arithmetic.Calculator;
import stringutils.StringHelper;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.sub(10, 5));
        System.out.println("Multiplication: " + calc.mul(10, 5));
        System.out.println("Division: " + calc.div(10, 5));
        System.out.println("Modulo: " + calc.mod(10, 5));

        StringHelper helper = new StringHelper();
        System.out.println("Concatenate: " + helper.concat("Hello", "World"));
        System.out.println("Reverse: " + helper.reverse("Karthika"));
        System.out.println("Length: " + helper.length("Java"));
    }
}

