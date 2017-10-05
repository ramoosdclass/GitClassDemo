package basics1;

public class CommonStringElementsInArray {
	
	public static void main(String[] args) {

		String[] arr1 = { "bob", "john", "doe", "ron", "jack" };
		String[] arr2 = { "mia", "lin", "linda", "tia", "lb", "jack", "doe" };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i].equals(arr2[j])) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
