package codes;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Animal("Max", 4);
		
		Dog obj1 = new Dog(null,0);
		obj1.Eat();
		obj1.bark();
		obj1.play();
		
		Cat obj2 = new Cat(null,0);
		obj2.Eat();
		obj2.meow();
		obj2.sleep();
		

	}

}
