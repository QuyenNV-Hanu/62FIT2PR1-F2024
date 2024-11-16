package pr1.sorting.lecture.demo;

import java.util.ArrayList;

public class LinearSearchOccurrence {

	public static int findLastOccurrence(ArrayList<String> list, String targetWord) {
		if (list == null) {
			throw new IllegalArgumentException("IllegalArgumentException: List cannot be null");
		}
		if (targetWord == null) {
			throw new IllegalArgumentException("IllegalArgumentException: Target word cannot be null");
		}

		// Traverse the list from the end to find the last occurrence
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals(targetWord)) {
				return i; // Return the index of the last occurrence
			}
		}
		return -1; // Return -1 if the word is not found
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("apple");
		list.add("cherry");
		try {
			System.out.println(findLastOccurrence(list, "apple"));
			System.out.println(findLastOccurrence(list, "banana"));
			System.out.println(findLastOccurrence(list, "grape"));
			System.out.println(findLastOccurrence(null, "apple"));
			System.out.println(findLastOccurrence(list, null));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
