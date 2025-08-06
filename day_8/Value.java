package day_8;
//Develop a Java program to illustrate pass-by-value.

public class Value {
	int data=10;
	void update(int a) {
		data=data+a;
	}

	public static void main(String[] args) {
		Value v1= new Value();
		System.out.println(v1.data);
		v1.update(30);
		System.out.println(v1.data);
		
	}

}
