package assignment1;

public class Assignment {

	public static void main(String args[]) {

		int p = 1;
		int q = 2;
		int r = 3;

		p |= 4;
		
		System.out.println(p);

		q >>= 1;
		
		System.out.println(q);

		r <<= 1;
		
		System.out.println(r);

		p ^= r;

		System.out.println(p + " " + q + " " + r);

	}

}
