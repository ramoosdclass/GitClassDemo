package basics1;

import java.util.Scanner;

//Write a Java method to check whether a string is a valid password.
//Password rules:
//- A password must have at least ten characters.
//- A password consists of only letters and digits.
//- A password must contain at least two digits.


public class Password {
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Please enter the password: ");
		System.out.print("1. A password must have at least eight characters.\n"
				+ "2. A password consists of only letters and digits.\n"
				+ "3. A password must contain at least two digits \n"
				+ "Input a password (You are agreeing to the above Terms and Conditions.): ");
		String password = new Scanner(System.in).next();
	
		
		if(isPasswordValid(password)) {
			System.out.println("Your password " + password + " is Valid" );
		}
		else {
			System.out.println("Your password " + password + " is invalid");
		}
		
		
		
	}
	
	static boolean isPasswordValid(String password) {
		
		if(password.length() < 10) {
			return false;
		}
		
		int letterCount = 0;
		int digitCount = 0;
		
		for(int i=0; i <= password.length()-1; i++ ) {
			char eachCharInPassword = password.charAt(i);
			
			eachCharInPassword = Character.toUpperCase(eachCharInPassword);
			//to check to see if each char in password is a letter
			//letters are between A-Z
			if(eachCharInPassword >= 'A' && eachCharInPassword <= 'Z') {
				letterCount++;
				
			}
			
			if(eachCharInPassword >= '0' && eachCharInPassword <= '9') {
				digitCount++;
				
			}
		}
		
		//the number of letters in the password are more than 1
		//and if number of digits in the password are more than or equals 2
		if(letterCount > 1 && digitCount >= 2) {
			return true;
		}
		else
			return false;
	}
	
	
	
	

}
