package pr1.sorting.lecture.demo;

public class ArrayCheck {

	public static boolean isSortedAsc(int[] array) throws Exception {

		if (array == null) {
			throw new Exception("Array cannot be null.");
		}

		if (array.length == 0) {
			throw new Exception("Array cannot be empty.");
		}

		// Check if array is sorted
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static boolean isSortedDesc(int[] array) throws Exception {

		if (array == null) {
			throw new Exception("Array cannot be null.");
		}

		if (array.length == 0) {
			throw new Exception("Array cannot be empty.");
		}

		// Check if array is sorted
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		try {
			// Test case 1: ASC Sorted array
			int[] ascSortedArray = { 1, 2, 3, 4, 5 };
			System.out.println(isSortedDesc(ascSortedArray));

			// Test case 2: Unsorted array
			int[] unsortedArray = { 1, 3, 2, 4, 5 };
			System.out.println(isSortedDesc(unsortedArray));

			// Test case 3: ASC Sorted array
			int[] descSortedArray = { 5, 4, 3, 2, 1 };
			System.out.println(isSortedDesc(descSortedArray));

			// Test case 4: ASC Sorted array
			int[] descSortedArrayWithDup = { 5, 4, 4, 3, 2, 1 };
			System.out.println(isSortedDesc(descSortedArrayWithDup));

			// Test case 5: ASC Sorted array
			int[] singleElementArray = { 5 };
			System.out.println(isSortedDesc(singleElementArray));

			// Test case 6: Null array
			int[] nullArray = null;
			System.out.println(isSortedDesc(nullArray));

			// Test case 7: Empty array
			int[] emptyArray = {};
			System.out.println(isSortedDesc(emptyArray));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
