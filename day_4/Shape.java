package day_4;

 class Shapes {
	void print() {
		System.out.println("This is shape");
	}
}
 class Polygon extends Shapes{
	 void print() {
		 System.out.println("Polygon is shape"); 
	 }
 }
 class Rectangle extends Polygon{
	 void print() {
		 System.out.println("Rectangle is Polygon");
	 }
 }
 class Triangle extends Polygon{
	 void print() {
		 System.out.println("Triangle is Polygon");
	 }
 }
 class Square extends Triangle{
	 void print() {
		 System.out.println("Square is Triangle");
	 }
 }
 public class Shape{
	 public static void main(String[] args) {
		 Shapes shape = new Shapes();
	        Polygon polygon = new Polygon();
	        Rectangle rectangle = new Rectangle();
	        Triangle triangle = new Triangle();
	        Square square = new Square();

	        
	        shape.print();     
	        polygon.print();    
	        rectangle.print();  
	        triangle.print();   
	        square.print(); 
	 }
 }