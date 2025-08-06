package day_3;

public class Employee {
	String EmpName;
	int EmpId;
	String Desgn;
	int Salary;
	Employee(){
		System.out.println("Object is created");
	}
	Employee(String EmpName,int EmpId,String Desgn,int Salary){
		this.EmpName=EmpName;
		this.EmpId=EmpId;
		this.Desgn=Desgn;
		this.Salary=Salary;
	}
	
	Employee(Employee e) {
        this.EmpName = e.EmpName;
        this.EmpId = e.EmpId;
        this.Desgn = e.Desgn;
        this.Salary = e.Salary;
    }
	public void display() {
		
	System.out.println("Name : "+EmpName);
	System.out.println("ID :"+EmpId );		
	System.out.println("Position : "+ Desgn);
	System.out.println("Salary : "+ Salary);
	System.out.println("-------------------------------------------------");
	
		
	}

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.display();
		Employee obj2= new Employee("Karthika",343,"Developer",500000);
		obj2.display();
		Employee obj3 = new Employee(obj2);
		obj3.display();
		
	}

}
