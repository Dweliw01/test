package test;

import java.util.Scanner;

public class burgerorchicken {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 String in = s.next();
	 
	 if(in.equalsIgnoreCase("burger")|| in.equalsIgnoreCase("chicken")) {
		 System.out.println("10.0");
	 }else if(in.equalsIgnoreCase("soda")) {
		 System.out.println("2.0");
	 }

	}

}







/*Instructions from your teacher:

a fast food company has two main order types, burger meal and chicken meal.

both have the same prices.

so if a cashier enters "burger" or "chicken" he will get the same price

a float : 10.0

this test can be done with one if.

check if in (string variable) equals "burger" or "chicken" and output the price 10.0

also if input is "soda" output 2.0 

for example:

in = "burger"

output: 10.0

in = "chicken"

output: 10.0

in = "soda"

output: 2.0

hint: OR operator in java is  || */