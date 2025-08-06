package day_8;
//Develop a Java program to illustrate the usage of toString() method.

public class Student {
	String name;
	int id;
	Student(String name, int id){
		this.name=name;
		this.id=id;
	}
	public String toString() {
		return name+" "+ id+" " + "Thankyou";
		
	}

	public static void main(String[] args) {
		Student s1= new Student("Karthika",123);
		System.out.println(s1.toString());// if toString doesn't override prints day_8.Student@378fd1ac

	}

}


