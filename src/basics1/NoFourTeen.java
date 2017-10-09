package basics1;

//Given an array of ints, return true if it contains no 1's or it contains no 4's.
//no14([1, 2, 3]) → true
//no14([1, 2, 3, 4]) → false
//no14([2, 3, 4]) → true
public class NoFourTeen {

	public static void main(String[] args) {
		
		int[] numbers = {2,2,4};
		System.out.println(noFourTeen(numbers));

	}

	static boolean noFourTeen(int[] numbers) {
		int ones = 0;
		int fours = 0;
		
//		//complex for loop is not for lazy people
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] == 1) {
//				ones++;
//			}
//			if (numbers[i] == 4) {
//				fours++;
//			}
//		}
		
		for(int number : numbers) {
			if (number == 1) {
				ones++;
		}
			if (number == 4) {
				fours++;
			}
		}
		if (ones == 0 || fours == 0) {
			return true;
		} else {
			return false;
		}
	}

}
