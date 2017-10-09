package basics1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.print("Input the number(Table to be calculated): ");

		int number = new Scanner(System.in).nextInt();

		System.out.println("\n");
		for (int i = 0; i <= 10; i++) {

			System.out.println(number + " X " + i + " = " + number * i);
		}

	}

}
