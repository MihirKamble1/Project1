package codes;

public class MethodOverloading {
	public int add(int x, int y) {
		int c = 0;
		c = x + y;
		return c;
		
	}
	public int add(int x, int y, int z) {
		int c = 0;
		c = x + y + z;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.add(2,3));
		System.out.println(obj.add(2,3,4));
		

	}

}
