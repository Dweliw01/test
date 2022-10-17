package hw_12;

import java.util.Scanner;

public class ForEachArraySplitSentence {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Given a String variable sentence, write code to type each word in separate
		 * lines.
		 * 
		 * Example:
		 * 
		 * sentence -> "Java is fun"
		 * 
		 * Print
		 * 
		 * Java
		 * 
		 * is
		 * 
		 * fun
		 */

		 Scanner input = new Scanner(System.in);
	        String sentence = input.nextLine();
	        
	        String arr[]=sentence.split(" ");
	        
	        for( String i:arr) {
	        	System.out.println(i);
	        	System.out.println();
	        }
	        
	        }
	        
	        
	       
		
		
		
	}


