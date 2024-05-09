package assignment1;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int a, b, sum;
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		sum = a + b;
		
		System.out.println("Sum = " + sum);

		scanner.close();
	}

}
