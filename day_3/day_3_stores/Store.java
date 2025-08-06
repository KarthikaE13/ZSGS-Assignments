package day_3_stores;
import java.util.ArrayList;
public class Store {
	static String storeName;
	static  String storeLocation;
	ArrayList<Product> products = new ArrayList<>();	
public static void setStoreDetails(String name,String location) {
	storeName = name;
    storeLocation = location;
	
}
public static void displayStoreDetails() {
	System.out.println("Store Name    : " + storeName);
    System.out.println("Store Location: " + storeLocation);
    System.out.println("=================================");
	
}

public  void addProduct(Product product) {
	products.add(product);
	
}
public  void displayAllProduct() {
	if (products.isEmpty()) {
        System.out.println("No products in the store.");
        return;
    }
	System.out.println("Product List:");
    System.out.println("---------------------------------");
    for (Product product : products) {
        product.displayProduct();
    }
	
}
}
