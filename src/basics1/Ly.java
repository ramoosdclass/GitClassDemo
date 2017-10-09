package basics1;
//Given a string, return true if it ends in "ly".
//endsLy("oddly") → true
//endsLy("y") → false
//endsLy("oddy") → false
public class Ly {

	public static void main(String[] args) {
		
		System.out.println(endsLY("spar"));
		

	}
	
	
	static boolean endsLY(String word) {
		if(word.length() < 2) {
			return false;
		}
		
		else if(word.substring(word.length() -2).equals("ly")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
