package day_6;

public class Employee {
	 private int employeeID;
	private String name;
	private String desgn;
	private String department;
	private double monSalary;
	static double LPA;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID= employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getDesgn() {
		return desgn;
	}
	public void setDesgn(String desgn) {
		this.desgn=desgn;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public  double getMonSalary() {
		return monSalary;
	}
	public void setMonSalary(double monSalary) {
		this.monSalary=monSalary;
	}
     public double annualSalary(double monSalary) {
    	 double annualSal= 12* monSalary;
    	 return annualSal;
     }
     public void display() {
    	 System.out.println("Employee Details:");
    	 System.out.println("Name : "+name);
    	 System.out.println("EmpID : "+employeeID);
    	 System.out.println("Desgn : "+desgn);
    	 System.out.println("Department : "+department);
    	 System.out.println("Monthly Salary : "+monSalary);
    	 System.out.println("LPA : "+LPA);
     }
     
	public static void main(String[] args) {
		Employee e= new Employee();
		e.setEmployeeID(1234);
		e.setName("Vasu");
		e.setDesgn("Manager");
		e.setDepartment("HR");
		e.setMonSalary(123000);
		LPA=e.annualSalary(e.monSalary);
		e.display();

	}

}
