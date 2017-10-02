package basics1;

import java.util.Scanner;

public class VerySmartCalculator {

	public static void main(String[] args) {
		System.out.println("Please enter number1: ");
		int number1 = new Scanner(System.in).nextInt();

		System.out.println("Please enter number2: ");
		int number2 = new Scanner(System.in).nextInt();

		System.out.println("Please enter the operation to be performed: ");
		String operation = new Scanner(System.in).next();

		calculate(number1, number2, operation);

	}

	static void calculate(int number1, int number2, String operation) {

		int result;
		if (operation.equals("+")) {
			result = number1 + number2;
			System.out.println("The sum is: " + result);
		} else if (operation.equals("-")) {
			result = number1 - number2;
			System.out.println("The difference is: " + result);
		} else if (operation.equals("*")) {
			result = number1 * number2;
			System.out.println("The product is: " + result);
		} else if (operation.equals("/")) {
			result = number1 / number2;
			System.out.println("The quoitent is: " + result);
		} else {
			System.out.println("Invalid Operation enter either +, -, * or /");
		}

	}

}
