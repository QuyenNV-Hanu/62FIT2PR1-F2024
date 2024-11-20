package pr1.debugging.lecture.demo;

//Custom Exception
class MyCustomException extends Exception {
	public MyCustomException(String message) {
		super(message);
	}
}

public class CustomExceptionDemo {
	// A function that throws a custom exception
	public static void checkNumber(int number) throws MyCustomException {
		if (number < 0) {
			throw new MyCustomException("Number is negative!");
		}
		System.out.println("Number is positive or zero: " + number);
	}

	public static void main(String[] args) {
		int[] numbers = { 10, -5, 0, 15 };

		// Iterate over the numbers and check each one
		for (int num : numbers) {
			try {
				checkNumber(num);
			} catch (MyCustomException e) {
				System.out.println("Caught Exception: " + e.getMessage());
			}
		}
	}
}
