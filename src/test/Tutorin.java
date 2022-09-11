package test;

import java.util.Arrays;
import java.util.Scanner;

public class Tutorin {

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Please enter input");
//		String input=scan.nextLine();
//		//split and put in to an arrey delminate by ,
//		String array[]=input.split(",");
//		System.out.println(Arrays.toString(array));
//		String array1[]=Arrays.copyOf(array, 2);
//	
//		System.out.println(Arrays.toString(array1));
//		
//		System.out.println(array.length);
//		String arrylasttwo[]=new String[2];
//		if(array.length>1) {
//			arrylasttwo[0]=array[array.length-2];
//			arrylasttwo[1]=array[array.length-1];
//		System.out.println(Arrays.toString(arrylasttwo));
//			
//		}
//		
//		
//      Get the string input from the user 
//		Convert it to array with elements divided by space from the entered string
//		Print out the first and last letter of the first element and first and the last letter 
//		of the last elements in the array
			
		
//		Scanner in = new Scanner(System.in);
//		String text=in.nextLine();
//		String []word=text.split(" ");
//		System.out.println(Arrays.toString(word));
//	    
//		System.out.println(word[0].charAt(0)+" "+word[word.length-1].charAt(word[word.length-1].length()-1));
//		System.out.println(word[word.length-1].charAt(0)+" "+word[word.length-1].charAt(word[word.length-1].length()-1));

		
		
		
		
		
		
//      Get initial number of inputs as int from the user
//		Create 2D array with with number of columns being 3 and have ragged array as a last element
//		2D array
		
		
		
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int numOfInitialRows = num/3;
		int lengthOfRaggedArray = num%3;
		String [] [] finalArray = null;
		
		if(num%3 == 0) {
			finalArray = new String[numOfInitialRows] [3];
		}
		else {
			String [] raggedArray = new String[lengthOfRaggedArray];
			finalArray = new String[numOfInitialRows] [3];
			finalArray = Arrays.copyOf(finalArray, numOfInitialRows+1);
			finalArray[finalArray.length-1] = raggedArray;
		}
		System.out.println(Arrays.deepToString(finalArray));
		
		
		
	   
//		 | | |
//		 | | |
//		 | | |
//		 | |
		
		
		
		
		
		
	}
}

