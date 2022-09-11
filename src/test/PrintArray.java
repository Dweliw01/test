package test;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {
/*1. Create an array that contains numbers: 75, 30, 120, 4, 194, 222, 9;
2. Print the array
3. Print the array elements each in new line
4. Print only the numbers that are bigger than 100
5. Print the count of numbers that are bigger than 100
6. Print sum of the numbers in the array.
7. Print average value in the array.*/
		
		
		
		
		
		int arr[]= {5, 30, 120, 4, 194, 222, 9};
		System.out.println(Arrays.toString(arr));
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
						
		}
		System.out.println("Average value in the array.: "+sum/arr.length);
		
		
		int count=0;
		for(int j=0; j<arr.length; j++) {
		
					if(arr[j]>100) {
						count++;
							}
		}
	System.out.println("the count of numbers that are bigger than 100: "+count);

	
	}

}
