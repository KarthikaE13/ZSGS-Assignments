package day_4;

class Point{
	 private int  x;
	private int  y;

public Point()
{
	this.x=0;
	this.y=0;
}
public Point(int x ,int y) {
	this.x=x;
	this.y=y;
}
public void setPoint(int x, int y) {
    this.x = x;
    this.y = y;
}
public int getX(){
	return this.x;
	
}
public int getY(){
	return this.y;
	
}
public void printPoint() {
    System.out.println("(" + x + ", " + y + ")");
}
}

public class Main {
 public static void main(String[] args) {
     
     Point p1 = new Point();
     System.out.println("Default Point:");
     p1.printPoint(); 

     
     p1.setPoint(5, 10);
     System.out.println("Updated Point:");
     System.out.println("X: " + p1.getX());
     System.out.println("Y: " + p1.getY());
     p1.printPoint(); 

     
     Point p2 = new Point(3, 7);
     System.out.println("Parameterized Constructor Point:");
     p2.printPoint(); 
 }
}

