package pr1.debugging.lecture.demo;

public class DivideByZero {
	public static void main(String[] args) {
		int a = 5;
		int b = 0; // you know this won’t work
		try {
			int c = a / b; // but you try it anyway
		} catch (ArithmeticException e) {
			System.out.println("Oops, you can’t divide by zero.");
		}
	}

	public static void divided(int a, int b) {
		try {
			int c = a / b;
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
		}
	}
}
