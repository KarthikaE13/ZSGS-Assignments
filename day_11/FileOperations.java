package day_11;

import java.io.*;
import java.util.*;

public class FileOperations {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n----- File Operations Menu -----");
            System.out.println("1. Write content from user to file");
            System.out.println("2. Copy content from one file to another");
            System.out.println("3. Modify content of a file");
            System.out.println("4. Search for a word and count occurrences");
            System.out.println("5. Copy electronic products to CSV");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> writeUserContentToFile();
                case 2 -> copyFileContent();
                case 3 -> modifyFileContent();
                case 4 -> searchWordInFile();
                case 5 -> copyProductsToCSV();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
    }

    // Option a: Write content from user to a file
    public static void writeUserContentToFile() {
        try {
            System.out.print("Enter file name to write to: ");
            String fileName = sc.nextLine();
            FileWriter fw = new FileWriter(fileName, true);

            System.out.println("Enter content (type 'END' on new line to finish):");
            String line;
            while (!(line = sc.nextLine()).equals("END")) {
                fw.write(line + "\n");
            }
            fw.close();
            System.out.println("Content written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    // Option b: Copy content from one file to another
    public static void copyFileContent() {
        try {
            System.out.print("Enter source file: ");
            String source = sc.nextLine();
            System.out.print("Enter destination file: ");
            String dest = sc.nextLine();

            BufferedReader br = new BufferedReader(new FileReader(source));
            BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }

    // Option c: Modify content of a file
    public static void modifyFileContent() {
        try {
            System.out.print("Enter file name to modify: ");
            String fileName = sc.nextLine();

            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            // Read existing content
            List<String> lines = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();

            // Display current content
            System.out.println("Current content:");
            for (int i = 0; i < lines.size(); i++) {
                System.out.println((i + 1) + ": " + lines.get(i));
            }

            // Modify content
            System.out.print("Enter line number to modify: ");
            int lineNum = sc.nextInt();
            sc.nextLine(); // consume newline
            if (lineNum < 1 || lineNum > lines.size()) {
                System.out.println("Invalid line number.");
                return;
            }

            System.out.print("Enter new content: ");
            String newContent = sc.nextLine();
            lines.set(lineNum - 1, newContent);

            // Write back to file
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String modifiedLine : lines) {
                bw.write(modifiedLine);
                bw.newLine();
            }
            bw.close();

            System.out.println("File modified successfully.");

        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }

    // Option d: Search for a word and count its occurrences
    public static void searchWordInFile() {
        try {
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();
            System.out.print("Enter word to search: ");
            String word = sc.nextLine();

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+"); // split by non-word characters
                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            br.close();

            System.out.println("The word \"" + word + "\" occurred " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    // Option e: Read list of electronic products from txt and write to csv
    public static void copyProductsToCSV() {
        try {
            System.out.print("Enter source .txt file: ");
            String txtFile = sc.nextLine();
            System.out.print("Enter destination .csv file: ");
            String csvFile = sc.nextLine();

            BufferedReader br = new BufferedReader(new FileReader(txtFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile));

            bw.write("ProductID,ProductName,Price");
            bw.newLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(","); // assuming products in txt are comma-separated
                if (parts.length == 3) {
                    bw.write(parts[0].trim() + "," + parts[1].trim() + "," + parts[2].trim());
                    bw.newLine();
                }
            }

            br.close();
            bw.close();
            System.out.println("Products copied to " + csvFile);

        } catch (IOException e) {
            System.out.println("Error processing files.");
        }
    }
}
