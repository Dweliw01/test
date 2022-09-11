package test;

import java.util.Arrays;
import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
	
//		
//		int j=1;
//		while(j<=5) {
//			System.out.println(j);
//			j++;
//		}
		
// we execute the body of a do while loop no matter what at least once 
//		
//		int i=15;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<=5);
		
//		Scanner scan = new Scanner(System.in);
//		
//		double total =0.0;
//		String userAnswer;
//		
//		do {
//			System.out.println("Enter a Price");
//			double itemPrice=scan.nextDouble();
//			total+=itemPrice;
//			System.out.println("Would you like to enter a price of another item ?: ");
//			userAnswer=scan.next();
//			
//		}while(userAnswer.equalsIgnoreCase("Yes"));
//		
//		System.out.println("your total balance due is $:"+Math.round(total*100)/100.00);
		
		
//		Scanner scan = new Scanner(System.in);
//		int userInput,total =0;
//		
//		do {
//			System.out.println("Please enter number");
//			userInput=scan.nextInt();
//			total+=userInput;
//		
//		}while(userInput !=0);
//		
//		System.out.println("Sum is: "+total);
		
		
		
		
		// lets writes a loop that prints numbers from 1 to 10 but except number 3
		//we skip the number 3 
		
//		for(int i=1;i<=10;i++) {
//			
//			if(i==3) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
//		String sentence="H121e323l4343l4343o w3423o432r4342l432432d";
//		for(int i=0; i<sentence.length();i++) {
//			if(Character.isLetter(sentence.charAt(i))) {
//				continue;
//					}
//			System.out.print(sentence.charAt(i));
//		}
//		
//
//		for(int i=0; i<sentence.length();i++) {
//			if(Character.isDigit(sentence.charAt(i))) {
//				continue;
//					}
//			System.out.print(sentence.charAt(i));
//		}
//		
//		
		
//		int arr[]= {10,59,-9,88,-66,84,21};
//		for(int i=0; i<arr.length-1; i++) {
//			
//			if(arr[i]<0) {
//				continue;
//			}
//			System.out.println(arr[i]);
//		}
//		
//		
//		
//		
//		
//		for(int i=1; i<=10; i++){
//			if(i%2!=0)
//				continue;
//			System.out.println(i);
//		}
		
		
		
		
		
		//write a loop that stop repeating the code if it finds number 7
		
//		for(int i=0; i<10;i++) {
//			if(i==7) 
//				break;
//			System.out.println(i);
//			}
//		}

		
		
		int arr[]= {10,59,-9,88,66,-84,21};
		boolean hasNegative=false;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]<0) {
				hasNegative=true;
				System.out.println(arr[i]);
				break;
		
		}
	}
		System.out.println("the Arrays has Negative values :"+ hasNegative);
}
}
