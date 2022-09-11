package test;

import java.util.Scanner;

public class HTTPStatuscodes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter status code:");
        int status = scan.nextInt();
        
        switch(status) {
        case 200:
        	System.out.println("OK");
        	break;
        case 201:
        	 System.out.println("Created");
        	 break;
        case 202:
        	System.out.println("Accepted");
        	break;
        case 301:
        	System.out.println("Moved Permanently");
        	break;
        case 303:
        	System.out.println("See Other");
        	break;
        case 304:
        	System.out.println("Not Modified");
        	break;
        case 307:
        	System.out.println("Temporary Redirect");
        	break;
        case 400:
        	System.out.println("Bad Request");
        	break;
        case 401:
        	System.out.println("Unauthorized");
        	break;
        case 403:
        	System.out.println("Forbidden");
        	break;
        case 404:
        	System.out.println("Not Found");
        	break;
        case 410:
        	System.out.println("Gone");
        	break;
        case 500:
        	System.out.println("Internal Server Error");
        	break;
        case 503: 
        	System.out.println("Service Unavailable");
        	break;
        default:
			System.out.println("Invalid status code!");
        }
        

	}

}






/*Instructions from your teacher:

HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers). 
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. 
Some of the codes and their meanings are listed below:

STATUS CODES

200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable

Given an int variable status, write a switch statement that prints out, on a line by itself, the appropriate label from the above list based on status. Otherwise, print warning message: "Invalid status code!".

Example:

Display message: "Enter status code:"

input: 200

Display message: "OK"*/




/*	
		Scanner scan = new Scanner(System.in);
		
		// Welcome message
		System.out.println("Welcome to the Best Coffee Shop");
		System.out.println("Here is our menu:");
		System.out.println("--------------------");
		System.out.println("1. Americano");
		System.out.println("2. Espresso");
		System.out.println("3. Cappuccino");
		System.out.println("4. Latte");
		System.out.println("5. Tea");
		System.out.println("--------------------");
		
		System.out.println("Please enter the number of the item you want to get:");
		int userOrder = scan.nextInt();
		
		switch(userOrder) {
		
		case 1:
			System.out.println("Your Americano will be ready soon...");
			break;
		case 2: 
			System.out.println("Your Espresso will be ready soon...");
			break;
		case 3: 
			
			System.out.println("What type of milk would you like?");
			String typeOfMilk = scan.next();
			
			if(typeOfMilk.equals("whole")) {
			    System.out.println("Your Cappuccino with whole milk will be ready soon...");
			}else {
				System.out.println("Sorry, we do not have that type of milk currently...");
			}
			
			break;
			
		case 4: 
			System.out.println("Your Latte will be ready soon...");
			break;
		case 5: 
			System.out.println("Your Tea will be ready soon...");
			break;
		default:
			System.out.println("Sorry we do not have such number in our menu!");
		}
		
		System.out.println("Thank you for visiting us!");*/