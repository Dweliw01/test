package hw_week_10;

import java.util.Arrays;
import java.util.Scanner;

public class ForArraySubstringprintfirstlastcharI {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Given a String array words, iterate through each word and print first and
		 * last letter of each element in separate lines.
		 * 
		 * Example:
		 * 
		 * words → ["hello", "why", "by", "apple" , "note"]
		 * 
		 * print: ho
		 * 
		 * wy
		 * 
		 * by
		 * 
		 * ae
		 * 
		 * ne
		 */
		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };
		
		for(int i=0; i<=words.length-1; i++) {
			System.out.println(words[i].substring(0,1)+words[i].charAt(words[i].length()-1)+" ");
		}
//		System.out.println(Arrays.toString(words));
//		System.out.print(words[0].substring(0,));
	}

}
