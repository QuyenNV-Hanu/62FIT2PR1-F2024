package pr1.debugging.lecture.demo;

import java.util.*;

//class IllegalIntegerStackException extends Exception {
//	public IllegalIntegerStackException(String message) {
//		super("IllegalIntegerStackException: " + message);
//	}
//}

public class IntegerStack {
	public ArrayList<Integer> stack = new ArrayList<>();

	// Constructor
	public IntegerStack() {
		stack = new ArrayList<>();
	}

	// Push operation
	public void push(int value) {
		stack.add(value);
	}

	// Pop operation
	public int pop() throws IllegalIntegerStackException {
		if (!stack.isEmpty()) {
			return stack.remove(stack.size() - 1);
		}
		throw new IllegalIntegerStackException("Stack is empty");
	}

	// Peek operation
	public int peek() throws IllegalIntegerStackException {
		if (!stack.isEmpty()) {
			return stack.get(stack.size() - 1);
		}
		throw new IllegalIntegerStackException("Stack is empty");
	}

	// Check if the stack is empty
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	// Sum all elements in the stack
	public int sumAll() {
		int sum = 0;
		for (int value : stack) {
			sum += value;
		}
		return sum;
	}
	
	@Override
	public String toString() {
		return stack.toString();
	}
	
	public static void main(String[] args) throws IllegalIntegerStackException {
		IntegerStack stack = new IntegerStack();
			stack.push(10);
			stack.push(-20);
			stack.push(30);
			System.out.println("All elements: " + stack.toString());
			System.out.println("Top element: " + stack.peek());
			System.out.println("Sum of all elements: " + stack.sumAll());
			System.out.println("Popped element: " + stack.pop());
			System.out.println("Sum after pop: " + stack.sumAll());
	}
}


