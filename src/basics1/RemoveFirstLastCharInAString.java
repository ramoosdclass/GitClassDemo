package basics1;

public class RemoveFirstLastCharInAString {

// Given a string, return a version without the first and last char, so "Hello"
// yields "ell". The string length will be at least 2.
// withoutEnd("Hello") → "ell"
// withoutEnd("java") → "av"
// withoutEnd("coding") → "odin

	public static void main(String[] args) {

		System.out.println(withoutEndAndBeginning("yawn"));

	}

	static String withoutEndAndBeginning(String string) {

		return string.substring(1, string.length() - 1);

	}

}
