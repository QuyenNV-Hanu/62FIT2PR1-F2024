package pr1.sorting.lecture.demo;

import java.io.*;
import java.util.*;

public class Test {

	public static void insertionSort(int[] arr) {
//		int i = 1;
//		int currentElement = arr[1];
//		int j;
//		for (j = i - 1; j >= 0 && arr[j] > currentElement; j--) {
//			arr[j + 1] = arr[j];
//		}
//		arr[j + 1] = currentElement;

		for (int i = 1; i < arr.length; i++) {
			int currentElement = arr[i];
			int j;
			for (j = i - 1; j >= 0 && arr[j] > currentElement; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = currentElement;
			System.out.println("Step " + i + ": " + Arrays.toString(arr));
		}

	}

	public static void selectionSort(int[] arr) {
//		int i = 0;
//		int min = arr[0];
//		int minIndex = 0;
//		// find min index
//		for (int j = 0; j < arr.length; j++) {
//			if (arr[j] < min) {
//				min = arr[j];
//				minIndex = j;
//			}
//		}
//		// Swap
//		int temp = arr[0];
//		arr[0] = min;
//		arr[minIndex] = temp;

		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int minIndex = i;
			// find min index
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			// Swap
			int temp = arr[i];
			arr[i] = min;
			arr[minIndex] = temp;
			System.out.println("Step " + (i + 1) + ": " + Arrays.toString(arr));
		}
//		System.out.println("min: " + min + " at " + minIndex);
	}

	public static void bubbleSort(int[] arr) {
		int count = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				count++;
				System.out.println("Step " + count + ": " + Arrays.toString(arr));
			}
			System.out.println("Pass " + i + ": " + Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 1, 8, 3, 5, 9, 10, 7, 2, 4 };
//		System.out.println("Before: " + Arrays.toString(arr));
//		selectionSort(arr);
//		System.out.println("After: " + Arrays.toString(arr));

//		System.out.println("Before: " + Arrays.toString(arr));
//		insertionSort(arr);
//		System.out.println("After: " + Arrays.toString(arr));

//		System.out.println("Before: " + Arrays.toString(arr));
//		bubbleSort(arr);
//		System.out.println("After: " + Arrays.toString(arr));

		int[] dupArr = { 1, 2, 3, 2, 1 };
		int[] test = getNotDuplicatedArr(dupArr);
		System.out.println(Arrays.toString(test));
		
		
	}

	public static int[] getNotDuplicatedArr(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int[] result = new int[set.size()];
		int count = 0;
		for (int integer : set) {
			result[count] = integer;
			count++;
		}
		return result;
	}
}
