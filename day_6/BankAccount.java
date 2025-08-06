package day_6;

import java.util.Scanner;

public class BankAccount {
	private int  accountNum;
	private String name;
	private double balance;
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum=accountNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        return balance;
    }
	 public double withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Invalid or insufficient balance.");
	        }
	        return balance;
	    }
	 public void display() {
	        System.out.println("\nAccount Details:");
	        System.out.println("Account Number: " + accountNum);
	        System.out.println("Account Holder: " + name);
	        System.out.println("Balance: ₹" + balance);
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount ac= new BankAccount();
		ac.setAccountNum(123);
		ac.setName("Karthi");
		ac.setBalance(1000);
		System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        ac.deposit(dep);

        System.out.print("Enter withdrawal amount: ");
        double wd = sc.nextDouble();
        ac.withdraw(wd);

        ac.display();
		
	}

}
