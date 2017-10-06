package basics1;

public class Unluck13 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 2, 1, 13, 1};
		System.out.println(sum13(numbers));

	}

	static int sum13(int[] numList) {
		int total = 0;
		//for each number in the list
		for(int number : numList) {
			//if number is not equal to 13 
			//total = total + number
			if(number != 13) {
				total = total + number;
			}
			else {
				break;
			}
		}
		return total;
	}
}
