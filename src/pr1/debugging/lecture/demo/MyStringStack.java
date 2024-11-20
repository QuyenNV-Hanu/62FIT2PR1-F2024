package pr1.debugging.lecture.demo;

import java.util.*;

//class IllegalStringStackException extends Exception {
//	public IllegalStringStackException(String message) {
//		super("IllegalStringStackException: " + message);
//	}
//}

public class MyStringStack {
	static ArrayList<String> stack = new ArrayList<>();

	public static void push(String element) {
		stack.add(element);
	}

	public static String getAllElementsAsString() throws IllegalStringStackException {
		if (stack.isEmpty()) {
			throw new IllegalStringStackException("Stack is empty");
		}
		return stack.toString();
	}

	public static String pop() throws IllegalStringStackException {
		if (stack.isEmpty()) {
			throw new IllegalStringStackException("Stack is empty");
		}
		return stack.remove(stack.size() - 1);
	}

	public static int searchWord(String string) throws IllegalStringStackException {
		if (stack.isEmpty()) {
			throw new IllegalStringStackException("Stack is empty");
		}
		return stack.indexOf(string);
	}

	public static String peek() throws IllegalStringStackException {
		if (stack.isEmpty()) {
			throw new IllegalStringStackException("Stack is empty");
		}
		return stack.get(stack.size() - 1);
	}

	public static void main(String[] args) {
		try {
			push("Welcome");
			push("you");
			push("to");
			push("you");
			push("World");
			push("you");
			push("of");
			push("Programming");
			pop();
			pop();
			pop();
			pop();
			pop();
			System.out.println("All elements: " + getAllElementsAsString());
			System.out.println("Top element: " + peek());
			System.out.println("Search word \"World\" at position: " + searchWord("World"));
			System.out.println("Popped element: " + pop());
			System.out.println("Search word \"you\" at position: " + searchWord("you"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
