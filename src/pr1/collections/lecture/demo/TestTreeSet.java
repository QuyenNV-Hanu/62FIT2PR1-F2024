package pr1.collections.lecture.demo;

import java.util.*;

public class TestTreeSet {
	// Main driver method
	public static void main(String[] args) {
		// Creating a Set interface with
		// reference to TreeSet class
		// Declaring object of string type
		Set<String> ts = new TreeSet<>();

		// Elements are added using add() method
		ts.add("JSD");
		ts.add("For");
		ts.add("FITers");

		// Print all elements inside object
		System.out.println(ts); // Print: [FITers, For, JSD]
	}
}
