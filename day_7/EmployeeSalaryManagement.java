package day_7;

abstract class Emp{
	abstract void calculateSalary();
}
class FullTime extends  Emp{
	String name;
	 double basicPay;
	 FullTime(String name,double basicPay){
		 this.name=name;
		 this.basicPay=basicPay;
		 
	 }
	
 public void 	calculateSalary() {
	 System.out.println("Name : "+ name);
	 System.out.println(name +"'s"+ " Salary: " + 30*basicPay);
	 System.out.println();
 }
}
class Parttime extends Emp{
	String name;
	int daysWorked;
	double basicPay;
	Parttime(String name ,int daysWorked,double basicPay){
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
public class EmployeeSalaryManagement{
	public static void main(String[] args) {
		Emp emp1 = new FullTime("Karthika",1050.05);
        Emp emp2 = new Parttime("Vasu",22,1050.05);
         emp1.calculateSalary();
         emp2.calculateSalary();
        
        
		
	}
}
