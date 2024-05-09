package assignment1;
import java.util.Scanner;

public class CompareThreeeNumbers {

		public static void main(String[] args) {
			int a, b, c;
			
			Scanner scanner = new Scanner(System.in);
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			
			int max = a;
			
			if (b > a) {
				max = b;
			}
			
			if (c > max) {
				max = c;
			}
			
			System.out.println("Highest number: " + max);
			
			scanner.close();
		}
}
