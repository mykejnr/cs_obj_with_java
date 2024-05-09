package first_exercise;
import java.util.Scanner;

public class Average_10 {
	public static void main(String[] args) {
		int num1, num2, num3;
		double result;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter first number: ");
			num1 = scanner.nextInt();
			
			System.out.println("Enter second number: ");
			num2 = scanner.nextInt();
			
			System.out.println("Enter third number: ");
			num3 = scanner.nextInt();
			
			result = (num1 + num2 + num3) / 3;
			
			System.out.format("Averate is = %f", result);
		}
	}
}
