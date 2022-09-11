package test;

import java.util.Arrays;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
//		System.out.println("TO Exit press 1");	
//		System.out.println("Please type a word to know if its a palindrome");
		
		while(true) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please type a word to know if its a palindrome,\nOr press 1 to exit program");
		System.out.println("");	
		String i=input.nextLine();
		if(i.equals("1")) {
			System.out.println("Bye");
			 return;
		 }else if(i.equals("")) {
			 System.out.println("invalid input");
			 System.out.println("Bye");
			 return;
			 
		 }
		else{
			 String ar[]=i.split("");
			 String newstring="" ;
			 Arrays.toString(null)
		     for(int a=ar.length-1; a>=0;a--){
				 newstring+=ar[a];
		     	}
		    if(newstring.equalsIgnoreCase(i)) {
			System.out.println(i+": is a palindrome\n");
		     }else {
			System.out.println(i+": is NOT a palindrome\n");
		}
		     		
		}
	}
	}
}

		// TODO Auto-generated method stub



