package examples;

public class Square {
	
	public static void printSquare(int x) {
		System.out.println(x*x);
	}

	public static void main(String[] args) {
		System.out.println("Michael Mensah");
		System.out.println("UGW0202220075");
		System.out.println("A program with a method that accept one parameter\n");
		int value = 2;
		printSquare(value);
		printSquare(3);
		printSquare(value*2);
	}

}
