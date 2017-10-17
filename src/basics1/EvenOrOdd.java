package basics1;

public class EvenOrOdd {

	public static void main(String[] args) {

		// call/invoke method evenOrOdd which takes an argument(input) an integer
		evenOrOdd(5);
		printSomething();
		
		

	}

	private static void evenOrOdd(int number) {

		//if the number modulus 2(i.e remainder is 0), the number is odd
		if (number % 2 == 0) {
			System.out.println("number is even");
		}

		//else number is 0
		else
			System.out.println("number is odd");

	}
	
	static void printSomething() {
		System.out.println("somthing - i serve no purpose");
	}

}
