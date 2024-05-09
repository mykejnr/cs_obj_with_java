package assignment1;

import java.util.*;

public class UnionOfSet {

	public static void main(String[] args) {
		
	      HashSet<String> set1 = new HashSet<String>();
	      HashSet<String> set2 = new HashSet <String>();
	      
	      set1.add("Mike");
	      set1.add("Emmanuel");

	      set2.add("Elizabeth");
	      set2.add("Janet");

	      set1.addAll(set2);
	      
	      
	      System.out.println("Union = "+ set1);
	}

}
