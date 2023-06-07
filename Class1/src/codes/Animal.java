package codes;

public class Animal {
	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
		
        public void Eat() {
		System.out.println("The animal is eating");
	}
		
}
class Dog extends Animal{
	Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void Eat() {
		System.out.println("the dog is eating");
	}
	public void bark() {
		System.out.println("The dog is barking");
	}
	public void play() {
		System.out.println("The dog is playing");
	}
}
class Cat extends Animal{
	
	Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void Eat() {
		System.out.println("the cat is eating");
	}
	public void meow() {
		System.out.println("The cat is meowing");
		
	}
	public void sleep() {
		System.out.println("the cat is sleeping");
	} 
}
