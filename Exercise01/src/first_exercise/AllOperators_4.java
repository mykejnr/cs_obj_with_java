package first_exercise;

import java.util.Scanner;

public class AllOperators_4 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		num1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Input second number: ");
		num2 = scanner.nextInt();
		scanner.close();
		
		System.out.format("%d + %d = %d\n", num1, num2, num1+num2);
		System.out.format("%d - %d = %d\n", num1, num2, num1-num2);
		System.out.format("%d x %d = %d\n", num1, num2, num1*num2);
		System.out.format("%d / %d = %d\n", num1, num2, num1/num2);
		System.out.format("%d mod %d = %d\n", num1, num2, num1%num2);
	}

}
