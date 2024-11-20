package pr1.collections.lecture.demo;

import java.util.*;

public class PriorityQueueUnion {
	public static void main(String[] args) {
		// Create the two arrays
		String[] array1 = { "George", "Jim", "John", "Blake", "Kevin", "Michael" };
		String[] array2 = { "George", "Katie", "Kevin", "Michelle", "Ryan" };

		// Create a priority queue to store the elements of both arrays
		PriorityQueue<String> pq = new PriorityQueue<>();

		// Add all elements of the first array to the priority queue
		for (String s : array1) {
			pq.offer(s);
		}

		// Add all elements of the second array to the priority queue
		for (String s : array2) {
			pq.offer(s);
		}

		// Create an array to store the union result
		ArrayList<String> union = new ArrayList<>();

		// Poll elements from the priority queue and add to the union list
		while (!pq.isEmpty()) {
			union.add(pq.poll());
		}

		// Print the union result
		System.out.println("Union: " + union);
	}
}
