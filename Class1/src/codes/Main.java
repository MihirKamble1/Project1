package codes;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new Vehicle("Ford", 1988);
		obj.display();
		Car obj1 = new Car("Ford", 1964, "Mustang", 500);
		obj1.display();
		obj1.start();
		obj1.drive();
		obj1.stop();
		Motorcycle obj2 = new Motorcycle("Yamaha", 1998, "R1", 1000);
		obj2.display();
		obj2.acclerates();
		obj2.brakes();
		Truck obj3 = new Truck("Scania", 2010, "R580 Puller", 5);
		obj3.start();
		obj3.loadCargo();
		obj3.unloadCargo();
		
		
		

	}

}
