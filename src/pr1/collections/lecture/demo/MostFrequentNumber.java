package pr1.collections.lecture.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, Integer> occurrences = new HashMap<>();
		int num;

		// Reading user input until 0 is entered
		System.out.println("Enter integers (input ends with 0):");
		while ((num = scanner.nextInt()) != 0) {
			occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
		}

		// Finding the maximum frequency
		int maxFrequency = 0;
		for (int count : occurrences.values()) {
			if (count > maxFrequency) {
				maxFrequency = count;
			}
		}

		// Printing the most frequent numbers
		System.out.print("The mode: ");
		if (maxFrequency == 0) {
			System.out.println("(0 times)");
		} else {
			for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
				if (entry.getValue() == maxFrequency) {
					System.out.print(entry.getKey() + " ");
				}
			}
			System.out.println("(" + maxFrequency + " times)");
		}

		scanner.close();
	}
}
