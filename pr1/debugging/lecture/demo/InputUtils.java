package pr1.debugging.lecture.demo;

import java.util.*;

//class NegativeIntegerException extends Exception {
//	public NegativeIntegerException(String message) {
//		super("NegativeIntegerException: " + message);
//	}
//}

public class InputUtils {
	public Scanner sc = new Scanner(System.in);

	public static int promptPositiveInteger() {
		Scanner sc = new Scanner(System.in);
		System.out.println(System.getProperty("java.version"));
		int positiveNumber;
		while (true) {
			try {
				positiveNumber = sc.nextInt();
//				if (positiveNumber >= 0) {
//					return positiveNumber;
//				} else {
//					throw new NegativeIntegerException("Nega");
//				}
			} catch (Exception e) {
				System.out.println("Invalid integer, re-enter an integer: ");
				sc.nextLine();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		try {
			System.out.println("Enter the first string: ");
			String str1 = sc.nextLine();
			map.put("1st String", str1);
			System.out.println("Enter the first number: ");
			int num1 = promptPositiveInteger();
//			sc.nextLine(); // Only on LMS
			map.put("1st Number", num1 + "");
			System.out.println("Enter the second string: ");
			String str2 = sc.nextLine();
			map.put("2nd String", str2);
			System.out.println("Enter the second number: ");
			int num2 = promptPositiveInteger();
//			sc.nextLine(); // Only on LMS
			map.put("2nd Number", num2 + "");
			System.out.println("Map: " + map);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
