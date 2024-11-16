package pr1.debugging.lecture.demo;

import java.util.*;

//class IllegalIntegerQueueException extends Exception {
//	public IllegalIntegerQueueException(String message) {
//		super("IllegalIntegerQueueException: " + message);
//	}
//}

public class IntegerQueue {
	public static LinkedList<Integer> queue = new LinkedList<>();

	// Add element to rear
	public static boolean offer(int data) {
		return queue.add(data);
	}

	// Remove and return front element, return null if empty
	public static int poll() {
		return queue.isEmpty() ? null : queue.removeFirst();
	}

	// Same as poll but throws exception if empty
	public static int remove() throws IllegalIntegerQueueException {
		if (queue.isEmpty())
			throw new IllegalIntegerQueueException("Queue empty");
		return queue.removeFirst();
	}

	// Return front element without removing, return null if empty
	public static int peek() {
		return queue.isEmpty() ? null : queue.getFirst();
	}

	// Same as peek but throws exception if empty
	public static int element() throws IllegalIntegerQueueException {
		if (queue.isEmpty())
			throw new IllegalIntegerQueueException("Queue empty");
		return queue.getFirst();
	}

	public static String getAllElementsAsString() {
		return queue.toString();
	}
	
	public static int sumAll() {
		int sum = 0;
	    for (int num : queue) {
	        sum += num;
	    }
	    return sum;
	}

	public static void main(String[] args) throws IllegalIntegerQueueException {
		try {
			offer(10);
			offer(-20);
			offer(30);
			System.out.println("All elements: " + getAllElementsAsString());
			System.out.println("Sum of all elements: " + sumAll());
			System.out.println("Front element: " + peek());
			System.out.println("Removed: " + poll());
			System.out.println("Next element: " + element());
			System.out.println("Removed: " + remove());
			System.out.println("Size of queue: " + size());
			System.out.println("Front element: " + peek());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			queue.clear();
		}
	}

	public static int size() {
		return queue.size();
	}
}
