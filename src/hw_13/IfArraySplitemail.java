package hw_13;

import java.util.Arrays;
import java.util.Scanner;

public class IfArraySplitemail {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Given a String variable email, write code using split method to print email
		 * id and domain in separate lines.
		 * 
		 * Example: email -> info@gmail.com
		 * 
		 * Print:
		 * 
		 * Email id: info
		 * 
		 * Email domain: gmail.com
		 * 
		 * If email contains no @ character or multiple @ characters then print invalid
		 * email:
		 * 
		 * email -> hello-gmail.com
		 * 
		 * print:
		 * 
		 * invalid email
		 * 
		 * email -> my@fancy@email.com
		 * 
		 * print:
		 * 
		 * invalid email
		 */

		

	    Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    
	   String email_arr[]=email.split("@");
	   
	   if(!(email_arr.length==2)) {
		   System.out.println("Invalid Email");
	   }else {
		   System.out.println("Email id: "+email_arr[0]);
		   System.out.println("Email domain: "+email_arr[1]);
	   }
	   
		
	}

}
