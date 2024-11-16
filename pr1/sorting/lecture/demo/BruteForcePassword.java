package pr1.sorting.lecture.demo;

public class BruteForcePassword {
	public static void main(String[] args) {
		// Predefined password
		String password = null; // You can change this for different test cases
		// Define possible characters (lowercase a-z)
		char[] charsSet = {};
		// Brute-force search
		try {
			bruteForceSearch(password, charsSet);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	// Method to brute-force search the password
	public static void bruteForceSearch(String password, char[] alphabet) {
		if (alphabet == null) {
			throw new IllegalArgumentException("IllegalArgumentException: charSet is null.");
		}
		if (alphabet.length == 0) {
			throw new IllegalArgumentException("IllegalArgumentException: charSet is empty.");
		}
		int attempts = 0;

		// Check 1-character combinations
		for (char a : alphabet) {
			String guess = String.valueOf(a);
			attempts++;
			if (guess.equals(password)) {
				System.out.println("Guessed password: " + guess);
				System.out.println("Total attempts: " + attempts);
				return;
			}
		}

		// Check 2-character combinations
		for (char a : alphabet) {
			for (char b : alphabet) {
				String guess = String.valueOf(a) + b;
				attempts++;
				if (guess.equals(password)) {
					System.out.println("Guessed password: " + guess);
					System.out.println("Total attempts: " + attempts);
					return;
				}
			}
		}

		// Check 3-character combinations
		for (char a : alphabet) {
			for (char b : alphabet) {
				for (char c : alphabet) {
					String guess = String.valueOf(a) + b + c;
					attempts++;
					if (guess.equals(password)) {
						System.out.println("Guessed password: " + guess);
						System.out.println("Total attempts: " + attempts);
						return;
					}
				}
			}
		}

		// If not found (this will only occur if password length is greater than 3)
		System.out.println("Password not found within 1, 2, or 3 character combinations.");
	}

	// Method to compare the generated guess with the actual password
	public static boolean checkPassword(String password, String guess) {
		return password.equals(guess);
	}
}
