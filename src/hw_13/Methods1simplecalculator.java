package hw_13;

import java.util.Scanner;

public class Methods1simplecalculator {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Create a static method called "plus", its return is void and it gets no
		 * arguments.
		 * 
		 * It asks the user to input two numbers, then it will add them and print the
		 * result.
		 * 
		 * Create a scanner within plus method.
		 * 
		 * Example:
		 * 
		 * Enter first number
		 * 
		 * 1
		 * 
		 * Enter second number
		 * 
		 * 2
		 * 
		 * result: 3
		 */
		plus();
		
		
	}

	
	
	
	static void plus() {
		Scanner scan =new Scanner(System.in);
		int num1, num2,result;
		System.out.println("Enter first number");
		num1=scan.nextInt();
		System.out.println("Enter second number");
		num2=scan.nextInt();
		result=num1+num2;
		System.out.println("result: "+result);
	}
}
