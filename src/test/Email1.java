package test;

import java.util.Scanner;

public class Email1 {

	public static void main(String[] args) {
/*Instructions from your teacher:

In this task, you need to swap first name with last name in the email. If email doesn't contain underscore - don't change anything

Example:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com

Example:

input: barakobama@gmail.com

output: barakobama@gmail.com*/

		 Scanner scan = new Scanner(System.in);
	        String email = scan.next();
	        
	        
	        String firstName,lastName, first_last;
	        
	       
	        if(!email.contains("_")) {
	        System.out.println(email);
	        }else {
	        	first_last=email.substring(0,email.indexOf("@"));
	 	        firstName=email.substring(0,email.indexOf("_"));
	 	        lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
	 	        email=lastName+"_"+firstName+email.substring(email.indexOf("@"),email.length());
	 	        System.out.println(email);
	        }
	        
	
	}

}
