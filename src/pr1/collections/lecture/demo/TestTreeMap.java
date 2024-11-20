package pr1.collections.lecture.demo;

import java.util.*;

public class TestTreeMap {
	public static void main(String[] args) {
		// Creating a TreeMap
		TreeMap<String, Integer> treeMap = new TreeMap<>();

		// Adding key-value pairs to TreeMap
		treeMap.put("Apple", 50);
		treeMap.put("Banana", 30);
		treeMap.put("Cherry", 20);
		treeMap.put("Date", 40);

		// Displaying the TreeMap (keys will be sorted)
		System.out.println("TreeMap: " + treeMap);

		// Accessing a value using a key
		System.out.println("Price of Banana: " + treeMap.get("Banana"));
	}
}
