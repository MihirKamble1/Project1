package codes;

public class Solution {
	/*syntax:
	 * if(condition){
	 * statement
	 * }
	 * else{
	 * }
	 * For(initialization; condition; increment){
	 * statement};
	 * for(int i = 0; i <; i++){}
	 * while(condition){statement};
	 * do{
	 * operation;
	 * increment/decrement}
	 * while(condition)
	 */
	public static void main(String[] rags) {
		int age = 4;
		if(age >= 3) {
			System.out.println("Eligible for school");
		}
		else
			System.out.println("Not Eligible");
		int a = 5;
		for(int i = 0; i < 20; i++) {
			System.out.println(a);
		}
		/*
		 * To print the name shilpa atleast once do while loop must be used;
		 */
		int i = 1;
		do {
			System.out.println("Shilpa");
			
		}
		while(i < 0);
		/*
		 * A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 46 to 50 - D
d. 51 to 60 - C
e. 61 to 80 - B
f. Above 80 - A
		 */
		int marks = 26 ;
		if(marks < 25)
			System.out.println("F");
		if(marks <= 45)
			System.out.println("E");
		if(marks >= 44 && marks < 50)
			System.out.println("D");
		if(marks >= 51 && marks <= 60)
			System.out.println("C");
		if(marks >= 61 && marks <= 80)
			System.out.println("B");
		if(marks > 80)
			System.out.println("A");
	}

}
