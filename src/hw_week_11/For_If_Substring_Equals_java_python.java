package hw_week_11;

import java.util.Arrays;
import java.util.Scanner;

public class For_If_Substring_Equals_java_python {
	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Given a string, print out true if the number of appearances of "java"
		 * anywhere in the string is equal to the number of appearances of "python"
		 * anywhere in the string (case sensitive).
		 * 
		 * `Example:`
		 * 
		 * `input: We study java not python`
		 * 
		 * `output: true`
		 * 
		 * `Example:`
		 * 
		 * `input: What's the difference between java, javascript and python?`
		 * 
		 * `output: false`
		 * 
		 */
		int python_count=0;
		int java_count=0;
		Scanner scan = new Scanner(System.in);
		String sent = scan.nextLine();
		
		
		
		for(int i=0; i<=sent.length()-4; i++) {
			
			if (sent.substring(i, (i + 4)).equals("java")){
				java_count+=1;
			}
			
		}
		

		for(int i=0; i<=sent.length()-6; i++) {
		
		if(sent.substring(i, (i + 6)).equals("python")){
			python_count+=1;
		}
		
		}
		
		
		if(java_count==python_count) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
