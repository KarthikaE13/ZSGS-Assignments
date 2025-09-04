package day_11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Write a Java program that reads a file and prints the number of lines, words, and characters.
public class FileRead {

	public static void main(String[] args) {
		File file= new File("/home/karthika/Desktop/java/sample.txt");
		int lineCount=0;
		int wordCount=0;
		int charCount=0;
		try {
		FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null) {
        	lineCount++;
        	String[] words =line.trim().split(" ");
        	wordCount += words.length;
        	charCount += line.length();
        	
        }
        br.close();
        System.out.println("Number of lines is "+ lineCount);
        System.out.println("Number of words is "+ wordCount);
        System.out.println("Number of character is "+ charCount);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
