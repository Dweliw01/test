package hw_12;

public class NMethodHeaderPractice8 {

	public static void main(String[] args) {
		/*
		 * Write a public static method header on line five with the following specs:
		 * 
		 * Returns: a String
		 * 
		 * Name: makeThreeSubstr
		 * 
		 * Parameters:
		 * 
		 * - a String called "word" - an integer called "startIndex" - an integer called
		 * "endIndex"
		 * 
		 * Then, starting on line 5, write code that will return 3x the substring (no
		 * spaces) from "startIndex" to "endIndex"
		 * 
		 * Examples:
		 * 
		 * - makeThreeSubstr("hello",0,2) ==> "hehehe" -
		 * makeThreeSubstr("shenanigans",3,7) ==> "naninaninani"
		 */
		
		System.out.println(makeThreeSubstr("hello", 0, 2)); //should be hehehe
        System.out.println(makeThreeSubstr("shenanigans", 3, 7)); //should be naninaninani
		
		

	}

	
	public static String makeThreeSubstr(String word, int startIndex, int endIndex ) {
		String new_word="";
		for(int i=0; i<3; i++) {
			new_word+=word.substring(startIndex, endIndex);
		}
	 return new_word;
	}
}
