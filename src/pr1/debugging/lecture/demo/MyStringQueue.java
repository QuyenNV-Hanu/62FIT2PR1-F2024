package pr1.debugging.lecture.demo;

import java.util.*;

class MyIllegalStringQueueException extends Exception {
	public MyIllegalStringQueueException(String message) {
		super("MyIllegalStringQueueException: " + message);
	}
}

public class MyStringQueue {
	static LinkedList<String> queue = new LinkedList<>();

	public static void offer(String element) {
		queue.add(element);
	}

	public static String remove() throws MyIllegalStringQueueException {
		if (queue.isEmpty()) {
			throw new MyIllegalStringQueueException("Queue is empty");
		}
		return queue.remove();
	}

	public static String peek() {
		return queue.isEmpty() ? null : queue.element();
	}

	public static String poll() {
		return queue.isEmpty() ? null : queue.remove();
	}

	public static boolean searchWord(String string) {
		return queue.contains(string);
	}

	public static String getAllElementsAsString() {
		return queue.toString();
	}

	public static void main(String[] args) {
		try {
			offer("Hello");
			offer("World");
			System.out.println("All elements: " + getAllElementsAsString());
			System.out.println("Peek: " + peek());
			System.out.println("Contains 'World': " + searchWord("World"));
			remove();
			remove();
			remove();
			System.out.println("After removing: " + getAllElementsAsString());
			System.out.println("Poll: " + poll());
			System.out.println("Poll on empty queue: " + poll());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
