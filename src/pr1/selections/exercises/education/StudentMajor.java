package pr1.selections.exercises.education;

import java.util.Scanner;

public class StudentMajor {
	public static void main(String[] args) {
		// Declare variables
		Scanner sc = new Scanner(System.in);
		String majorString = "";
		String statusString = "";
		// User prompt
		System.out.println("Enter two characters: ");
		String majorStatus = sc.nextLine();
		// Processing...
		if (majorStatus.length() == 2) {
			// get the characters represented for the major and the status, respectively
			char major = Character.toLowerCase(majorStatus.charAt(0));
			char status = majorStatus.charAt(1);
			// check if major exists and status is valid
			if ((major == 'm' || major == 'c' || major == 'i') && (status >= '1' && status <= '4')) {
				// Check major
//				if (major == 'm') {
//					majorString = "Mathematics";
//				} else if (major == 'c') {
//					majorString = "Computer Science";
//				} else {
//					majorString = "Information Technology";
//				}
				switch (major) {
				case 'm':
					majorString = "Mathematics";
					break;
				case 'c':
					majorString = "Computer Science";
					break;
				case 'i':
					majorString = "Information Technology";
					break;
				}
				// Check status
				if (status == '1') {
					statusString = "Freshman";
				} else if (status == '2') {
					statusString = "Sophomore";
				} else if (status == '3') {
					statusString = "Junior";
				} else {
					statusString = "Senior";
				}
				System.out.println(majorString + " " + statusString);
			} else {
				System.out.println("Invalid input");
			}
		} else {
			System.out.println("Invalid input");
		}
	}
}
