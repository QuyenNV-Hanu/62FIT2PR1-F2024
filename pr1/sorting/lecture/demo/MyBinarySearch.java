package pr1.sorting.lecture.demo;

import java.util.Arrays;

public class MyBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 9, 15, 17, 21, 30, 48, 61, 99 };
		int target = 6;
		System.out.println(Arrays.toString(arr));
		System.out.println("Found at " + binarySearch(arr, target));
	}
	
	public static int binarySearch(int[] arr, int targetValue) {
		// TODO: Exception handling
		int targetIndex = -1;
		int low = 0;
		int high = arr.length - 1;
		int mid;
		
		while (low <= high) {
			mid = low + (high - low) / 2;
			if(arr[mid] == targetValue) {
				targetIndex = mid;
				break;
			}
			 if (arr[mid] > targetValue) {
				 high = mid;
			 }
			 
			 if(arr[mid] < targetValue) {
				 low = mid;
			 }
		}
		
		return targetIndex;
	}

}
