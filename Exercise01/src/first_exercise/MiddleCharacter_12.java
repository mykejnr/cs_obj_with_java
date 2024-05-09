package first_exercise;

import java.util.Scanner;

public class MiddleCharacter_12 {
	public static void main(String[] args) {
		System.out.print("Input a string: ");
		
		try (Scanner scanner = new Scanner(System.in)) {
			String value = scanner.nextLine();
			String middle = Middle(value);
			
			System.out.format("\nThe middle character(s) in '%s': %s", value, middle);
		}
	}
	
	public static String Middle(String value) {
		float mid = value.length() / 2;
		String middleChar;
		
		if (value.length() % 2 == 0) {
			middleChar = value.substring((int)mid - 1, (int)mid+1);
		} else {
			int index = Math.round(mid);
			middleChar = String.valueOf(value.charAt(index));
		}
		
		return middleChar;
	}
}
