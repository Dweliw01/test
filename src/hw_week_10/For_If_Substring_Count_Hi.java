package hw_week_10;

import java.util.Scanner;

public class For_If_Substring_Count_Hi {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Print out the number of times that the string "hi" appears anywhere in the
		 * given string.
		 * 
		 * Example:
		 * 
		 * input: abc hi how hi
		 * 
		 * output: 2
		 * 
		 * Example:
		 * 
		 * input: hi code java please
		 * 
		 * output: 1
		 */
		
	    Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
		
		int hicount = 0;
		int i = 0;

		while (i < str.length() - 1) {
			if (str.substring(i, (i + 2)).equals("hi")) {
				hicount += 1;
			}

			i++;
		}
		System.out.println(hicount);
		
		
		
	}

}
