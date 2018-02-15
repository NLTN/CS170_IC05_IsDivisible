
/*
    Nguyen, Nguyen
    CS A170
    02/14/2018

    IC05_IsDivisible
 */

import java.util.Scanner;

public class IsDivisible {

	public static void main(String[] args) {
		// Variables
		int x, y;
		Scanner consoleScanner = new Scanner(System.in);

		// Get the input from user
		System.out.print("Please enter a number for x: ");
		x = consoleScanner.nextInt();

		System.out.print("Please enter a number for y: ");
		y = consoleScanner.nextInt();

		// Close the scanner
		consoleScanner.close();

		// Decision statements
		if (x % y == 0) {
			System.out.println("\n" + x + " is divisible by " + y);
		} else {
			System.out.println("\n" + x + " is not divisible by " + y);
		}
	}
}