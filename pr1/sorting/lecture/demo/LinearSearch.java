package pr1.sorting.lecture.demo;

import java.io.*;

public class LinearSearch {
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	// Driver code
	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;

		// Function call
		int result = linearSearch(arr, x);
		if (result == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present at index " + result);
	}
}
