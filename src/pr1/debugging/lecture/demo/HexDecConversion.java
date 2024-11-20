package pr1.debugging.lecture.demo;

public class HexDecConversion {
	/**
	 * Converts a hex string into a decimal number and throws a
	 * NumberFormatException if the string is not a hex string
	 */
	public static int hexToDecimal(String hex) throws NumberFormatException {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			if (!(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') || !(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F'))
				throw new NumberFormatException("String is not a hex string");
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}

		return decimalValue;
	}

	public static int hexCharToDecimal(char hexChar) {
		// TODO Auto-generated method stub
		return 0;
	}
}
