package pr1.sorting.lecture.demo;

import java.util.Arrays;

public class FibonacciSearch {
	// Method to find the minimum of two numbers
	private static int min(int x, int y) {
		return (x <= y) ? x : y;
	}
	// Fibonacci Search Method
	public static int fibonacciSearch(int arr[], int x) {
		int n = arr.length;
		// Initialize Fibonacci numbers
		int fibMMm2 = 0; // (m-2)'th Fibonacci number
		int fibMMm1 = 1; // (m-1)'th Fibonacci number
		int fibM = fibMMm2 + fibMMm1; // m'th Fibonacci number
		// Find the smallest Fibonacci number greater than or equal to n
		while (fibM < n) {
			fibMMm2 = fibMMm1;
			fibMMm1 = fibM;
			fibM = fibMMm2 + fibMMm1;
		}
		// Marks the eliminated range from the front
		int offset = -1;
		// While there are elements to be inspected
		while (fibM > 1) {
			// Check if fibMMm2 is a valid index
			int i = min(offset + fibMMm2, n - 1);
			// If x is greater than the value at index i, cut the subarray from offset to i
			if (arr[i] < x) {
				fibM = fibMMm1;
				fibMMm1 = fibMMm2;
				fibMMm2 = fibM - fibMMm1;
				offset = i;
			}
			// If x is less than the value at index i, cut the subarray after i
			else if (arr[i] > x) {
				fibM = fibMMm2;
				fibMMm1 -= fibMMm2;
				fibMMm2 = fibM - fibMMm1;
			}
			// Element found
			else {
				return i;
			}
		}
		// Compare the last element with x
		if (fibMMm1 == 1 && arr[offset + 1] == x) {
			return offset + 1;
		}
		// Element not found
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100 };
		int x = 22;
		int result = fibonacciSearch(arr, x);
		if (result >= 0)
			System.out.println("Found at index: " + result);
		else
			System.out.println("Element not found");
	}
}
