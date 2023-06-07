package codes;

public class Vehicle {
	String brand;
	int year;
	
	/*Vehicle(String brand, int year){
		this.brand = brand;
		this.year = year;
	}*/
	public void display() {
		System.out.println(brand);
		System.out.println(year);
	}
	public void start() {
		System.out.println("The Vehicle starts");
	}

}
class Car extends Vehicle{
	
	String name;
	int Hp;
		
	
	/*Car(String brand, int year, String name, int Hp) {
		super(brand, year);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.Hp = Hp;
	}*/
	public void start() {
		System.out.println("The Car starts");
	}
	public void drive() {
		System.out.println("The car is driving");
	}
	public static void stop() {
		System.out.println("The car stops");
	}
	public void display() {
		System.out.println(brand);
		System.out.println(year);
		System.out.println(name);
		System.out.println("The horsepower of car is " +Hp+ "HP");
	}
	
}
class Motorcycle extends Vehicle {
	String name;
	int cc;

	Motorcycle(String brand, int year, String name, int cc) {
		super(brand, year);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.cc = cc;
	}
	public void start() {
		System.out.println("The Motorcycle starts");
	}
	public void acclerates() {
		System.out.println("Motorcycle accelerates");
	}
	public void brakes() {
		System.out.println("The motorcycle is braking");
	}
	public void display() {
		System.out.println(brand);
		System.out.println(year);
		System.out.println(name);
		System.out.println("the cc of the motorcycle is" +cc+ "cc");
	}
	
}
class Truck extends Vehicle{
	String name;
	int capacity;

	Truck(String brand, int year, String name, int capacity) {
		super(brand, year);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.capacity = capacity;
	}
	public void start() {
		System.out.println("The Truck starts");
	}
	public void loadCargo() {
		System.out.println("The truck is loading");
	}
	public void unloadCargo() {
		System.out.println("The truck is unloading");
	}
	public void display() {
		System.out.println(brand);
		System.out.println(year);
		System.out.println(name);
		System.out.println("The capacity of truck is " +capacity+ "tons");
	}
	
}
