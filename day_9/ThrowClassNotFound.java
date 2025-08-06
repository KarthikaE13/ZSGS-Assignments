package day_9;
//Write a program to illustrate how to throw a ClassNotFoundException.

public class ThrowClassNotFound {

    public static void main(String[] args) {
        try {
            Class.forName("karthikaClass");
        } catch (ClassNotFoundException e) {
            System.err.println("No class file found! Recheck class name");
                    }

        System.out.println("Program continues...");
    }
}
