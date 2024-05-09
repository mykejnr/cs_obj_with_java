package first_exercise;

import java.util.Scanner;

public class ProductOfTwo_3 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		num1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Input second number: ");
		num2 = scanner.nextInt();
		
		scanner.close();
		
		result = num1 * num2;
		
		System.out.format("%d x %d = %d", num1, num2, result);
	}
}
