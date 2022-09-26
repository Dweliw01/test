package hw_week_10;

import java.util.Scanner;

public class forLoopCountJava {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Return the number of times that the string "java" appears anywhere in the
		 * given string word.
		 * 
		 * Example:
		 * 
		 * input: javaxjava
		 * 
		 * output: 2
		 * 
		 * Example:
		 * 
		 * input: javaxjavaapplepearjavaegg
		 * 
		 * output: 3
		 */

		Scanner scan = new Scanner(System.in);
		String word = scan.next();

		int javecount = 0;
		int i = 0;

		while (i < word.length() - 3) {
			if (word.substring(i, (i + 4)).equals("java")) {
				javecount += 1;
			}

			i++;
		}
		System.out.println(javecount);
	}
}
