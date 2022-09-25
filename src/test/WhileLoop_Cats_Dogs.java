package test;

import java.util.Arrays;
import java.util.Scanner;

public class WhileLoop_Cats_Dogs {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Print true if the string "cat" and "dog" appear the same number of times in
		 * the given string word.
		 * 
		 * Example:
		 * 
		 * input: catdog
		 * 
		 * output: true
		 * 
		 * Example:
		 * 
		 * input: catcat
		 * 
		 * output: false
		 * 
		 * Example:
		 * 
		 * input: cat-cheetah-dog-cat
		 * 
		 * output: false
		 */

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		int catCount = 0;
		int dogCount = 0;
		int i = 0;

		while (i < word.length() - 2) {
			if (word.substring(i, (i + 3)).equals("cat")) {
				catCount += 1;
			}

			else if (word.substring(i, (i + 3)).equals("dog")) {

				dogCount += 1;
			}
			i++;
		}

		if (catCount != dogCount) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}
}

	      


