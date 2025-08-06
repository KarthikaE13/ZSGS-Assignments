package day_2;
import java.util.Scanner;


public class StringAddition{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter string 1");
String s1= sc.nextLine();
int n1=stringtoInteger(s1);
System.out.println("Enter string 2");
String s2= sc.nextLine();
int n2=stringtoInteger(s2);
int sum = n1+n2;
System.out.println(sum);
}
public static int stringtoInteger(String str){
int number=0;
for(int i=0 ;i<str.length();i++){
number=number*10 +(str.charAt(i)-'0');
}
return number;
}
}

