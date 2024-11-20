package pr1.debugging.lecture.demo;

import java.util.Scanner;

public class AgeSignupValidator {

//	public static void main(String[] args) throws InvalidAgeException {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter your age: ");
//		int age = sc.nextInt();
//		if (age < 18 || age > 60) {
//			throw new InvalidAgeException("Age must be between 18 and 60.");
//		}
//		System.out.println("Age is valid.");
//
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		try {
			String message = validateAge(age);
			System.out.println(message);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String validateAge(int age) throws InvalidAgeException {
		if (age < 18 || age > 60) {
			throw new InvalidAgeException("Age must be between 18 and 60.");
		}
		return "Age is valid.";
	}

}
