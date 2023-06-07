package codes;

public class MethodOverridingClassB extends MethodOverridingClassA {
	public void display() {
		System.out.println("class B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingClassA obj = new MethodOverridingClassA();
		obj.display();
		MethodOverridingClassA obj1 = new MethodOverridingClassB();
		obj1.display();
				

	}

}
