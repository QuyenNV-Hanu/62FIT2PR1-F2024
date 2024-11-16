package pr1.debugging.lecture.demo;

import java.util.*;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super("InvalidAgeException: " + message);
	}
}

public class AgeValidator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		try {
			validateAge(age);
			System.out.println("Age is valid."); // Output: "Age is valid."
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18 || age > 60) {
			throw new InvalidAgeException("Age must be between 18 and 60.");
		}
	}
}
