package pr1.debugging.lecture.demo;

import java.util.*;

class IllegalIntegerStackException extends Exception {
	public IllegalIntegerStackException(String message) {
		super("IllegalIntegerStackException: " + message);
	}
}

public class MyIntegerStack2 {
	static ArrayList<Integer> stack = new ArrayList<>();

	public static void push(int number) {
		stack.add(number);
	}

	public static int pop() throws IllegalIntegerStackException {
		if (stack.isEmpty()) {
			throw new IllegalIntegerStackException("Stack is empty");
		}
		return stack.remove(stack.size() - 1);
	}

	public static int peek() throws IllegalIntegerStackException {
		if (stack.isEmpty()) {
			throw new IllegalIntegerStackException("Stack is empty");
		}
		return stack.getFirst();
	}

	public static String asString() {
		return stack.toString();
	}

	public static long sumAll() {
		long result = 0;
		for (Integer integer : stack) {
			result += integer;
		}
		return result;
	}

	public static void main(String[] args)  {
		try {
			push(10);
			push(-20);
			push(30);
			System.out.println("All elements: " + asString());
			System.out.println("Top element: " + peek());
			System.out.println("Sum of all elements: " + sumAll());
			pop();
			pop();
			pop();
			pop();
			pop();
			System.out.println("Popped element: " + pop());
			System.out.println("Sum after pop: " + sumAll());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}