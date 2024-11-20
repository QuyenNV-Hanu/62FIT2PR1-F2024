package pr1.recursion.lecture.demo;

public class Hex2Dec {
	public static void main(String[] args) throws Exception {
		System.out.println(hex2Dec("100"));
	}

	public static int hex2Dec(String hex) throws Exception {
		if (hex.isEmpty()) {
			throw new IllegalArgumentException("Empty hexadecimal string");
		}
		if (!hex.matches("[0-9A-Fa-f]+")) {
            throw new IllegalArgumentException("Invalid hexadecimal string");
        }
		return hex2DecHelper(hex, hex.length() - 1, 0);
	}

	// Recursive helper method
	public static int hex2DecHelper(String hex, int position, int index) {
		if (position < 0) {
			return 0; // Base case: no more characters to process
		}

		// Get the decimal value of the current hex character
		char currentChar = hex.charAt(position);
		int currentValue;

		if (Character.isDigit(currentChar)) {
			currentValue = currentChar - '0';
		} else {
			currentValue = 10 + (Character.toUpperCase(currentChar) - 'A');
		}

		// Return current value multiplied by 16^index plus recursive call for remaining
		// characters
		return currentValue * (int) Math.pow(16, index) + hex2DecHelper(hex, position - 1, index + 1);
	}
}
