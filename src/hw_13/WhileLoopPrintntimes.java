package hw_13;

import java.util.Scanner;

public class WhileLoopPrintntimes {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * - Given an int variable n that has already been declared and initialized to a
		 * positive value - Another int variable j that has already been declared - Use
		 * a for loop to print a single line consisting of n STARS. - Thus if n contains
		 * 5, five STARS will be printed - Use no variables other than n and j.
		 * 
		 * HINT: NO NEED FOR ARRAY HERE, JUST USE WHILE LOOP
		 * 
		 * Example:
		 * 
		 * input: 1 output: * Example: input: 3 output: ***
		 */

	    int j = 0;
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    
	    while(j<n) {
	    	System.out.print("*");
	    	j++;
	    }
	}

}
