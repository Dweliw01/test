package test;
import java.util.Random;
import java.util.Scanner;
public class CodeboardAssignments {

	public static void main(String[] args) {

//
//Instructions from your teacher:
//	In this assignment you will create a Scanner object and ask user to enter 3 number inputs.
//	Declare integer variables num1, num2, num3, sum.
//	-Create a Scanner object named scan.
//	-Display prompt "Enter 3 numbers:"
//	-Using scanner object let user input 3 numbers
//	-Add 3 numbers and assign to sum variabl
//	-Print "Sum of numbers: ValueOfSum"int
	

	    //WRITE YOUR CODE HERE:
		/*int mask;
		double mprice,total;
	    Scanner scan = new Scanner(System.in);
	    
		System.out.println("How many masks do thy esnt purchase :");
		mask=scan.nextInt();
		if(mask >= 1000) {
			System.out.println("Sorry we don't have that many in stock");
		}else if(mask>=100 && mask <499) {
			mprice=2.25;
			total=mask*mprice;
			System.out.println(mprice);
			System.out.println("your Total is $"+total);
		}else if(mask>=500) {
			mprice=2.00;
			total=mask*mprice;
			System.out.println(mprice);
			System.out.println("your Total is $"+total);
		}else {
			mprice=2.50;
			total=mask*mprice;
			System.out.println("your Total is $"+total);
			System.out.println(mprice);
		}
		
		
		
		Shopping Cart
Ask user to enter total Price
Ask user if they have membership?
If they are member, ask them what kind of membership do they have
Gold, Silver
Gold members gets %10 discount, Silver members get %5 discount. Calculate their total after discount and show it to user.
If they are not member, show them the original total.
	*/	  

	
		
//		String membership,membershipType;
//		System.out.println("Ask user to enter total Price");
//		double totalPrice=scan.nextDouble();
//
//		System.out.println(" DO you have membership?");
//		membership=scan.next();
//		if(membership.equals("yes")) {
//			
//			System.out.println(" what kind of membership do they have Gold, Silver");
//			membershipType=scan.next();
//
//			if(membershipType.equals("Gold")){
//
//				totalPrice=totalPrice-(totalPrice*.05);
//			System.out.println("your total price is $ "+totalPrice);
//			}else if(membershipType.equals("Silver")) {
//	
//						totalPrice=totalPrice-(totalPrice*.05);
//			System.out.println("your total price is $ "+totalPrice);
//			}
//		
//		}else {
//			System.out.println("your are not member your total is $"+totalPrice);
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter nuber of month");
//		int month=scan.nextInt();
//		
//		switch(month) {
//		
//		case 1:
//			System.out.println("January");
//			break;
//			
//		case 2:
//			System.out.println("Febury");
//
//			break;
//			
//		case 3:
//			System.out.println("March");
//			
//			break;
//			
//		default:
//			System.out.println("invalid number");
//		}
//		
//	
//		Random random = new Random();
//
//		int value = random.nextInt(1,6)
//
//		
//		
//		System.out.println("Guess A number between 1 to 5");
//		int guessNum=scan.nextInt();
//		
//		if(value==guessNum) {
//			System.out.println("Correct! Aren't you lucky,");
//		}else {
//			System.out.println("Hard luck maybe next time.");
//		}
//		//Write a program that will print out the longer word.
		//Declare 2 variables
		String str1,str2;
		//Get input from user for those variables
		str1=scan.nextLine();
		str2=scan.nextLine();
		
		if(str1.length()>str2.length() ) {
			System.out.println(str1);
		}else if(str1.length()<str2.length() ) {
			System.out.println(str2);
		}else {
			System.out.println("they are eqal");
		}

		//Compare and print the one that is longer
		//If Equal Print "These words are equal"	
			

			

	}
}

	
	

	
		
		
		
		

		
		

	

