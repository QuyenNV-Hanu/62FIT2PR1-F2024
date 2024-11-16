package pr1.sorting.lecture.demo;

public class LinearSearchString {
	public static int linearSearchWord(String[] dictionary, String targetWord) {
		System.out.println("Looking for..." + targetWord);
		// Step 1: Traverse the array
		for (int i = 0; i < dictionary.length; i++) {
			System.out.print("Step " + (i + 1) + ": Index i = " + i);
			// Step 2: Compare each element with the target word
			if (dictionary[i].equals(targetWord)) {
				System.out.print(", word '" + targetWord + "' found at " + i + "\n");
				// Step 3: Return the index if the target is found
				return i;
			}
			System.out.print(", word '" + targetWord + "' not found\n");
		}
		// Step 4: Return -1 if the target word is not found
		return -1;
	}

	public static void main(String[] args) {
		String[] words = {};
		String target = "mango";
		int result = linearSearchWord(words, target);
		if (result != -1) {
			System.out.println("Word found at index: " + result);
		} else {
			System.out.println("Word not found in the array.");
		}
	}

}
