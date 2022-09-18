package test;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		int [] arr = {75, 30, 120, 4, 194, 222, 9};
		//System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			//System.out.println(arr[i]);
			sum+=arr[i];
			
		}
System.out.println(sum/arr.length);

	}

}
