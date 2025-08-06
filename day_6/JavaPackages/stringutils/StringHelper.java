package stringutils;

public class StringHelper {
    public String concat(String a, String b) {
        return a + b;
    }

    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public int length(String s) {
        return s.length();
    }
}

