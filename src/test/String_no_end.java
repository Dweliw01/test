package test;

import java.util.Scanner;

public class String_no_end {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * In this exercise you get a string called txt .
		 * 
		 * output txt without its last letter.
		 * 
		 * for example:
		 * 
		 * txt = "foo"
		 * 
		 * output will be:
		 * 
		 * fo*
		 */

		Scanner s = new Scanner(System.in);
        String txt = s.next();
        System.out.println(""+txt.subSequence(0,txt.length()-1));
		
		
	}

}
