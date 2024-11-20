package pr1.collections.lecture.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class countVowelsConsonants {
	public static void main(String[] args) {
		// Create a set for vowels
		Set<Character> vowels = new HashSet<>();
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		// Prompt the user to enter a file name
		String filename = "./src/demo.txt";

		// Initialize counters
		int vowelCount = 0, consonantCount = 0;

		try {
			// Read the file
			File file = new File(filename);
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();

				// Count vowels and consonants
				for (char ch : line.toCharArray()) {
					if (Character.isLetter(ch)) {
						if (vowels.contains(ch)) {
							vowelCount++;
						} else {
							consonantCount++;
						}
					}
				}
			}

			// Output results
			System.out.println("Number of vowels: " + vowelCount);
			System.out.println("Number of consonants: " + consonantCount);

			fileScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}
