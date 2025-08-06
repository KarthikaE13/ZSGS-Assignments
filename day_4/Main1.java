package day_4;



// Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
//sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
//In main:
//Create one ThreeD object using the default constructor.
//Use the setters to set x, y, and z.
//Create the second ThreeD object using the constructor with three arguments.
//in the TwoD class:
//Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
//Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"
import java.util.Scanner;
class twoD{
	protected int x;
	protected int y;
	twoD(){
		System.out.println("TwoD default constructor");
		this.x=0;
		this.y=0;
	}
	twoD(int x, int y){
		System.out.println("TwoD Constructor with two arguments");
		this.x=x;
		this.y=y;
		
	}
	public void setX(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public int getY() {
		return y;
	}
	public void displayXY() {
        System.out.println("x: " + x + ", y: " + y);
    }
}
	class threeD extends twoD{
		protected int z;
	
	threeD(){
		super();
		this.z=0;
		}
	threeD(int x ,int y ,int z){
		super(x,y);
		this.z=z;
	}
	public void setZ(int z) {
		this.z=z;
	}
	public int getZ() {
		return z;
	}
	public void displayXYZ() {
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }

    void FindDistance(threeD other) {
        double distance = Math.sqrt(
            Math.pow(other.x - this.x, 2) +
            Math.pow(other.y - this.y, 2) +
            Math.pow(other.z - this.z, 2)
        );
        System.out.printf("Distance between points: %.2f\n", distance);
    }
	
	}	

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1,y1,z1");
		int x1= sc.nextInt();
		int y1=sc.nextInt();
		int z1=sc.nextInt();
		threeD td= new threeD(x1,y1,z1);
		
		System.out.println("Enter x2,y2,z2");
		int x2= sc.nextInt();
		int y2=sc.nextInt();
		int z2=sc.nextInt();
		threeD td1= new threeD();
		td.FindDistance(td1);
	}

}

