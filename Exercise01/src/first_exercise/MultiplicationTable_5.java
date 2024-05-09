package first_exercise;

import java.util.Scanner;

public class MultiplicationTable_5 {
	public static void main(String[] args) {
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		num = scanner.nextInt();
		scanner.nextLine();
		scanner.close();
		
		int answer;
		
		for (int i=1; i<=10; i++) {
			answer = num * i;
			System.out.format("%d x %d = %d\n", num, i, answer);
		}
	}
}
