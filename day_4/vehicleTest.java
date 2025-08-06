package day_4;


class Vehicle {
 double mileage;
 double price;
}


class Car extends Vehicle {
 double ownershipCost;
 int warranty;
 int seatingCapacity;
 String fuelType;
}


class Audi extends Car {
 String modelType;

 void displayInfo() {
     System.out.println("Audi Car Info:");
     System.out.println("Model Type: " + modelType);
     System.out.println("Ownership Cost: " + ownershipCost);
     System.out.println("Warranty: " + warranty + " years");
     System.out.println("Seating Capacity: " + seatingCapacity);
     System.out.println("Fuel Type: " + fuelType);
     System.out.println("Mileage: " + mileage + " kmpl");
     System.out.println("Price: Rs. " + price);
     System.out.println();
 }
}


class Ford extends Car {
 String modelType;

 void displayInfo() {
     System.out.println("Ford Car Info:");
     System.out.println("Model Type: " + modelType);
     System.out.println("Ownership Cost: " + ownershipCost);
     System.out.println("Warranty: " + warranty + " years");
     System.out.println("Seating Capacity: " + seatingCapacity);
     System.out.println("Fuel Type: " + fuelType);
     System.out.println("Mileage: " + mileage + " kmpl");
     System.out.println("Price: Rs. " + price);
     System.out.println();
 }
}


class Bike extends Vehicle {
 int cylinders;
 int gears;
 String coolingType;
 String wheelType;
 int fuelTankSize;
}


class Bajaj extends Bike {
 String makeType;

 void displayInfo() {
     System.out.println("Bajaj Bike Info:");
     System.out.println("Make Type: " + makeType);
     System.out.println("Cylinders: " + cylinders);
     System.out.println("Gears: " + gears);
     System.out.println("Cooling Type: " + coolingType);
     System.out.println("Wheel Type: " + wheelType);
     System.out.println("Fuel Tank Size: " + fuelTankSize + " inches");
     System.out.println("Mileage: " + mileage + " kmpl");
     System.out.println("Price: Rs. " + price);
     System.out.println();
 }
}


class TVS extends Bike {
 String makeType;

 void displayInfo() {
     System.out.println("TVS Bike Info:");
     System.out.println("Make Type: " + makeType);
     System.out.println("Cylinders: " + cylinders);
     System.out.println("Gears: " + gears);
     System.out.println("Cooling Type: " + coolingType);
     System.out.println("Wheel Type: " + wheelType);
     System.out.println("Fuel Tank Size: " + fuelTankSize + " inches");
     System.out.println("Mileage: " + mileage + " kmpl");
     System.out.println("Price: Rs. " + price);
     System.out.println();
 }
}


public class vehicleTest {
 public static void main(String[] args) {
     
     Audi audi = new Audi();
     audi.modelType = "A6";
     audi.ownershipCost = 200000;
     audi.warranty = 4;
     audi.seatingCapacity = 5;
     audi.fuelType = "Petrol";
     audi.mileage = 15;
     audi.price = 6000000;
     audi.displayInfo();

    
     Ford ford = new Ford();
     ford.modelType = "Endeavour";
     ford.ownershipCost = 150000;
     ford.warranty = 3;
     ford.seatingCapacity = 7;
     ford.fuelType = "Diesel";
     ford.mileage = 13;
     ford.price = 4000000;
     ford.displayInfo();

     
     Bajaj bajaj = new Bajaj();
     bajaj.makeType = "Pulsar NS200";
     bajaj.cylinders = 1;
     bajaj.gears = 5;
     bajaj.coolingType = "Liquid";
     bajaj.wheelType = "Alloys";
     bajaj.fuelTankSize = 13;
     bajaj.mileage = 35;
     bajaj.price = 150000;
     bajaj.displayInfo();

     
     TVS tvs = new TVS();
     tvs.makeType = "Apache RTR 160";
     tvs.cylinders = 1;
     tvs.gears = 5;
     tvs.coolingType = "Oil";
     tvs.wheelType = "Alloys";
     tvs.fuelTankSize = 12;
     tvs.mileage = 45;
     tvs.price = 120000;
     tvs.displayInfo();
 }
}

