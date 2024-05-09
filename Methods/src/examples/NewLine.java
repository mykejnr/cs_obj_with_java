package examples;

public class NewLine {
	
	public static void newLine() {
		System.out.println("");
	}
	
	public static void threeLines() {
		newLine(); newLine(); newLine();
	}

	public static void main(String[] args) {
		System.out.println("Michael Mensah");
		System.out.println("UGW0202220075");
		System.out.println("A Program that use Java methods to print new lines");
		System.out.println("------------------------");
		newLine();
		System.out.println("Line 1");
		threeLines();
		System.out.println("Line 2");
	}

}
