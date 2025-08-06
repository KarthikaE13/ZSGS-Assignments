package day_3_stores;

public class Main {

	public static void main(String[] args) {
		Store.setStoreDetails("SmartBazar", "Tenkasi");
		
		Store store = new Store();
		
		Product p1 = new Product(101, "Laptop", 55000.00, 5);
        Product p2 = new Product(102, "Smartphone", 20000.00, 10);
        Product p3 = new Product(103, "Keyboard", 800.00, 20);
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        Store.displayStoreDetails();
        store.displayAllProduct();
	}

}
