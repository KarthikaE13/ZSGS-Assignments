package day_11;
//Write a Java program to read the contents of a text file and display it on the console.
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class FileReadDisplay {

	public static void main(String[] args) {
		File file= new File("/home/karthika/Desktop/java/sample.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
				FileWriter fw= new FileWriter(file);
				fw.write("Hi,Hello!!");
				fw.flush();
				fw.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		try {
			FileReader fr = new FileReader(file);
			int ch;
			while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
			}
			fr.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
      
	}

}
