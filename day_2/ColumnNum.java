package day_2;
//Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
//‌
//For example:
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28

import java.util.Scanner;

public class ColumnNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the column number: ");
        int columnNumber = sc.nextInt();

        StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; 
            int remain = columnNumber % 26;
            char ch = (char) ('A' + remain);
            result.append(ch);
            columnNumber /= 26;
        }

        System.out.println("Excel Column Title: " + result.reverse().toString());
    }
}
