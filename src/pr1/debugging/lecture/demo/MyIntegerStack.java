package pr1.debugging.lecture.demo;

import java.util.ArrayList;

//class IllegalIntegerStackException extends Exception {
//	public IllegalIntegerStackException(String message) {
//		super("IllegalIntegerStackException: " + message);
//	}
//}

public class MyIntegerStack {
	public static ArrayList<Integer> stack = new ArrayList<>();

	public static void push(int element) {
		stack.add(element);
	}

	public static int peek() throws IllegalIntegerStackException {
		if (stack.isEmpty()) {
			throw new IllegalIntegerStackException("Stack is empty");
		}
		return stack.getFirst();
	}

	public static int pop() throws IllegalIntegerStackException {
		if (stack.isEmpty()) {
			throw new IllegalIntegerStackException("Stack is empty");
		}
		return stack.remove(stack.size() - 1);
	}

	public static int sumAll() {
		int sum = 0;
		for (Integer integer : stack) {
			sum += integer;
		}
		return sum;
	}

	public static String asString() {
		return stack.toString();
	}

	public static void main(String[] args) {
		try {
			push(10);
			push(20);
			push(30);
			pop();
			pop();
			pop();
			pop();
			System.out.println("All elements: " + asString());
			System.out.println("Top element: " + peek());
			System.out.println("Sum of all elements: " + sumAll());
			System.out.println("Popped element: " + pop());
			System.out.println("Sum after pop: " + sumAll());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			stack.clear();
		}
	}
}
