package assignment1;

import java.util.Scanner;

public class Circle {
	
	// area = pr2
	// cir = 2pr

	public static void main(String[] args) {
		double radius;
		System.out.println("Enter radius: ");
		
		Scanner scanner = new Scanner(System.in);
		radius = scanner.nextDouble();
		
		double area = Math.PI * Math.pow(radius, 2);
		double circumfrence = 2 * Math.PI * radius; 
		
		System.out.println("Area: " + area);
		System.out.println("Circumfrence: " + circumfrence);
		
		scanner.close();
	}
	
//	public static double Area(double radius) {
//		return Math.PI * Math.pow(radius, 2);
//	}
//	
//	public static double Circumfrence(double radius) {
//		return 2 * Math.PI * radius;
//	}

}
