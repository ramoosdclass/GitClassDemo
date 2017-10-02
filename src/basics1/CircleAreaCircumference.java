package basics1;

import java.util.Scanner;

public class CircleAreaCircumference {

	// Write a program that takes radius from the user
	// and calculates the circumference and area

	// Hint:
	// Area = Math.PI * r * r
	// circumference = 2 * Math.PI * r

	// Create a class named CircleAreaCircumference
	// create a method that takes radius of type double that user
	// entered and returns area
	// create a method that takes radius of type double that user
	// entered and returns circumference
	// Main method
	// Take Users input
	// pass that input into a method that calculates area
	// pass that input into a method that calculates circumference

	public static void main(String[] args) {

		System.out.println("Please enter radius: ");
		double radius = new Scanner(System.in).nextDouble();

		System.out.println("The area is " + calculateArea(radius));
		System.out.println("The circumference is " + calculateCircumference(radius));

	}

	static double calculateCircumference(double radius) {

		return 2 * Math.PI * radius;
	}

	static double calculateArea(double radius) {
		return radius * radius * Math.PI;
	}

}
