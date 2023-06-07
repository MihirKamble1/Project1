package codes;
/*1. Create a method with following two conditions
	a. Method should return your name 
	b. Name should be passed as parameter to the method
*/
class A{
	public String GetName(String name){
		
	    return name;
		
	}
	/*5.  Write a program to accept two values(int,double) from the user , then implement a parametric method to calculate the sum 
And return the same.
HINT : 
public void sum(int a ,double b)
{

}
*/
	public void sum(int n, double m) {
		double total = n + m;
		System.out.println(total);
	}
	}

public class Day23Assignment {
	
	public static void main(String[] rags) {
		A obj = new A();
		System.out.println(obj.GetName("Mihir"));
		/*2. Use Inbuilt String method to perform following kind of action	
	a. string s=Selenium, replace each letter "e" with "bb"
	b. string s=Selenium, calculate the length 
	c. string s=Selenium, get the character at index 4
*/
		String s = "Selenium";
		String b = s.replace('e','b');
		int len = 0;
		len = s.length();
		System.out.println(len);
		System.out.println(s.charAt(4));
		System.out.println(b);
		int n = 2;
		double m = 2.2;
		obj.sum(n,m);
		/*3. Write a program using if condition to check whether number is odd or even */
		int num = 26;
		if(num%2 == 0) {
			System.out.println("num is even");
		}
		else
			System.out.println("num is odd");
		
		
		
		
		
		
		
		
		
	}

}
