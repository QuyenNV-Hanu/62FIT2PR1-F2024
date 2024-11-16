package pr1.sorting.lecture.demo;

import java.util.*;

public class MySelectionSort {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 7, 2, 4, 9, 0, -6 };
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(arr));
		System.out.println("Sorted!");
		selectionSortAsc(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSortAsc(int[] arr) {
		// Each iteration
//		int min = arr[0];
//		int minIndex = 0;
//		for (int i = 1; i < arr.length; i++) {
//			if(arr[i] < min) {
//				min = arr[i];
//				minIndex = i;
//			}
//		}
//		if (minIndex != 0) {
//			arr[minIndex] = arr[0];
//			arr[0] = min;
//		}
//		
//		min = arr[1];
//		minIndex = 1;
//		for (int i = 2; i < arr.length; i++) {
//			if(arr[i] < min) {
//				min = arr[i];
//				minIndex = i;
//			}
//		}
//		if (minIndex != 1) {
//			arr[minIndex] = arr[1];
//			arr[1] = min;
//		}

		for (int k = 0; k < arr.length; k++) {
			int min = arr[k];
			int minIndex = k;
			for (int i = k + 1; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
					minIndex = i;
				}
			}
			if (minIndex != k) {
				arr[minIndex] = arr[k];
				arr[k] = min;
			}
			System.out.println("Step " + (k + 1) + ": " + Arrays.toString(arr));
		}
	}
}
