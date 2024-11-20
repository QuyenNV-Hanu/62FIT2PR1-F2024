package pr1.debugging.lecture.demo;

import java.util.LinkedList;

class IllegalStringQueueException extends Exception {
	public IllegalStringQueueException(String message) {
		super("IllegalStringQueueException: " + message);
	}
}

public class StringQueue {
	public static LinkedList<String> queue = new LinkedList<>();

	// Method to add an element to the queue
	public static void offer(String element) throws IllegalStringQueueException {
		if (element == null) {
			throw new IllegalStringQueueException("Cannot add null elements to the queue.");
		}
		queue.addLast(element);
	}

	// Method to remove and return the head of the queue
	public static String poll() {
		return queue.isEmpty() ? null : queue.removeFirst();
	}

	// Method to remove the head of the queue and throw an exception if empty
	public static String remove() throws IllegalStringQueueException {
		if (queue.isEmpty()) {
			throw new IllegalStringQueueException("Queue is empty, cannot remove element.");
		}
		return queue.removeFirst();
	}

	// Method to get the head of the queue without removing it
	public static String peek() {
		return queue.isEmpty() ? null : queue.getFirst();
	}

	// Method to get the head of the queue and throw an exception if empty
	public static String element() throws IllegalStringQueueException {
		if (queue.isEmpty()) {
			throw new IllegalStringQueueException("Queue is empty, cannot retrieve element.");
		}
		return queue.getFirst();
	}

	public static String getAllElementsAsString() {
		return queue.toString();
	}

	public static int size() {
		return queue.size();
	}

	public static boolean searchWord(String word) {
		for (String str : queue) {
			if (str.equals(word)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws IllegalIntegerQueueException {
		try {
			offer("Hello");
			offer("World");
			remove();
			remove();
			remove();
			System.out.println("All elements: " + getAllElementsAsString());
			System.out.println("Peek: " + peek());
			System.out.println("Contains 'World': " + searchWord("World"));
			System.out.println("After removing: " + getAllElementsAsString());
			System.out.println("Poll: " + poll());
			System.out.println("Poll on empty queue: " + poll());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			queue.clear();
		}
	}
}
