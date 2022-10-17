package hw_12;

import java.util.Scanner;

public class ForArraySubstringprintfirstlastcharII {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Given a String array words, iterate through each word and print first and
		 * last letter of each element in the format below.
		 * 
		 * Example:
		 * 
		 * words → ["hello", "why", "by", "apple" , "note"]
		 * 
		 * print → ho, wy, by, ae, ne
		 */


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
		String new_word="";
        for(int i=0; i<=words.length-1; i++) {
        	
        	new_word+=words[i].substring(0,1)+words[i].charAt(words[i].length()-1)+", ";
        }
	
        System.out.println(new_word.substring(0,new_word.length()-2));
	}

}
