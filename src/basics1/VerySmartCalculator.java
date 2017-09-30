package basics1;

import java.util.Scanner;

public class VerySmartCalculator {

	public static void main(String[] args) {
		
		
		System.out.println("Enter number1: ");
		int number1 = new Scanner(System.in).nextInt();
		
		System.out.println("Enter number2: ");
		int number2 = new Scanner(System.in).nextInt();
		
		System.out.println("Enter operation to be performed: ");
		String  operation = new Scanner(System.in).next();
		
		calculate(number1, number2, operation);
		
		

	}

	private static void calculate(int number1, int number2, String operation) {
		
		int result;
		if(operation.equals("+")) {
			result = number1 + number2;
			System.out.println("THe sum is: " + result);
		}
		
		else if(operation.equals("-")) {
			result = number1 - number2;
			System.out.println("THe difference is: " + result);
		}
		else if(operation.equals("*")) {
			result = number1 * number2;
			System.out.println("THe product is: " + result);
		}
		else if(operation.equals("/")) {
			result = number1 / number2;
			System.out.println("THe quoitent is: " + result);
		}
		else {
			System.out.println("invalid operation");
		}
		
	}
	
	
}