package basics1;

public class StringTimes {

	public static void main(String[] args) {
		System.out.println(stringTimes("BLAH", 2));
	}

	static String stringTimes(String str, int n) {
		String temp = "";
		for (int i = 0; i < n; i++)
			temp += str;
		return temp;

	}

}
