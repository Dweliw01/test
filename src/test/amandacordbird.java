package test;

import java.util.Scanner;

public class amandacordbird {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
	    
	    if (start.equals("A") && (end.equals("B" ) | end.equals("C") | end.equals("D"))) {
	    	
	    	switch (end) {
	    	case "B" :
	    		System.out.println("right: B found" );
	    		break;
	    	case "C":
	    		System.out.println("right > down: C found");
	    		break;
	    	case "D"  : 
	    		System.out.println("right > down > left: D found");
	    		break;
	    	} 
	    } else if (start.equals("B") && (end.equals("C" ) | end.equals("D") | end.equals("A"))) {
	    	
	    	switch (end) {
	    	case "C" :
	    		System.out.println("down: C found" );
	    		break;
	    	case "D":
	    		System.out.println("down > left: D found");
	    		break;
	    	case "A"  : 
	    		System.out.println("down > left > up: A found");
	    		break;
	    	}
	    	
	    } else if (start.equals("C") && (end.equals("D" ) | end.equals("A") | end.equals("B"))) {
	    	
	    	switch (end) {
	    	case "D" :
	    		System.out.println("left: D found" );
	    		break;
	    	case "A":
	    		System.out.println("left> up: A found");
	    		break;
	    	case "B"  : 
	    		System.out.println("left> up > right: B found");	
	    		break;
	    	}
	    } else if (start.equals("D") && (end.equals("A" ) | end.equals("B") | end.equals("C"))) {
	    	
	    	switch (end) {
	    	case "A" :
	    		System.out.println("up: A found" );
	    		break;
	    	case "B":
	    		System.out.println("up > right: B found");
	    		break;
	    	case "C"  : 
	    		System.out.println("up > right > down: C found");
	    		break;
	    	}
	    } else if (start.equals(end)) {
	    	System.out.println(start + " found");
	    }

	}

}
