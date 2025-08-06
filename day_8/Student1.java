package day_8;
class Department {
    String name;
    Department(String name) {
        this.name = name;
    }
}
public class Student1 implements Cloneable{
	String name;
	int rollNo;
	Department department;
	
	public Student1(String name, int rollNo,Department department) {
		this.name = name;
		this.rollNo = rollNo;
		this.department=department;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Department: " + department.name);
    }
	
public static void main(String[] args) throws CloneNotSupportedException {
	Department department = new Department("Biology");
	Student1 s1= new Student1("Karthika",123,department);
	Student1 s2= (Student1)s1.clone();
	System.out.println("Before modification");
	s1.display();
	s2.display();
	s1.name="Divya";
	s1.department.name="Maths";
	System.out.println("After modification");
	s1.display();
	s2.display();
}

}
