package first_exercise;


public class Circle_9 {
	public static void main(String[] arg) {
		double radius = 7.5;
		double r2 = Math.pow(radius, 2);
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * r2;
		
		System.out.print("Perimeter is = ");
		System.out.println(perimeter);
		
		System.out.print("Area is = ");
		System.out.println(area);
	}
}
