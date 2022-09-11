package test;

import java.util.Scanner;

public class amandacode {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
     

		if (word.endsWith("y")) {
        	System.out.println(word.substring(0,word.indexOf("y")) + "ies");
        }else if (word.endsWith("ey")){
        	System.out.println(word.substring(0,word.indexOf("ey")) + "eys");
        }else if (word.endsWith("ife")){
        	System.out.println(word.substring(0,word.indexOf("ife")) + "ives");
        	
        }else {
        	System.out.println(word + "s");
	}

}
}