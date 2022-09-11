package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Tuturing2 {

	public static void main(String[] args) {
		
		// make every word in the sentence with a capital letter make sure to skip empty input 
//		Scanner scan = new Scanner(System.in);
//		String newstr="";
//		String text=scan.nextLine();
//		String arr[]=text.split("\\s");
//		for(int i=0; i<=arr.length-1;i++) {
//			
//			if(arr[i].equals(" "))
//				continue;
//			//Made the First letter of the First element capital and then add the substring  1 which adds on the reaming charters 
//			arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
//			newstr+=arr[i]+" ";
//			
//		}
//		Scanner scan = new Scanner(System.in);
//		String newstr="";
//		String text=scan.nextLine();
//		String arr[]=text.split("");
//		for(int i = arr.length-1; i>=0;i--) {
//			
//		     newstr+=arr[i]+"";
			
//		}
//		
//		System.out.println(newstr);
//		
//		String newstr="";
//		
//		Scanner scan = new Scanner(System.in);
//		int num=scan.nextInt();
//		String convenum=String.valueOf(num);
//		String numarry[]=convenum.split("");
//		for(int i = numarry.length-1; i>=0;i--) {
//			newstr+=numarry[i]+"";
//				
//		
//	}
// System.out.println(newstr);
// 
 
		
		//Reverse a number without using string methodes only with arithmetic operators 
//		
//		Scanner scan = new Scanner(System.in);
//		int num=scan.nextInt();
//		int reverse=0,lastdigit=0;
//		while(num> 1) {
//			lastdigit=num%10;
//			System.out.println("last_digit "+lastdigit);
//			reverse=reverse*10+lastdigit;
//			System.out.println("Revers "+reverse);
//			num=num/10;
//			System.out.println("NUm "+num);
//		}
//		System.out.println(reverse);

		//Count how many times that short strinf occurs in long string 
		
		
//		Scanner scan = new Scanner(System.in);
// 
//		System.out.println("Enter Short stirng");
//		
//		String shortString=scan.nextLine();
//		
//		System.out.println("Enter Long sting conting the short string: ");
//		
//		String longString=scan.nextLine();
//		int count=0;
//		
//		for(int i=0; i<=longString.length()-shortString.length();i++) {
//			
//			if(longString.substring(i,i+shortString.length()).equals(shortString)) {
//				count++;
//				
//			}	
//			
//			}
//		System.out.println(count);

		
//		int arr[]= {20,55,555,787,785};
//		int arr2[]= {20,55,555,787,785};
//		int arr3[][]= new int[2][];
//		arr3[0]=arr;
//		arr3[1]=arr2;

//		
//		String colors[][]=new String[2][];
//		colors[0]= new String [3];
//		colors[0][0]="red";
//		colors[0][1]="yellow";
//		colors[0][2]="blue";
		
		
//		String colors [][]= {{"red","Yellow","blue"},{"orange","green","purple"}};
//
//		System.out.println("My favorite colore is "+colors[1][2]);
//		colors [0][1]="pink";
//		System.out.println("My favorite colore is "+colors[0][1]);
//		
//		
//	  System.out.println(Arrays.deepToString(colors));	
		
		
//		
//		int table[][]= {{1,4,9},
//						{11,4,3},
//						{2,2,3},
//						{5,8,4}};
//		int sum=0;
//		sum= table[1][0]+table[1][1]+table[1][2];
//		System.out.println("the sum of the second row of the table is :"+sum);
//		
//		System.out.println("the Length of the Table arrays is :"+table.length);
//		System.out.println("the Length of the 1st row in the Table arrays is :"+table[0].length);
//		
//		
//		double x=5.5;
//		switch(x) {
//		
//		}
//		
//	}

		
		
//		String name ="DushaN", lastName ="PeReRA";
//		char index1=name.charAt(0);
//		char index2=lastName.charAt(0);
//		System.out.println((index1+"").toUpperCase()+name.substring(1).toLowerCase()+" "+(index2+"").toUpperCase()+lastName.substring(1).toLowerCase());

/*Get the String Input From the User
 * Convert it to an Array with elements divided  by comma from the enter string
 * populate new array with only 2 elments of the previous array*/
//
// Scanner scan =new Scanner(System.in);
// System.out.println("Enter a Sentence: ");
// String input=scan.nextLine();
//
// String inputarr[]=input.split(",");
//
// String inputarr2[]=Arrays.copyOf(inputarr,2);
// System.out.println(Arrays.toString(inputarr2));
//
// //printing out the last 2 words of the Array.
// int len=inputarr.length;
// System.out.println(inputarr[len-1] +" "+inputarr[len -2]);
		
		
/*Get the dtring input from usre
 * convert to array with elments divided by comma from the enter string
 * print out the elements in the middle if there is odd number of elements 
 * and 2 in the middle is there is even number of elements
 * 
 * 
 * */	
		
//		 Scanner scan =new Scanner(System.in);
//		 System.out.println("Enter a Sentence: ");
//		 String input=scan.nextLine();
//		
//		 String inputarr[]=input.split(",");
//		 int len=inputarr.length;
//		 if(len%2==0) {
//			 System.out.println("lenth is even element of the middle is : "+inputarr[len/2]+" "+inputarr[(len/2)+1]);
//		 }else {
//			 System.out.println("lenth is odd element of the middle is : "+inputarr[len/2]);
//		 }

		/*Get the String input from usrer
		 * convert to array with elments divided by space from the enter string
		 * print out the first and last letter of the first element and the first and last letter of the last element.
		 * 
		 * 
		 * */		 
//
//		 Scanner scan =new Scanner(System.in);
//		 System.out.println("Enter a Sentence: ");
//		 String input=scan.nextLine();
//		  
//		
//		 String inputarr[]=input.split(" ");
//		 System.out.println(Arrays.toString(inputarr));
//		 int len=inputarr.length;
//		 
//		 int len1 =inputarr[0].length();
//
//		 System.out.println(" "+(inputarr[0]).charAt(0)+(inputarr[0].charAt(inputarr[0].length()-1)));
//		 System.out.println(" " +(inputarr[len-1].charAt(0))+inputarr[len-1].charAt(inputarr[len-1].length()-1));
	
		
		
/*
 * Get initial number of inputs as int from the user
 * Create 2D array with number of colums being 3 and as last element 
 * 2d arry
 * 
 * */ 
		
		//since the number of colums =3 we would need to use the / find out the number of rows 
		//so if user enter 12 for the intial input 
		
	
		
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		int lengthOfRaggedArray=num%3;  //find out the length of the regged Array 
		int numnerOfIntialRows=num/3;   //Find out the number of Rows
		String finalarry [][]=null;     // defing the final mulit array
		
		
		
		if(num%3==0) {  						     // if the user enter number that is divisvle by 3 
		finalarry=new String[numnerOfIntialRows][3];  //create array withnumber of intial rows 
		}else {
			String reggedArray[]=new String[lengthOfRaggedArray];  // define arry for the Rigged arry
			finalarry=new String[numnerOfIntialRows][3];    //Else create the multi array firt
			finalarry=Arrays.copyOf(finalarry, numnerOfIntialRows+1); // Create new arry by copping the multi arry and then adding one to the number of colums 
			finalarry[finalarry.length-1]=reggedArray;  // assing the last colum of the multi arry with the rigged array 
			
		}
 		
		System.out.println(Arrays.deepToString(finalarry));
}
}
