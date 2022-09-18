package test;

import java.util.Scanner;

public class Duplicate_it {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:

You have 2 words

Print the first word, second word, second word, first word

Input:

one

two

Output: 

onetwotwoone*
		 */

	
		   Scanner scan = new Scanner(System.in);
	        String word1 = scan.next();
	        String word2 = scan.next();

	System.out.println(word1+word2+word2+word1);
	
	
	}

}
