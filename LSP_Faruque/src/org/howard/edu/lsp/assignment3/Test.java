package org.howard.edu.lsp.assignment3;

public class Test {
	
	/**
	 * Implement a test drive portion
	 */

	public static void main(String[] args) throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		for (int i=0; i<41; i += 4) {
			set1.add(i);
		}

		System.out.println("Value of Set1 is: " + set1.toString(set1.getArraylist()));
		System.out.println("Smallest value in Set1 is: " + set1.smallest());
		System.out.println("Largest value in Set1 is: " + set1.largest());


	    IntegerSet set2 = new IntegerSet();
	    for (int j=0; j<37; j += 3) {
			set2.add(j);
		}
	    System.out.println("Value of Set2 is: " + set2.toString(set2.getArraylist()));
		System.out.println("Smallest value in Set2 is: " + set2.smallest());
		System.out.println("Largest value in Set2 is: " + set2.largest());
		System.out.println("Are the two sets anything alike: ");
		
		System.out.println(set1.equals(set2));

		System.out.println("Value of Set1 is:" + set1.toString(set1.getArraylist()));
		System.out.println("Value of Set2 is:" + set2.toString(set2.getArraylist()));
		System.out.println("Union of Set1 and Set2: ");		
		set1.union(set2);	
		System.out.println("Intersect of Set1 and Set2: ");
		set1.intersect(set2);
		System.out.println("Difference of Set2 within Set1: ");
		set1.diff(set2);
		System.out.println("Difference of Set1 within Set2: ");
		set2.diff(set1);
		
		set1.clear();
		System.out.println("Checking if Set1 is empty: ");
		System.out.println(set1.isEmpty());
		
	}

}
