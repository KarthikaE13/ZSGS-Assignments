package day_5;
//create a Java application to manage employees in a company. 
//Define a base class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee 
//and PartTimeEmployee that override calculateSalary() method based on their working type.

class Employee {
 String name;
 int id;

 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 
 public double calculateSalary() {
     return 0.0;
 }

 public void displayInfo() {
     System.out.println("Employee ID: " + id);
     System.out.println("Name: " + name);
 }
}

class FullTimeEmployee extends Employee {
 double monthlySalary;

 public FullTimeEmployee(String name, int id, double monthlySalary) {
     super(name, id);
     this.monthlySalary = monthlySalary;
 }

 
 public double calculateSalary() {
     return monthlySalary;
 }


 public void displayInfo() {
     super.displayInfo();
     System.out.println("Type: Full-Time");
     System.out.println("Monthly Salary: ₹" + calculateSalary());
 }
}


class PartTimeEmployee extends Employee {
 int hoursWorked;
 double hourlyRate;

 public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
     super(name, id);
     this.hoursWorked = hoursWorked;
     this.hourlyRate = hourlyRate;
 }


 public double calculateSalary() {
     return hoursWorked * hourlyRate;
 }


 public void displayInfo() {
     super.displayInfo();
     System.out.println("Type: Part-Time");
     System.out.println("Hours Worked: " + hoursWorked);
     System.out.println("Hourly Rate: ₹" + hourlyRate);
     System.out.println("Total Salary: ₹" + calculateSalary());
 }
}


public class EmployeeManagement {
 public static void main(String[] args) {
     // Create Full-Time employee
     FullTimeEmployee fte = new FullTimeEmployee("Arun", 101, 50000);
     System.out.println("=== Full-Time Employee ===");
     fte.displayInfo();

     System.out.println();

   
     PartTimeEmployee pte = new PartTimeEmployee("Sneha", 102, 120, 200);
     System.out.println("=== Part-Time Employee ===");
     pte.displayInfo();
 }
}
