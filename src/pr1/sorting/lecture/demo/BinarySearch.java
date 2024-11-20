package pr1.sorting.lecture.demo;

import java.io.*;

public class BinarySearch {

	// Returns index of key if it is present in arr[].
	public static int binarySearch(int arr[], int key) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			// Check if key is present at mid
			if (arr[mid] == key)
				return mid;
			// If key greater, ignore left half
			if (arr[mid] < key)
				low = mid + 1;
			// If key is smaller, ignore right half
			else
				high = mid - 1;
		}
		// If we reach here, then element was
		// not present
		return -1;
	}

	// Driver code
	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 4;
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println("Element is not present in array");
		else
			System.out.println("Element is present at " + "index " + result);
	}
}
