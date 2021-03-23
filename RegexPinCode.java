package RegexPinCode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPinCode {
	public static void main(String[] args) {
		System.out.println("Welcome to the Regex part");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the PinCode: ");
		String pincode = sc.nextLine();
		
		boolean result = new RegexPinCode().validatePinCode(pincode);
		System.out.println(result);
	}
	
	public boolean validatePinCode(String pincode) {
		return Pattern.compile("[0-9]{6}").matcher(pincode).matches();
	}
}