package pr1.sorting.lecture.demo;

public class JumpSearch {
    // Method to perform Jump Search
    public static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        // Finding the block size to be jumped
        int step = (int) Math.floor(Math.sqrt(n));
        // Finding the block where the element may be present
        int prev = 0;
        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;  // Element is not present
        }
        // Doing a linear search for target in the block starting with prev
        while (arr[prev] < target) {
            prev++;
            // If we reached the next block or end of array
            if (prev == Math.min(step, n))
                return -1;  // Element is not present
        }
        // If element is found
        if (arr[prev] == target)
            return prev;
        return -1;  // Element is not present
    }

    // Driver method to test the above
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int target = 2;
        int result = jumpSearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

