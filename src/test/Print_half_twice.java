package test;

import java.util.Scanner;

public class Print_half_twice {

	public static void main(String[] args) {
/*
 * Instructions from your teacher:
	Write a program that will print out first half of the word twice.
	Example for even number words
	input: java
	output: jaja
	Example for odd number words 
	input: black
	output: blbl 
 * 
 * */

		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		System.out.println(word.substring(0,word.length()/2)+word.substring(0,word.length()/2));
		
		
		
	}

}
