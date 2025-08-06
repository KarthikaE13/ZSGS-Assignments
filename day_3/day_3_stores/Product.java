package day_3_stores;

public class Product {
int productId;
String pname;
double price;
int quantity;
Product(int productId,String pname,double price, int quantity){
	this.productId=productId;
	this.pname=pname;
	this.price=price;
	this.quantity=quantity;
}
public  void displayProduct() {
	System.out.println("Product ID: " + productId);
    System.out.println("Name      : " + pname);
    System.out.println("Price     : " + price);
    System.out.println("Quantity  : " + quantity);
    System.out.println("---------------------------------");
}


}
