package hw_week_11;

import java.util.Arrays;

public class ForIfSubstringGetSandwich {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * A sandwich is two pieces of bread with something in between. Print the string
		 * that is between the first and last appearance of "bread" in the given string,
		 * or return string "nothing" if there are not two pieces of bread.
		 ** 
		 * `Example:`**
		 ** 
		 * `input: breadjambread`**
		 ** 
		 * `output: jam`**
		 ** 
		 * `Example:`**
		 ** 
		 * `input: xxbreadjambreadyy`**
		 ** 
		 * `output: jam`**
		 ** 
		 * `Example:`**
		 ** 
		 * `input: xxbreadapple`**
		 ** 
		 * `output: nothing`**
		 ** 
		 * `Example:`**
		 ** 
		 * `input: breadbutterbread`**
		 ** 
		 * `output: butter`
		 */
		
		
		String input= "xxbreadjambreadyy";
		int breadcount = 0;
		String word = "bread";

		for (int i = 0; i <= input.length() - word.length(); i++) {
			if (input.substring(i, i + word.length()).equals(word)) {
				breadcount += 1;

			}

		}

		if (breadcount == 2) {

			System.out.println(input.substring(input.indexOf(word) + word.length(), input.lastIndexOf(word)));

		} else
			System.out.println("nothing");
	}

}

