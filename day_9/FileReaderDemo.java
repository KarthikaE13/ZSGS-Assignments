package day_9;
//Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally
import java.io.*;

public class FileReaderDemo {

    public static void readFile(String fileName) {
        BufferedReader reader = null;

        try {
            // Try to open and read the file
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("Error: I/O problem - " + e.getMessage());
        } 
        finally {
            try {
                if (reader != null) {
                    reader.close(); 
                    System.out.println("File closed.");
                }
            } catch (IOException e) {
                System.out.println("Error while closing the file.");
            }
        }
    }

    public static void main(String[] args) {
        
        readFile("sample.txt");
    }
}

