package test;

import java.util.Scanner;

public class loopsPractice {

	public static void main(String[] args) {

		/* What is an infinite loop? Write the code for an infinite loop. */

//		int x = 1;
//		while (!(x == 0)) {
//			System.out.println(x);
//			x++;
//		}
		/**************************************************************************************************
		 * /* Problem 2: 1. Write a for loop that displays the following set of numbers:
		 * Output: 0, 10, 20, 30, 40, 50, ... 1000
		 */
		/*****************************************************************************************************/
//		
//		for (int i = 0; i <= 1000; i = i + 10) {
//			System.out.print(i + " ");
//		}

		/**********************************************************************************************************
		 * Write an input validation loop that asks the user to enter a number in the
		 * range of 1 through 5. Example 1: Enter a number from 1 to 5: Input: 4 Output:
		 * 1 2 3 4
		 * 
		 * 
		 * Example 2: Enter a number from 1 to 5: Input: 2 Output: 1 2 /
		 *************************************************************************************************************/

//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a number from 1 to 5:");
//		int num = input.nextInt();
//		for (int i = 1; i <= num; i++) {
//			System.out.print(i + " ");
//		}

		/*****************************************************************
		 * Problem 4: Write an input validation loop that asks the user to enter the
		 * words “yes” or “no”.*
		 ****************************************************************/
// 
//		String ans;
//		do {
//			Scanner input = new Scanner(System.in);
//			System.out.println("enter the words yes or no");
//			ans = input.next();
//		
//		} while (!(ans.equals("no") || (ans.equals("yes"))));

		/************************************************************************************
		 * Problem 5: Given following code: int count = 0; for (int x = 10; x <= 20; x
		 * += 2) { System.out.println(x); for(int y = x; y >= 0; y -= 1) { count = count
		 * + 1; System.out.println(x); } } Rewrite the code using while instead of for .
		 * What is the final value of count?
		 ***********************************************************************************/
//
//	
//		int num = 10;
//
//		while (num <= 20) {
//			System.out.println(num);
//			int num1 = num;
//			while (num1 >= 0) {
//				System.out.println(num);
//				num1 = num1 - 1;
//			}
//			num = num + 2;
//		}

		/*************************************************************************
		 * Problem 6: Sum of Numbers
		 * 
		 * Loops Practice 2 Write a program that asks the user for a positive non-zero
		 * integer value. The program should use a loop to get the sum of all the
		 * integers from 1 up to the number entered. For example, if the user enters 50,
		 * the loop will find the sum of 1, 2, 3, 4, . . . , 50. Example 1: Enter a
		 * positive number: Input: 5 Output: 15 Example 2: Enter a positive number:
		 * Input: 50 Output: 1275
		 ***************************************************************************/

//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a positive non-zerointeger value");
//		int usr_input = input.nextInt();
//		int sum = 0;
//		for (int i = 0; i <= usr_input; i++) {
//			sum += i;
//		}
//		System.out.println("your SUM is :" + sum);

		/************************************************************************************
		 * Problem 7: Distance
		 * 
		 * Traveled The distance a vehicle travels can be calculated as follows:
		 * Formula: Distance = Speed * Time For example, if a train travels 40 miles per
		 * hour (mph) for three hours, the distance traveled is 120 miles
		 * 
		 * Design a function(method) that takes two parameters, the speed of a vehicle
		 * (in miles per hour) and the number of hours it has traveled. Method name
		 * should be getDistance that returns the distance, in miles, that the vehicle
		 * has traveled.
		 * 
		 * In main method create a program that uses a loop and the method getDistance()
		 * to display the distance a vehicle has traveled for each hour of a time period
		 * specified by the user.
		 * 
		 * For example, if a vehicle is traveling at 40 mph for a three-hour time
		 * period, it should display a report similar to the one shown here.
		 *
		 * Hour Distance Traveled 1 40 2 80 3 120
		 * 
		 * 
		 * 
		 * Input Validation: Do not accept a negative number for speed, and do not
		 * accept any value less than one for time traveled.
		 * 
		 * Hints: Use user input to take what was the hours traveled and the speed of
		 * the vehicle
		 * 
		 * Use the hours traveled in loop condition to be able to display for each hour
		 * how much the vehicle has traveled
		 * 
		 * Call the method getDistance() and pass the current hour we are trying to get
		 * the distance for and the speed as parameters.
		 * 
		 * Use a formatted print statement to output the hour and the distance traveled.
		 * 
		 * Remember the distance traveled is calculated in getDistance() method.
		 * 
		 * 
		 * Example: Enter hours traveled: 5 Enter vehicle speed: 25 Hour Distance
		 * Traveled 1 25 2 50
		 **************************************************************************************************/
		
		Scanner input = new Scanner(System.in);
		System.out.println("what was the hours traveled");
		int hours = input.nextInt();
		System.out.println("what was the speed of the vechicle");
		double speed = input.nextDouble();
		System.out.println("Hour" + "\t" + "Distance Traveled");
		for (int i = 1; i <= hours; i++) {

			System.out.println(i + "\t" + getDistance(speed, i));

		}
		
		
		/************************************************************************************************************
		 * Problem 7: Is Abecedarian
		 * 
		 *  A word is abecedarian if the letters in the word
		 * appear in alphabetical order. For example, the following are all 6-letter
		 * English abecedarian words:
		 * 
		 * abdest, acknow, acorsy, adempt, adipsy, agnosy,
		 * befist, behint, beknow, bijoux, biopsy, cestuy, chintz, deflux, dehors,
		 * dehort, deinos, diluvy, dimpsy 
		 * 
		 * 
		 * Write a method called isAbecedarian that takes
		 * a String and returns a boolean indicating whether the word is abecedarian or
		 * not. Assume that the word can be only lowercase. 
		 * 
		 * 
		 * Enter a word: biopsy Output:
		 * true
		 * 
		 * Enter a word: omar Output: 
		 * false
		 * 
		 * 
		 * 
		 * ***************************************************************************************************/

//			System.out.println(isAbecedarian("acknow"));

	}

	public static boolean isAbecedarian(String word) {
		if (word.length() <= 1) {
			return true;
		}
		word.toLowerCase();

		for (int i = 1; i <= word.length(); i++) {

			if (word.charAt(i - 1) < word.charAt(0)) {
				return false;
			}
		}
		return true;
	}

	public static double getDistance(double speed, int hours) {

		double distanc_taveld = speed * hours;

		return distanc_taveld;
	}
}
