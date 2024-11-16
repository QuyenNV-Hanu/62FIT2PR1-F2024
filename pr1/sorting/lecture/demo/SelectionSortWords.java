package pr1.sorting.lecture.demo;

public class SelectionSortWords {

	public static void sortWordsBySelectionSort(String[] wordsList) {
		if (wordsList.length > 0) {
			System.out.print("Step 0: ");
			printArray(wordsList);
			int n = wordsList.length;
			// Selection sort algorithm
			for (int i = 0; i < n - 1; i++) {
				// Assume the current position is the smallest
				int minIndex = i;
				// Find the index of the smallest element in the unsorted part
				for (int j = i + 1; j < n; j++) {
					if (wordsList[j].compareTo(wordsList[minIndex]) < 0) {
						minIndex = j;
					}
				}
				// Swap the found minimum element with the first element
				String temp = wordsList[minIndex];
				wordsList[minIndex] = wordsList[i];
				wordsList[i] = temp;
				// Print the current step
				System.out.print("Step " + (i + 1) + ": ");
				printArray(wordsList);
			}
		} else {
			throw new NegativeArraySizeException("ArraySizeException: Array is empty!");
		}
	}

	// Helper method to print the array
	private static void printArray(String[] wordsList) {
		for (String word : wordsList) {
			System.out.print(word + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] words = {"apple", "apple", "apple", "apple"};
		try {
			sortWordsBySelectionSort(words);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
