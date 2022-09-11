package test;

import java.util.Scanner;

public class ApartmentLeasing {

	public static void main(String[] args) {

			int numberOfBedrooms;
			Scanner scan=new Scanner(System.in);
			System.out.println("How many Bedrooms are you looking for? :");
			numberOfBedrooms=scan.nextInt();

			if(numberOfBedrooms==1) {
				System.out.println("One Bedroom Selected");
				System.out.println("set startingPrice as $1100");
				
			}else if(numberOfBedrooms==2) {
				System.out.println("Two Bedroom Selected");
				System.out.println("set startingPrice as $1850");
			}else if(numberOfBedrooms==3) {
				System.out.println("Three Bedroom Selected");
				System.out.println("set startingPrice as $2550");
			}else {
				System.out.println("No such Bedrooms available");
				System.out.println("Starting Price: $value");
			}
		
   

	}

}
