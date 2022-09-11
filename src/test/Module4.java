package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Module4 {

	public static void main(String[] args) {

//		String daysOfWeek []= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//		System.out.println(daysOfWeek.length);
//		System.out.println(daysOfWeek[0]);
////for loop i created to iterate through the array
//		
//		for (int i=0; i<daysOfWeek.length; i++) {
//			System.out.println(daysOfWeek[i]);
//		}
//		
//// Print all content of the arrays using a method from the arrys class 
//		System.out.println(Arrays.toString(daysOfWeek));
//		
//		
//		
//		String workdays []= {"Monday","Tuesday","Wednesday","Thursday","Friday"};
//		
//		
//		System.out.println(Arrays.toString(workdays));
//		int length= workdays.length;
//		System.out.println(length);
//		System.out.println(workdays[3].length());
		
		
		
		
//		int numbers[]= {10,20,30};
//		int sum=numbers[0]+numbers[2];
//		System.out.println(sum);
		
//		
//		String fruits []= {"Apples","Pear","Plum"};
//		System.out.println(Arrays.toString(fruits));
//	
//		System.out.println(fruits[0].indexOf("es"));
//		
//		int num[];
//		num =new int[5];
//		System.out.println(Arrays.toString(num));
//		num[0]= 55;
//		num[1]= 443;
//		num[2]= 12;
//		num[3]= 5;
//		num[4]= 387;
//		System.out.println(Arrays.toString(num));
//		
//		num[2]=212;
//		System.out.println(Arrays.toString(num));
//		System.out.println(num.length);
//		String daysOfWeek []= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//		System.out.println(Arrays.toString(daysOfWeek));

	// First Method;
//		int userinput[]=new int[5];
//	
//		Scanner input= new Scanner(System.in);
//		System.out.println("Enter 1st numbers");
//		userinput[0]=input.nextInt();
//		System.out.println("Enter 2nd numbers");
//		userinput[1]=input.nextInt();
//		System.out.println("Enter 3rd numbers");
//		userinput[2]=input.nextInt();
//		System.out.println("Enter 4th numbers");
//		userinput[3]=input.nextInt();
//		System.out.println("Enter 5th numbers");
//		userinput[4]=input.nextInt();
//		System.out.println(Arrays.toString(userinput));
//		int sum =userinput[0]+userinput[1]+userinput[2]+userinput[3]+userinput[4];
//		System.out.println("this is the Sum of your numbers : "+ sum);
//		
		
		
		
		//Second Method 
		
//		Scanner input= new Scanner(System.in);
//		System.out.println("Enter 5 numbers");
//		int decimals[]= {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//		System.out.println(Arrays.toString(decimals));
//		System.out.println(decimals[0]+decimals[1]+decimals[2]+decimals[3]+decimals[4]);
		
		
		
		
		
		
		
		
		
		
//		// Arrays plus Methods
//		
//		int nums[]= {1,2,3,4,5,6};
//		double temp[]= {12.5,66.8,99.0};
//		String arr[]= {"One","Two","Three"};
//		
//		System.out.println(Arrays.toString(nums));
//		System.out.println(Arrays.toString(temp));
//		System.out.println(Arrays.toString(arr));
//		
//		String fruit []= {"Plum","Orange","Apple","Pear"};
//		//sorts in Acc order 
//		Arrays.sort(fruit);
//		System.out.println(Arrays.toString(fruit));
//		
//		//sort in desc order 
//		Arrays.sort(fruit, Collections.reverseOrder());
//		System.out.println(Arrays.toString(fruit));
//		
//		// when doing reverse sort with an interger arrays you have to use wrapper Integer
//		Integer num[]= {1,2,3,4,5};
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
//		
//		Arrays.sort(num,Collections.reverseOrder());
//		System.out.println(Arrays.toString(num));

//		double nums[]= {1,2,3,4,5,6};
//		double temp[]= {12.5,66.8,99.0};
//		String arr[]= {"One","Two","Three"};
//// Copy of Arry to new arry and also list the number of items you want on the Array
//		
//		double newarray[]=Arrays.copyOf(temp, 10);
//		System.out.println(Arrays.toString(newarray));		
//		System.out.println(Arrays.equals(nums, temp));
		
		
//               	MULTI-DIMENSIONAL-ARRYS (2D Arrays)
		
		//in the 2D arays we use 2 brakets
		//
		
//		
//						//    0   1  2  3  4
//		int multiArrsy[][]= {{10,20,30,40,50},   //Row 0
//							 {60,70,80,90,100},  //Row 1
//							 {-10,-20,-30,-40,-50}};  //Row 2  
//		
//		//Row first then Column
//		
//		System.out.println(multiArrsy[1][2]);
//		//10
//		System.out.println(multiArrsy[0][0]);
//		//100
//		System.out.println(multiArrsy[1][4]);
//		//-40
//		System.out.println(multiArrsy[2][3]);
//		//Print the content of 2d Arrays
//		multiArrsy[2][0]=55;
//		System.out.println(Arrays.deepToString(multiArrsy));
			
		
		
//		int multiArrsy[][]= {{10,20,30,40,50},   
//				 			 {60,70,80,90,100},  
//				 			 {-10,-20,-30,-40,-50}};
//		
//		//get the length of a 2d array or get the number of rows
//		
//		System.out.println(multiArrsy.length);
		
		// option 2 of declaration of 2D array 
//		int number[][]= new int[3][4];
//		System.out.println(Arrays.deepToString(number));
		
		
//		//populate the 2D Array
//		//Row1
//		number[0][0]=10;
//		number[0][1]=20;
//		number[0][2]=30;
//		number[0][3]=40;
//		
//		
//		number[1][0]=11;
//		number[1][1]=22;
//		number[1][2]=33;
//		number[1][3]=44;
//		
//		number[2][0]=-10;
//		number[2][1]=-20;
//		number[2][2]=-30;
//		number[2][3]=-40;
//		
//		System.out.println(Arrays.deepToString(number));
//		
		
//		
//		
//		//Jagged Arrays - The inner arrays have different lengths
//		
//		String fruit[][]= {{"Apple","Bananna","Kiwi"},
//							{"Orange"},
//							{"Pinapple","Peach","Melon","Grape","Mango","Fig"}};
//		
//		System.out.println(Arrays.deepToString(fruit));
//		System.out.println(fruit.length);
//							
//		
//		// to get each row's length we use arrayname[row index].length 
//		
//		System.out.println("The length of the First row is: "+fruit[0].length);
//		System.out.println("The length of the Second row is: "+fruit[1].length);
//		System.out.println("The length of the Third row is: "+fruit[2].length);
		
		
		
		//When we declared an 2d array the size of the rows is required 
		//the size of the columns is optional 
//		
//		int myArray[][]=new int[2][];
//		System.out.println(Arrays.deepToString(myArray));
//		
//		
//		myArray[0]=new int[5];
//		myArray[1]=new int[10];
//		
//		myArray[0][0]=100;
//		myArray[0][1]=100;
//		System.out.println(Arrays.deepToString(myArray));
//		
		
		
//		int[] arr1 = { 20, 88, 99, 77, 90 };
//		int[] arr2 = { 1, 2, 3, 5, 8, 13 };
//		
//		int [][] arr2D = {arr1,arr2};
//		System.out.println(Arrays.deepToString(arr2D));
		
		
		
//	String colors[][]= {{"red","Yellow","blue"},
//						{"Orange","green","purple"}
//	};
//	
//	System.out.println(Arrays.deepToString(colors));
//	System.out.println("My Favorite color is "+colors[1][2]);
//	colors[0][1]="pink";
//	System.out.println("My Favorite color is "+colors[0][1]);
		
		
		
		//Print out the sum of the numbers in the second row of the "table" array. (It should print 18.)
		int[][] table = { {1,4,9},
						  {11,4,3},
						  {2,2,3} ,
						  {5,8,4}};
		//Print length of the table array
		System.out.println("length of the table array "+table.length);
		//Print length of the first row
		System.out.println("length of the first row "+table[0].length);
		
		int sum=table[1][0]+table[1][1]+table[1][2];
		System.out.println("your sum is: " +sum);
				
		
		
		
		
		
	}

}


