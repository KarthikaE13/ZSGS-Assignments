package day_3;

public class Student1 {
	String name;
	int rollno;
	int phoneNo;
	String address;
	
	Student1(String name,int rollno,int phoneNo,String address){
		this.name=name;
		this.rollno=rollno;
		this.phoneNo=phoneNo;
		this.address=address;
	}
	public  void display() {
		System.out.println("Name : "+name);
		System.out.println("RollNo : "+rollno);
		System.out.println("ContactNo : "+phoneNo);
		System.out.println("Address : "+address);
		System.out.println("--------------------------------------------------");
		
		
	}

	public static void main(String[] args) {
	
	Student1 obj= new Student1("John",123,1234567,"Tenkasi");
	obj.display();
	Student1 obj1= new Student1("Ravi",103,12444567,"Surandai");
	obj1.display();
	
	
	}
}

