package basics1;

//Given 2 strings, return their concatenation, except omit the first char of each. 
//The strings will be at least length 1.
//nonStart("Hello", "There") → "ellohere"
//nonStart("java", "code") → "avaode"
//nonStart("shotl", "java") → "hotlava
public class OmitFirstChar {

	public static void main(String[] args) {
		
		System.out.println(nonStart("out", "bah"));
		

	}
	
	static String nonStart(String word1, String word2) {
		return word1.substring(1)+word2.substring(1);
	}

}
