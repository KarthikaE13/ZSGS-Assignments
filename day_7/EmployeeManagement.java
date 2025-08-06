package day_7;
//Create a Java application to manage employees in a company. Define an Interface Employee with a 
//method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee
//that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism 
//by calling calculateSalary() on different types of employees 
//using the Employee reference. 
interface Employee{
	void calculateSalary();
}
class FullTimeEmployee implements Employee{
	String name;
	 double basicPay;
	 FullTimeEmployee(String name,double basicPay){
		 this.name=name;
		 this.basicPay=basicPay;
		 
	 }
	
 public void 	calculateSalary() {
	 System.out.println("Name : "+ name);
	 System.out.println(name +"'s"+ " Salary: " + 30*basicPay+0.2*basicPay);
	 System.out.println();
 }
}
class ParttimeEmployee implements Employee{
	String name;
	int daysWorked;
	double basicPay;
	ParttimeEmployee(String name ,int daysWorked,double basicPay){
		this.name=name;
		this.daysWorked=daysWorked;
		this.basicPay=basicPay;
		
	}
	
	public void 	calculateSalary() {
		System.out.println("Name : "+ name);
		System.out.println("No of days Worked: "+ daysWorked);
		double salary = daysWorked * basicPay;
		System.out.println(name+"'s"+" Salary: " + salary); 
	 }
	
}
public class EmployeeManagement{
	public static void main(String[] args) {
		Employee emp1 = new FullTimeEmployee("Karthika",1050.05);
        Employee emp2 = new ParttimeEmployee("Vasu",22,1050.05);
         emp1.calculateSalary();
         emp2.calculateSalary();
        
        
		
	}
}