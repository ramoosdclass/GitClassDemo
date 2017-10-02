package basics1;

public class SumAllTheElementsInAnArray {
	// No User input Just write the program in Main method
	// Write a program that sums(adds) all the elements in an
	// int[]

	// for(int i : arrayName){
	// }
	public static void main(String[] args) {

		int[] numberList = { 1, 2, 3, 4 };

		int sum = 0;
		for (int number : numberList) {
			// sum += number;(short and nifty version)
			sum = sum + number;

		}

		System.out.println("The sum of elements is " + sum);

	}

}
