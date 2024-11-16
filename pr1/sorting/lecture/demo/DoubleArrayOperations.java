package pr1.sorting.lecture.demo;

import java.util.*;

class MyCustomException extends Exception {
	public MyCustomException(String message) {
		super("MyCustomException: " + message);
	}
}

public class DoubleArrayOperations {
	public static boolean isSortedAsc(double[] array) throws MyCustomException {
		if (array == null || array.length < 1) {
			throw new MyCustomException("Input array should not be null or empty.");
		}
		if (array.length == 1) {
			return true;
		}
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1])
				return false;
		}
		return true;
	}

	public static void sortInAsc(double[] array) throws MyCustomException {
		if (array == null || array.length < 1) {
			throw new MyCustomException("Input array should not be null or empty.");
		}

		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			double temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;

			System.out.println("Step " + (i + 1) + ": " + Arrays.toString(array));
		}
	}

	public static int binarySearch(double[] array, double key) throws MyCustomException {
		if (array == null || array.length == 0) {
			throw new MyCustomException("Input array should not be null or empty!");
		}

		if (!isSortedAsc(array)) {
			throw new MyCustomException("Input array is not sorted!");
		}

		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == key)
				return mid;
			if (array[mid] < key)
				left = mid + 1;
			else
				right = mid - 1;
		}

		return -1; // Key not found
	}

	public static void main(String[] args) {
		double arr[] = { 3.14, 1.2, 0, 2.5, 3.7, 4.1, -3.14 };
		double key = 3.14;
		try {
			System.out.println("Sorting array...");
			if (!isSortedAsc(arr)) {
				sortInAsc(arr);
			}
			System.out.println("Finding " + key + "...");
			System.out.println("Found at: " + binarySearch(arr, key));
		} catch (MyCustomException e) {
			System.out.println(e.getMessage());
		}
	}
}
