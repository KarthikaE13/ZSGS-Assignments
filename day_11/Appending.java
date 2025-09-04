package day_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Write a Java program to append a text read from the user to an existing file without overwriting the original content.

public class Appending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		File file = new File("/home/karthika/Desktop/java/sample.txt");
		try {
			FileWriter fw =new FileWriter(file,true);
			fw.write("\n");
			fw.write(input);
			System.out.println("Done writing");
			fw.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
				
		sc.close();

	}

}
