package basics1;

public class FizzyArrayPrintsActualContent {

	public static void main(String[] args) {
		int[] resultArray = numArray(5);

		for (int number : resultArray) {
			System.out.print(number);
		}
	}

	static int[] numArray(int n) {
		int[] resultArray = new int[n];

		for (int i = 0; i < n; i++)

			resultArray[i] = i;

		return resultArray;

	}
}
