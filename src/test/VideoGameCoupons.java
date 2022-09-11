package test;

import java.util.Scanner;

public class VideoGameCoupons {

	public static void main(String[] args) {
//		Instructions from your teacher:
//
//			Note: prerequisite - if-else statement
//
//			The video game machines at your local arcade output coupons according to how well you play the game. 
//			You can redeem 10 coupons for a candy bar or 3 coupons for a gumball. You prefer candy bars to gumballs. 
//			Write a program that defines a variable initially assigned to the number of coupons you win. 
//			Next, the program should output how many candy bars and gumballs you can get if you spend all of your coupons on candy bars first, and any remaining coupons on gumballs.
//			
		int numOfCoupons,Candies,Gumballs;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many Coupons do you have? :");
		numOfCoupons=scan.nextInt();
		if(numOfCoupons>=3) {
			Candies=numOfCoupons/10;
			numOfCoupons=numOfCoupons%10;
			System.out.println("Number of Candies: "+Candies);

			Gumballs=numOfCoupons/3;
			numOfCoupons=numOfCoupons%3;
			System.out.println("Number of Gumballs: "+Gumballs);
			
		}else{
			System.out.println("Not enough coupons");
		}
		
		
//			if you the coupons are not enough for any redeem, display message:
//
//			
//
//			`Example1:`
//
//			`Display prompt: "Enter number of coupons:"`
//
//			`13`
//
//			`Display prompt: "Number of Candies: 1"`
//
//			`Display prompt: "Number of Gumballs: 1"`
//
//			`Example2:`
//
//			`Display prompt: "Enter number of coupons:"`
//
//			`23`
//
//			`Display prompt: "Number of Candies: 2"`
//
//			`Display prompt: "Number of Gumballs: 1"`
//
//			`Example3:`
//
//			`Display prompt: "Enter number of coupons:"`
//
//			`2`
//
//			`Display prompt: "Not enough coupons"`

	}

 }
