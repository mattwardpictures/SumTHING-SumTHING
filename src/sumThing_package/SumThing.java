package sumThing_package;

import java.util.Scanner;

public class SumThing {

	public static void main(String[] args) {

		/*
		 * GREETINGS are in order:
		 */

		System.out.println("Welcome to SUMTHING~~SUMTHING");
		System.out.println("=========by Matt Ward========");
		// Shameless attempt at funny title ^^ I like it, get off
		System.out.println(" "); // Brief description of the program's function:
		System.out.println("We'll parse two three-digit integers for their");
		System.out.println("ones, tens, and hundreds places, and sum them ");
		System.out.println("together.");
		System.out.println(" "); // User instructions are below:

		Scanner scnr = new Scanner(System.in);

		String number1String;
		String number2String;

		int number1;
		int number2;

		/*
		 * INPUT VALIDATION
		 */

		do {
			System.out.println("Please enter a three-digit integer and press Enter:");
			while (!scnr.hasNextInt()) {
				number1String = scnr.next();
				System.out.println(number1String + " is not a valid number. Please try again.");
			}
			number1 = scnr.nextInt();
		} while (((number1 > 999) || (number1 < 100)) && ((number1 > -100) || (number1 < -999)));

		do {
			System.out.println("Please enter 2nd three-digit integer and press Enter for final summing:");
			while (!scnr.hasNextInt()) {
				number2String = scnr.next();
				System.out.println(number2String + " is not a valid number. Please try again.");
			}
			number2 = scnr.nextInt();
		} while (((number2 > 999) || (number2 < 100)) && ((number2 > -100) || (number2 < -999)));

		summingEngine(scnr, number1, number2);

	}

	public static void summingEngine(Scanner scnr, int number1, int number2) {
		/*
		 * Breaking up the integers---pretty self-explanatory:
		 */

		int num1Ones = number1 % 10; // Parses ones...
		int num1Tens = (number1 / 10) % 10; // Parses tens...
		int num1Hundreds = (number1 / 100) % 10; // Parses hundreds...

		// Same below as above:
		int num2Ones = number2 % 10;
		int num2Tens = (number2 / 10) % 10;
		int num2Hundreds = (number2 / 100) % 10;

		// Sum containers (Boxes into which go our sums):
		int sumOnes;
		int sumTens;
		int sumHundreds;

		/*
		 * ¡¡¡SOLUTION!!!
		 */

		// The constituent parts of our integers are then summed...
		sumOnes = num1Ones + num2Ones;
		sumTens = num1Tens + num2Tens;
		sumHundreds = num1Hundreds + num2Hundreds;

		// ...And finally compared to each other. FIGHT!:
		if ((sumOnes == sumTens) && (sumTens == sumHundreds)) {
			System.out.println(" ");
			System.out.println("Summing digits...");
			System.out.println("Equality of hundreds, tens, and ones places is True. Huzzah!");
		} else {
			System.out.println(" ");
			System.out.println("Summing digits...");
			System.out.println("Equality of hundreds, tens, and ones places is False.");
			System.out.println("Better luck next time!");
		}
		scnr.close();

		// THE END, until next runtime...
	}

}
