package pr1.sorting.lecture.demo;

import java.util.Arrays;

public class ExponentialSearch {

	// Function to perform binary search within a given range
	public static int binarySearch(int[] arr, int left, int right, int key) {
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == key)
				return mid;
			if (arr[mid] < key)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1; // Key not found
	}
	// Function to perform exponential search
	public static int exponentialSearch(int[] arr, int key) {
		int n = arr.length;
		// If the element is at the first position
		if (arr[0] == key)
			return 0;
		// Find range for binary search by repeated doubling
		int i = 1;
		while (i < n && arr[i] <= key)
			i = i * 2;
		// Perform binary search within the found range
		return binarySearch(arr, i / 2, Math.min(i, n - 1), key);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 10, 40, 45, 55, 66, 77, 88, 99 };
		int key = 77;

		int result = exponentialSearch(arr, key);
		if (result != -1)
			System.out.println("Element found at index: " + result);
		else
			System.out.println("Element not found in the array.");
	}
}
