package basics1;

import java.util.Scanner;

public class RectangleAreaPerimeter {

	// Write a Java program to print the area
	// and perimeter of a rectangle by taking width and height
	// of rectangle from the user.

	// Area = height * width;
	// perimeter = 2 * (height + width);

	public static void main(String[] args) {

		System.out.println("Please enter height: ");
		double height = new Scanner(System.in).nextDouble();

		System.out.println("Please enter width: ");
		double width = new Scanner(System.in).nextDouble();

		System.out.println("The area of rectangle is " + calculateArea(height, width));
		System.out.println("The perimeter of rectangle is " + calculatePerimeter(height, width));

	}

	static double calculateArea(double height, double width) {
		return height * width;
	}

	static double calculatePerimeter(double height, double width) {
		return 2 * (height + width);
	}

}
