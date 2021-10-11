/**
	 * @author Sarim Faruque
	 */

package org.howard.edu.lsp.assignment3;
import java.util.ArrayList;
import java.util.Collections;


public class IntegerSet  {

	// Hint: probably best to use an array list.  You will need to do a little research

	/**
	* We will store all integers in an array list
	* @class IntegerSet
	*/	
	private ArrayList<Integer> arraylist = new ArrayList<Integer>();
	// Default Constructor
	public IntegerSet() {
	}
	
	// Clears the internal representation of the set
/**
* This method will clear the array list
*/
public void clear() {
	getArraylist().clear();
};

// Returns the length of the set
/**
 * How many elements are in the array list?
 * @return arraylist.size() Returns the array list size
 */
public int length() {; // returns the length
	return getArraylist().size();
}
/*
              * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.
*/
/**
 * attribute checks if the two sets have identical values in all indices, otherwise it will return false
 * @param b : user inputs another set object to compare
 * @return check Returns a true or false
 */
public boolean equals(IntegerSet b) {
	boolean check = this.getArraylist().equals(b.getArraylist());
	return check;
}

/**
 * @param value: User will input a value to see if the set contains it
 * @return Returns a boolean to determine true or false
 */
// Returns true if the set contains the value, otherwise false
public boolean contains(int value) {;
	if (getArraylist().get(value) != null){
		return true;}
	else {
		return false;}
	}
	
 
//Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
/**
 * @return This will return the largest integer from the set
 * @throws IntegerSetException If the set is empty, we will throw an exception to inform the user
 */
public int largest() throws IntegerSetException  {
	if (this.getArraylist().isEmpty()) {
		throw new IntegerSetException("There are no elements in the arraylist");
	}
	else {
		
		int max = Collections.max(this.getArraylist());
		return max;	
	}
}; 

/**
 * @return This will return the smallest integer from the set
 * @throws IntegerSetException If the set is empty, we will throw an exception to inform the user
 */
//Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
public int smallest() throws IntegerSetException {
	if (this.isEmpty()) {
		throw new IntegerSetException("There are no elements in the arraylist");
	}
	else {
		
		int min = Collections.min(this.getArraylist());
		return min;	
	}
}

	// Adds an item to the set or does nothing it already there	
	//adds item to s or does nothing if it is in set

/**
 * @param item User enters an integer value to be stored in the set
 * If the set already contains such value, then the method does nothing
 */
 public void add(int item) {
 	int a = item;
 	if (this.getArraylist().contains(a)) {
	}
 	else {
 		this.getArraylist().add(item);
 	}
 			
 		
 		
 	};

	// Removes an item from the set or does nothing if not there; Throws a IntegerSetException of the set is empty
 	
 	/**
 	 * @param item This will find a user-inputted value in the set and remove it
 	 * @throws IntegerSetException If the set is empty, we will throw an exception to inform the user
 	 * If the value cannot be found in the set, then the method does nothing
 	 */
public void remove(int item) throws IntegerSetException {
	if (this.isEmpty()) {
		throw new IntegerSetException("There are no elements in the arraylist");
	}
	else {
		if (this.contains(item)){
			for (int i : this.getArraylist()) {
				if (getArraylist().get(i) == item) {
					getArraylist().remove(i);
					break;
				}
			}
		}
		else {
		}
	}
	
	
	
}


// Set union
/**
 * This method will print out values from both this object's set and another set
 * All duplicates will be removed
 * @param intSetb User will input another set to add
 */
public void union(IntegerSet intSetb) {
	ArrayList<Integer> union = new ArrayList<Integer>();
	int n = this.getArraylist().size();
	int x = intSetb.getArraylist().size();
	for (int i = 0; i < n; i++) {
		int a = this.getArraylist().get(i);
		union.add(a);
	}
	for (int i = 0; i < x; i++) {
		int a = intSetb.getArraylist().get(i);
		if (!union.contains(a)) {
			union.add(a);
		}
	}
	union.sort(null);
	System.out.println(this.toString(union));
	
}
/**
 * This method will print out only values that are contained from both sets
 * @param intSetb User will input another set to add 
 */
// Set intersection
public void intersect(IntegerSet intSetb) {
	ArrayList<Integer> intersect = new ArrayList<Integer>();
	int n = this.getArraylist().size();
	for (int i = 0; i< n; i++) {
		intersect.add(this.getArraylist().get(i));
	}
	intersect.retainAll(intSetb.getArraylist());
	intersect.sort(null);
	System.out.println(this.toString(intersect));
	
} 

// Set difference, i.e., s1 –s2
/**
 * This method will print out only values that are contained from one of each set, but not both
 * @param intSetb User will input another set to add
 */
public void diff(IntegerSet intSetb){
	ArrayList<Integer> difference = new ArrayList<Integer>();
	int n = this.getArraylist().size();
	for (int i = 0; i< n; i++) {
		difference.add(this.getArraylist().get(i));
	}
	difference.removeAll(intSetb.getArraylist());
	difference.sort(null);
	System.out.println(this.toString(difference));
}


//Returns true if the set is empty, false otherwise
/**
 * This method will determine if the set is empty or not
 * @return True if empty, false if not
 */
boolean isEmpty() {
	if (this.getArraylist().isEmpty()) {
		return true;
	}
	else {
		return false;
	}
}

// Return String representation of your set
/**
 * @param list Insert an array connected to the set
 * @return This method will convert the set into a string
 */
public String toString(ArrayList<Integer> list) {
	String a = "";
	int n = list.size();
	for(int i = 0; i < n; i++) {
		a = a + list.get(i).toString() + " ";
	}
	return a;
}

public ArrayList<Integer> getArraylist() {
	/**
	 * @return Return contents of the array
	 */
	return arraylist;
}

/**
@param arraylist insert an array list
*/

public void setArraylist(ArrayList<Integer> arraylist) {
	this.arraylist = arraylist;
}


}


