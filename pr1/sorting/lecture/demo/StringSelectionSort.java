package pr1.sorting.lecture.demo;

import java.util.Arrays;

public class StringSelectionSort {
	public static void sortWordsBySelectionSort(String[] words) {
		for (int i = 0; i < words.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			String currentMin = words[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < words.length; j++) {
				if (currentMin.compareTo(words[j]) > 0) {
					currentMin = words[j];
					currentMinIndex = j;
				}
			}
			// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				words[currentMinIndex] = words[i];
				words[i] = currentMin;
			}
			System.out.println("Step " + (i + 1) + ":" + Arrays.toString(words));
		}
	}

	public static void main(String[] args) {
		String[] words = { "banana", "apple", "grape", "cherry", "date", "zebra", "yak", "xylophone", "apple" };
		try {
			sortWordsBySelectionSort(words);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
