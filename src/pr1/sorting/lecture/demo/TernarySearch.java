package pr1.sorting.lecture.demo;

public class TernarySearch {

	// Function to perform Ternary Search
	public static int ternarySearch(int[] arr, int left, int right, int target) {
		if (right >= left) {
			int mid1 = left + (right - left) / 3;
			int mid2 = right - (right - left) / 3;
			// Check if target is at mid1
			if (arr[mid1] == target) {
				return mid1;
			}
			// Check if target is at mid2
			if (arr[mid2] == target) {
				return mid2;
			}
			// If target is in the left one-third
			if (target < arr[mid1]) {
				return ternarySearch(arr, left, mid1 - 1, target);
			}
			// If target is in the right one-third
			if (target > arr[mid2]) {
				return ternarySearch(arr, mid2 + 1, right, target);
			}
			// If target is in the middle one-third
			return ternarySearch(arr, mid1 + 1, mid2 - 1, target);
		}
		// Target is not found
		return -1;
	}

	// Main method
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 7;
		int result = ternarySearch(arr, 0, arr.length - 1, target);

		if (result == -1) {
			System.out.println("Element not found.");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}
