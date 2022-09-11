/*
 * Question 1
Price for snack is 2.50
Me: Hi Java, do I have enough change to buy a snack? (use print statement)
Java: How much do you have? (use print statement)
Input: <double> (use input from user)
Java has to compare price with change and tell you if true or false
Java: [true/false] (use print statement)
 * 
 * */
package test;
import java.util.Scanner;

public class Practicehw {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println(" How often do you eat the booty like groceries in a week:  ");
	String number = input.next();
	
	System.out.println("WHEW ! Chiiiild,that's a lot ! ");
	
	int number2 = Integer.parseInt(number);
	number2 += 100;
	
	System.out.println(number2);
	System.out.println("Print False if less than 200.");
	// print false if number 2 < 200 
	
	System.out.println(number2 >= 200);
	
	String strBoolean = "true";
	boolean convertedString =  Boolean.parseBoolean(strBoolean);
	System.out.println("String as boolean: " + !convertedString);
	
	//when convert a string that contains a boolean then there is no case sensitivity ,
	//as long as there are no extra character the conversion will happen 
		
		
	
	
	}

	
	
}
