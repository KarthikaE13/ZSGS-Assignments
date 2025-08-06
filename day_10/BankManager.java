package day_10;

import java.util.ArrayList;

class Account {
    int accountNumber;
    String holderName;
    Double balance; 

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance; 
    }

    public void displayOriginalBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name   : " + holderName);
        System.out.println("Original Balance: ₹" + balance);
    }

    public void applyInterest(Double interestRate) {
        
        double updatedBalance = balance + (balance * interestRate / 100);
        balance = updatedBalance; 
    }

    public void displayNewBalance() {
        
        double newBalance = balance;
        System.out.println("New Balance after 5% interest: ₹" + newBalance);
        System.out.println("------------------------------------------");
    }
}

public class BankManager {
    public static void main(String[] args) {

        
        double rate = 5.0;
        Double interestRate = Double.valueOf(rate); 

    
        ArrayList<Account> accounts = new ArrayList<>();

        
        accounts.add(new Account(1001, "Karthika", 10000.0));
        accounts.add(new Account(1002, "Divya", 20000.0));
        accounts.add(new Account(1003, "Rahul", 15000.0));

       
        for (Account acc : accounts) {
            acc.displayOriginalBalance();         
            acc.applyInterest(interestRate);     
            acc.displayNewBalance();            
        }
    }
}
