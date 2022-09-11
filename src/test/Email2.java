package test;

import java.util.Scanner;

public class Email2 {

	public static void main(String[] args) {
/*Instructions from your teacher:

Write a program that will print out information (First name, Last name, Domain, Top-Level Domain) about user based on email.

first and last name should start with the upper case like in example.

**Example:**

**Input: craig_federighi@apple.com**

**Output:** 

**First name: Craig**

**Last name: Federighi**

**Domain: apple**

**Top-Level Domain: com***/

		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		
		String firstName,lastName,domain,tldomain;
		firstName=email.substring(0,email.indexOf("_"));
		lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
		domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
		tldomain=email.substring(email.indexOf(".")+1,email.length());
		System.out.println("First name: "+firstName.substring(0,1).toUpperCase()+firstName.substring(1,firstName.length()));
		System.out.println("Last name: "+lastName.substring(0,1).toUpperCase()+lastName.substring(1,lastName.length()));
		System.out.println("Domain: "+domain);
		System.out.println("Top-Level Domain: "+tldomain);
		
		

		
		
	}

}
