package hw_week_11;

import java.util.Arrays;
import java.util.Scanner;
import module1.amanda;

public class ForArraySubstringReverseSentence {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Given a String variable sentence, write code to type each word in separate
		 * lines in a reverse order.
		 * 
		 * Example:
		 * 
		 * sentence -> "Java is fun"
		 * 
		 * Print
		 * 
		 * fun
		 * 
		 * is
		 * 
		 * Java
		 */
		
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reverse[] = sentence.split("\\s+");
		String str_reverse = "";
		System.out.println(Arrays.toString(reverse));

		for (int i = reverse.length - 1; i >= 0; i--) {

			str_reverse += reverse[i] + "\n";
		
		}
		System.out.println(str_reverse);


	}

}
