package pr1.collections.lecture.demo;

import java.util.*;

class TestHashSet {
	public static void main(String[] args) {

		// Creating an empty HashSet
		HashSet<String> h = new HashSet<String>();

		// Adding elements into HashSet
		h.add("India");
		h.add("Australia");
		h.add("South Africa");

		// Adding duplicate elements
		h.add("India");

		// Displaying the HashSet
		System.out.println(h);
		System.out.println("List contains India or not:" + h.contains("India"));

		// Removing items from HashSet
		// using remove() method
		h.remove("Australia");
		System.out.println("List after removing Australia:" + h);

		// Display message
		System.out.println("Iterating over list:");

		// Iterating over hashSet items
		Iterator<String> i = h.iterator();

		while (i.hasNext())
			System.out.println(i.next());
	}
}
