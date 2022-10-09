package hw_week_11;

import java.util.Scanner;

public class IfSubstringParseHTML {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Hypertext Markup Language (HTML) is the standard markup language for creating
		 * web pages and web applications. HTML is the language in which most websites
		 * are written. HTML is used to create pages and make them functional.
		 * 
		 * Write a program, that will read html variable and output attribute value of
		 * id`` attribute (tag) into the console. Input will be provided in a single
		 * line as outlined below. If html variable doesn't contain
		 * 
		 * id attribute, print out into the console message: "Invalid input!". Example:
		 * 
		 * input: <!DOCTYPE html><html><head><title>Java</title></head><body><pid="myid"></p></body></html>
		 * 
		 * output: myid
		 */

		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter HTML");
	        String html = scan.nextLine();
	        
	        if(html.contains("id=")) {
	     	        	System.out.println(html.substring(html.indexOf("id=")+4, html.indexOf("id=")+8));
	        }else {
	        	System.out.println("invlid Entry");
	        }
		
	}

}
