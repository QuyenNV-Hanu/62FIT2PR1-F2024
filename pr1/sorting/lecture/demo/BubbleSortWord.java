package pr1.sorting.lecture.demo;

public class BubbleSortWord {

	// Method to sort an array of strings using bubble sort and print each step
	public static void sortWordsByBubbleSort(String[] wordsList) throws IllegalArgumentException {
		// Check for null or empty array
		if (wordsList == null || wordsList.length == 0) {
			throw new IllegalArgumentException("IllegalArgumentException: Input array cannot be null or empty");
		}

		int n = wordsList.length;
		boolean swapped;

		// Bubble sort algorithm
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (wordsList[j].compareTo(wordsList[j + 1]) > 0) {
					// Swap the elements
					String temp = wordsList[j];
					wordsList[j] = wordsList[j + 1];
					wordsList[j + 1] = temp;
					swapped = true;
				}
			}
			// Print the array after each pass
			System.out.println("Pass " + (i + 1) + ": " + java.util.Arrays.toString(wordsList));

			// If no two elements were swapped in the last pass, the array is already sorted
			if (!swapped)
				break;
		}
	}

	// Main method to test the sorting
	public static void main(String[] args) {
		try {
			String[] wordsList = {"same", "same", "same"};
			System.out.println("Initial array: " + java.util.Arrays.toString(wordsList));
			sortWordsByBubbleSort(wordsList);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
