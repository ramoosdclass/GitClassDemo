package basics1;

public class FizzyArrayThatPrintsRemotes {
	
	public static void main(String[] args) {

		System.out.println(fizzyArray(5));

	}

	static int[] fizzyArray(int n) {
		int[] resultArray = new int[n];

		for (int i = 0; i < n; i++) {
			resultArray[i] = i;
		}

		return resultArray;

	}

}
