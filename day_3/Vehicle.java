package day_3;

public class Vehicle {
	int VehID;
	String Brand;
	double price;
	static int count;
	
	Vehicle(int VehID,String Brand,double price){
		this.VehID= VehID;
		this.Brand=Brand;
		this.price=price;
		count++;
	}
	void display() {
		System.out.println("Vehicle ID: " + VehID);
        System.out.println("Brand: " + Brand);
        System.out.println("Price: " + price);
        System.out.println("----------------------------------------");
	}
	
	public static void showVehicleCount() {
        System.out.println("Total Vehicles Created: " + count);
    }
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(123,"Toyota", 850000);
        Vehicle v2 = new Vehicle(234,"Honda", 920000);
        Vehicle v3 = new Vehicle(567,"Tesla", 4500000);

        v1.display();
        v2.display();
        v3.display();

        showVehicleCount();
		

	}

}
