package hw_12;

import java.util.Arrays;
import java.util.Scanner;

public class ForArraySubstrinReverseSentence2 {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Given a String variable sentence, write code to get each word and assign to
		 * String reversed in reverse order.
		 * 
		 * Example:
		 * 
		 * sentence -> "Java is fun"
		 * 
		 * reversed -> "fun is Java"
		 */

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String reversed = "";
		
		String arr[]=sentence.split(" ");
				
		
		for(int i=arr.length-1; i>=0; i--) {
		
			reversed+=arr[i]+" ";
		
		}
		
		System.out.println(reversed);
		}
		
		
	}


