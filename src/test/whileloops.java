package test;

import java.util.Scanner;

public class whileloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int count=20;
//		while(count>=0) {
//			System.out.println(count);
//			count--;
//		}

		//Lets create a password to login to Google account
		//Assume that you entered the username correctly 
		//The program has to validate the password if it is correct
		//If not ask again to enter password 
		
//		String expectedPassword="Desk45";
//		int numOfAttmpts=0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Hello! Enter your username");
//		String userName=scan.nextLine();
//		System.out.println("Thank you, "+userName);
//		System.out.println("Enter your Password: ");
//		String usersPasseord = scan.nextLine();
//		
//		while (!usersPasseord.equals(expectedPassword)|| numOfAttmpts==3) {
//			System.out.println("Incorrect Password, Please try again");
//			usersPasseord = scan.nextLine();
//			numOfAttmpts++;
//			if(numOfAttmpts>=2) {
//				System.out.println("you have reached you max attempts your account will be locked. Please try again in 10 mins");
//				//return;
//			}
//			
//		}
//		
//		
//		System.out.println("Welcome!");
//		
//		
//		int i=20;
//		while(i>=0) {
//			System.out.println(i);
//			i--;
//		}
//		
//		
//		int j=20;
//		while(--j>0) {
//			System.out.println(j);
//		}
		
		
		//Write a program 
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter the number of time you want to repeat the sign: ");
//		int count=scan.nextInt();
////		for(int i=1; i<=count; i++) {
//			System.out.print("@");
//		}
		

		//ask users item price
		//would like to enter anoter itemm price
		//if the cust say yes it will allow you to enter another item 
		//and calculate the sum of the item 
		
		
		
		
		Scanner scan = new Scanner(System.in);
		double sum=0;
		double itemPreice=0;
		
		
		System.out.println("Welcome to Quick chek out! \n");
		System.out.println("If you like to scan an item, Press Yes");
		String custInput=scan.next();
		while(custInput.equalsIgnoreCase("yes")) {
			System.out.println("Please enter the Item Preice");
			itemPreice=scan.nextDouble();
			sum+=itemPreice;
			System.out.println("would you like to Scan another item ?, Pres Yes");
			 custInput=scan.next();
		}
		
		System.out.println("You total to pay $: " +Math.round(sum*100)/100.0);
		
		
		
		
		
		}
		
		
		
		
	}


