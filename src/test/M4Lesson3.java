package test;
import java.util.*;
public class M4Lesson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
 * Asked user to enter password Desk45, only has 3 attempts 
 * 
 * Scanner scan = new Scanner(System.in);
		String password = "Desk45";
		
		for(int attempts = 3; attempts >= 1; attempts-- ) {
		System.out.println("Please enter password? ");
		String enteredPassword = scan.next();
		if (enteredPassword.equals(password)) {
			System.out.println("Welcome, You are signed in! Enjoy your day!");
			break;
		}else	{
			if (attempts > 1) {
				System.out.println("The password you entered is incorrect! \n Attempts left : " + (attempts - 1));
			} else {
				System.out.println("Your account is locked!");
				System.out.println("Try again in 15 minutes ");
			}

		}
		}
	*
	*above code works 
	*/
		
/*
Declare two strings - word and separator 
Declare int  count
Ask user to enter word, separator and count values
Assign entered values to variables and print a big string 
That is made of count occurrences of the word, separated by the separator string. 
without the last separator showing
 */
/*		String word ;
		String separator;
		int count;
		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		word = sc.next();
		
		
		System.out.println("Enter separator:");
		separator = sc.next();
		
		System.out.println("Enter count value:");
		count =sc.nextInt();
		
		 for( int i =1; i <= count; i++ ) {
			 
			 result += word + separator; 
		 }
		System.out.println(result.substring(0,result.lastIndexOf(separator)));
		
		*the above code works
		*/
		
	//Assembling the table/Nested loops(?)
		
		
/*	for (int leg =1; leg <= 4; leg++) {
		System.out.println("I am assembliung leg number: " + leg);
		
		for(int screw = 1; screw<=3; screw++ ) {
			System.out.println( " I'm tightening screw numerber " + screw);		
		}
		
	}	
		
	*the above code works
	*/	
	// Print following shape in console using nested loop 
	//	*****
	//  *****
    //	*****
		
/*	for ( int i = 1; i<=3; i++) { //outer loop
		for(int j=1; j<=5; j++) {
			System.out.print("*"); // inner loop
		}
	System.out.println(); // outside loop because inner loop will execute 5 times,and then that is the first time the outer loop has executed 
	}
	
	*
	*
	*/
	//** task for nested group 
		
/*	for(int i= 1; i<=5; i++) {
		for(int j = 1; j<=i; j++) {
			System.out.print(" " + j );
		}
		System.out.println( );
	}
		
	*
	*
	*/	
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Input number of rows needed:");
	int row = scan.nextInt();
	
	System.out.println("Input number of columns needed:");
	int column = scan.nextInt();
	
	int [][] arr =  new int[row][column];
	
	System.out.println(Arrays.deepToString(arr));
	
	for ( int i=0 ; i<row; i++) { // can also be  i<arr.length
		for(int j=0 ; j<column; j++) { //can also arr[i].length, i is added because this is column , and we base array that are 2D with coordinate  
			System.out.println("Enter value for row:[" + i + "] column [" + j + "]");
			arr[i][j] = scan.nextInt();
		}
	}System.out.println(Arrays.deepToString(arr));
		
	}


	}


