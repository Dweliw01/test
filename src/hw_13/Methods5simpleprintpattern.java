package hw_13;

public class Methods5simpleprintpattern {

	public static void main(String[] args) {
		/* Create a method printHollowRect that prints a 5 on 5 hollow rectangle: */
		printHollowRect();
	}

	static void printHollowRect() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
