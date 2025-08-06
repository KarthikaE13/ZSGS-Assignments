package day_7;
import java.util.Scanner;

class Customer {
    String name;
    int phoneNo;

    public Customer(String name, int phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Contact Number: " + phoneNo);
    }
}

class Account {
    int accountNo;
    String ifsc;
    double balance;

    public Account(int accountNo, String ifsc, double balance) {
        this.accountNo = accountNo;
        this.ifsc = ifsc;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("IFSC Code: " + ifsc);
        System.out.println("Balance: ₹" + balance);
    }
}

abstract class RBI {
    Customer c;
    Account a;
    
    final double minIr = 4.0;
    final double minBalance = 1000.0;
    final double maxWithdraw = 30000.0;

    public RBI(Customer c, Account a) {
        this.c = c;
        this.a = a;
    }

    public abstract double getInterestRate();
    public abstract double getWithdrawalLimit();

    public void displayRules() {
        System.out.println("\n--- RBI Guidelines ---");
        System.out.println("Minimum Interest Rate: " + minIr + "%");
        System.out.println("Minimum Balance: ₹" + minBalance);
        System.out.println("Maximum Withdrawal Limit: ₹" + maxWithdraw);
    }

    public void displayCustomerAccountInfo() {
        System.out.println("\n--- Customer Details ---");
        c.display();
        System.out.println("\n--- Account Details ---");
        a.display();
    }
}

class SBI extends RBI {
    public SBI(Customer c, Account a) {
        super(c, a);
    }

    public double getInterestRate() {
        return 5.5;
    }

    public double getWithdrawalLimit() {
        return 20000.0;
    }
}

class ICICI extends RBI {
    public ICICI(Customer c, Account a) {
        super(c, a);
    }

    public double getInterestRate() {
        return 7.5;
    }

    public double getWithdrawalLimit() {
        return 25000.0;
    }
}

class PNB extends RBI {
    public PNB(Customer c, Account a) {
        super(c, a);
    }

    public double getInterestRate() {
        return 4.2;
    }

    public double getWithdrawalLimit() {
        return 15000.0;
    }
}

public class InterestRateCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Customer c = new Customer("Karthika", 987654);
        Account a = new Account(12345, "AB01", 40000);

        System.out.println("Choose Bank:");
        System.out.println("1. SBI");
        System.out.println("2. ICICI");
        System.out.println("3. PNB");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        RBI bank = null;

        switch (choice) {
            case 1:
                bank = new SBI(c, a);
                break;
            case 2:
                bank = new ICICI(c, a);
                break;
            case 3:
                bank = new PNB(c, a);
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        bank.displayCustomerAccountInfo();
        bank.displayRules();
        System.out.println("\n--- Bank Offerings ---");
        System.out.println("Interest Rate Offered: " + bank.getInterestRate() + "%");
        System.out.println("Withdrawal Limit: ₹" + bank.getWithdrawalLimit());

        sc.close();
    }
}
