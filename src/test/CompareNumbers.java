package test;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
//		Instructions from your teacher:
//
//			Note: prerequisite - if-else statement
//
//			U have 2 numbers already declared and assigned values.
			
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		if(num1==num2) {
			System.out.println(num1+" and "+num2+" are equal");
		}else if(num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		}else {
			System.out.println(num2+" is greater than "+num1);
		}
	
		


	}

}
