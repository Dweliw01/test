package hw_week_10;

import java.util.Scanner;

public class substring_Has_Java {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * # **Given a string word, print true if "java" appears starting at index 0 or
		 * 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The
		 * string may be any length, including 0word = .**
		 * 
		 * Example:
		 * 
		 * input: javapython
		 * 
		 * output: true
		 * 
		 * Example:
		 * 
		 * input: cjavac++
		 * 
		 * output: true
		 * 
		 * Example:
		 * 
		 * input: c#javaruby
		 * 
		 * output: false
		 */

		 Scanner scan = new Scanner(System.in);
	     String word = scan.next();
		
	     if(word.subSequence(0, 4).equals("java")) {
	    	 System.out.println("true");
	     }else if(word.subSequence(1, 5).equals("java")) {
	    	 System.out.println("true");
	     }else {
	    	 System.out.println("false");
	     }
		
	}

}
