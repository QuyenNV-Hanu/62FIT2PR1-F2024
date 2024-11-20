package pr1.debugging.lecture.demo;

import java.util.*;

class IllegalIntegerQueueException extends Exception {
	public IllegalIntegerQueueException(String message) {
		super("IllegalIntegerQueueException: " + message);
	}
}

public class MyIntegerQueue {
	public static LinkedList<Integer> queue = new LinkedList<>();

	public static void offer(int number) {
		queue.add(number);
	}

	public static int size() {
		return queue.size();
	}

	public static Integer peek() throws IllegalIntegerQueueException {
//		if (queue.isEmpty()) {
//			return null;
//		} else {
//			return queue.getFirst();
//		}
		return queue.isEmpty() ? null : queue.getFirst();
	}

	public static int element() throws IllegalIntegerQueueException {
		if (queue.isEmpty()) {
			throw new IllegalIntegerQueueException("Queue empty");
		}
		return queue.get(0); // q.get(0); <=> q.getFirst();
	}

	public static int poll() {
		return queue.isEmpty() ? null : queue.removeFirst();
	}

	public static int remove() throws IllegalIntegerQueueException {
		if (queue.isEmpty()) {
			throw new IllegalIntegerQueueException("Queue empty");
		}
		return queue.removeFirst();
	}

	public static String getAllElementsAsString() {
		return queue.toString();
	}

	public static long sumAll() {
		long sum = 0;
		for (int integer : queue) {
			sum += integer;
		}
		return sum;
	}

	public static void main(String[] args) {
		try {
			offer(10);
			offer(20);
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
		}
	}
}
