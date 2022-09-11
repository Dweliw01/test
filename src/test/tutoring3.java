package test;

public class tutoring3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /**
	     * Find if any element occurs 2 times in the array.
	     */
		
		
		
//		int arr[] = { 4, 5, 6, 7, 8, 9, 10 };
//
//		int i = arr.length - 1;
//		for (int num : arr) {
//			num = arr[i];
//			System.out.println(num);
//			i--;
//		}

//		String arr[] = { "aa", "bb", "cc", "bb", "ee", "ee", "ee", "tt" };
//
//		String temp;
//
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j =i+1; j < arr.length; j++) {
//				temp = arr[i];
//				if (arr[j].equals(temp)) {
//					System.out.println(arr[j]);
//				}
//			}
//		}
		/**
		 * Count occurrences of elements in an array 
		 *  "no value"
		 */
//
//		String arr[] = { "a", "b", "c", "b", "a", "a", "d", "e", "e", "e", "e", "f", "p" };
//
//		for (int i = 0; i < arr.length; i++) {
//			int count = 1;
//			for (int j = i + 1; j < arr.length; j++) {
//
//				if (arr[j].equals(arr[i]) && !arr[j].equals("no value")) {
//					count++;
//					arr[j] = "no value";
//				} else {
//					continue;
//				}
//
//			}
//			if (!arr[i].equals("no value")) {
//				System.out.println("Element <" + arr[i] + "> times " + count);
//			}
//
//		}
		/**
		    * Find min and max values in an array.
		    */
		
		
//		int arr[] = { 99, 5, 77, 4, 1, 55, 80, 34, 7, -4 };
//
//		int min=arr[0], max=arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j =i+1; j < arr.length; j++) {
//				if (arr[i] < min) {
//					min = arr[j];
//				} else if (arr[i] > max) {
//					max = arr[j];
//					;
//				}
//			}
//			
//
//		}
//		System.out.println("Min " + min);
//		System.out.println("Max " + max);
	
		/**
		 * Find 2 biggest values in array
		 */

		
		int[] arr = { 5, 7, 8, 55, 77, -4, 2, 1, 0 };
		int max=arr[0], max1=arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(max<arr[j]) {
					max=arr[i];
					max1=max;
					
				}else if(max1<max) {
					max1=arr[i];
				}
					
				

			}
		
		}
		System.out.println(max);
		System.out.println(max1);
	}
}
