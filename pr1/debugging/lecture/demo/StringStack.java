package pr1.debugging.lecture.demo;

import java.util.*;

class IllegalStringStackException extends Exception {
	public IllegalStringStackException(String message) {
		super("IllegalStringStackException: " + message);
	}
}

public class StringStack {
	public ArrayList<String> stack = new ArrayList<String>();

	// Constructor
	public StringStack() {
		stack = new ArrayList<>();
	}

	// Push operation
	public void push(String value) {
		stack.add(value);
	}

	// Pop operation
	public String pop() throws IllegalStringStackException {
		if (!stack.isEmpty()) {
			return stack.remove(stack.size() - 1);
		}
		throw new IllegalStringStackException("Stack is empty");
	}

	// Peek operation
	public String peek() throws IllegalStringStackException {
		if (!stack.isEmpty()) {
			return stack.get(stack.size() - 1);
		}
		throw new IllegalStringStackException("Stack is empty");
	}

	// Check if the stack is empty
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	// Sum all elements in the stack
	public int searchWord(String word) {
		int position = stack.indexOf(word);
		return (position >= 0) ? position : -1; // Return -1 if not found
	}

	@Override
	public String toString() {
		return stack.toString();
	}

	public static void main(String[] args) throws IllegalStringStackException {
		StringStack stack = new StringStack();
		try {
			stack.push("Welcome");
			stack.push("you");
			stack.push("to");;
			stack.push("World");
			stack.push("of");
			stack.push("Programming");
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			System.out.println("All elements: " + stack.toString());
			System.out.println("Top element: " + stack.peek());
			System.out.println("Search word \"World\" at position: " + stack.searchWord("World"));
			System.out.println("Popped element: " + stack.pop());
			System.out.println("Search word \"you\" at position: " + stack.searchWord("you"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
