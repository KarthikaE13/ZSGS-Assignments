package day_9;
import java.util.Scanner;
// Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and display a login failure message.

class AuthenticationException extends RuntimeException {
 public AuthenticationException(String message) {
     super(message);
 }
}




public class UsernameValid {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the user name: ");
     String username = sc.nextLine();

     System.out.print("Enter the password: ");
     String password = sc.nextLine();

     try {
         valid(username, password);
         System.out.println("Successful login");
     } catch (Exception e) {
         System.err.println("Login Failed: " + e.getMessage());
     }

     sc.close();
 }

 
 public static void valid(String u, String p) {
     if (!u.equals("karthi")) {
         throw new AuthenticationException("User name is invalid");
     }

     if (!p.equals("1234")) {
         throw new AuthenticationException("Password is incorrect");
     }
 }
}
