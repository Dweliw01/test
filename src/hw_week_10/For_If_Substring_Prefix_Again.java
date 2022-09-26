package hw_week_10;

import java.util.Scanner;

public class For_If_Substring_Prefix_Again {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Given a string, consider the prefix string made of the first n chars of the
		 * string. Does that prefix string appear somewhere else in the string?
		 * 
		 * Assume that the string is not empty and that n is in the range from 1 till
		 * str.length().
		 * 
		 * Example:
		 * 
		 * input: abXYabc
		 * 
		 * input: 1
		 * 
		 * output: true
		 * 
		 * a appears twice
		 * 
		 * Example:
		 * 
		 * input: abXYabc
		 * 
		 * input: 2
		 * 
		 * output: true
		 * 
		 * ab appears twice
		 * 
		 * Example:
		 * 
		 * input: abXYabc
		 * 
		 * input: 3
		 * 
		 * output: false
		 * 
		 * abX appears once only
		 */

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();

		boolean is_prefex = false;
		int prefex_count = 0;
		int i = 0;

		while (i <= str.length() - n) {
			if (str.substring(i, (i + n)).equals(str.substring(0, n))) {
				is_prefex = true;
				prefex_count += 1;
			} else {
				is_prefex = false;
			}

			i++;

		}

		if (prefex_count > 1) {
			is_prefex = true;
		}
		System.out.println(is_prefex);
	}
}



