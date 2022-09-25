package test;

import java.util.Scanner;

public class Online_Book_Merchants {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * # Online Book Merchants offers premium customers 1 free book with every
		 * purchase of 5 or more books and offers 2 free books with every purchase of 8
		 * or more books. It offers regular customers 1 free book with every purchase of
		 * 7 or more books, and offers 2 free books with every purchase of 12 or more
		 * books.
		 * 
		 * # Write a program that assigns freeBooks the appropriate value based on the
		 * values of the boolean variable isPremiumCustomer and the int variable
		 * nbooksPurchased. Print amount of freeBooks into the console.
		 * 
		 */

		
		  Scanner scan = new Scanner(System.in);
	        System.out.println("Are you Premium Customer?");
	        boolean isPremiumCustomer = scan.nextBoolean();
	        System.out.println("How many books did you purchase?");
	        int nbooksPurchased = scan.nextInt();
	        int freeBooks=0;
	        
	        if(isPremiumCustomer) {
	        	if(nbooksPurchased>=5 && nbooksPurchased<8 ) {
	        		freeBooks=+1;
	        		System.out.println(freeBooks);
	        	}else if(nbooksPurchased>=8) {
	        		freeBooks=+2;
	        		System.out.println(freeBooks);
	        	}else {
	        		System.out.println(freeBooks);
	        	}
	        		
	        	}
	        else {
	        	if(nbooksPurchased>=7 && nbooksPurchased<12 ) {
	        		freeBooks=+1;
	        		System.out.println(freeBooks);
	        	}else if(nbooksPurchased>12) {
	        		freeBooks=+2;
	        		System.out.println(freeBooks);
	        	}else {
	        		System.out.println(freeBooks);
	        	}
	        	
	        }

 
		
	}

}
