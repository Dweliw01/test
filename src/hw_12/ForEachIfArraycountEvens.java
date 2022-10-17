package hw_12;

import java.util.Scanner;

public class ForEachIfArraycountEvens {

	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
		 * 
		 * Given an array nums, calculate count of even numbers in nums and print out to
		 * console.
		 * 
		 * nums → [2, 1, 2, 3, 4]) → 3
		 * 
		 * nums → [2, 2, 0, 3, 5]) → 3
		 * 
		 * nums → [1, 3, 5, 7, 9]) → 0
		 */

		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
		int evencount = 0;

		for (int i : nums) {
			if (i % 2 == 0) {
				evencount += 1;
			}
		}
		System.out.println(evencount);
	}

}
