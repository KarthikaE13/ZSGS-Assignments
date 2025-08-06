package day_1;
//Write a class Employee with attributes empId, name, department and salary and define a parametrized 
//constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables 
//accordingly and display them?
public class Employee {
    // Instance variables
    int empId;
    String name;
    String department;
    double salary;

    // Parameterized constructor
    public Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Name          : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : ₹" + salary);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an employee object using parameterized constructor
        Employee emp1 = new Employee(101, "Karthika", "HR", 45000.00);

        // Display employee details
        emp1.display();
    }
}
