package pr1.binaryio.lecture.demo;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class FileEncoderDecoder {

	// Method to encode a string and write to file
	public static void encodeFile(String inputString, String encodedFileName) throws IOException {
		try (RandomAccessFile encodedFile = new RandomAccessFile(encodedFileName, "rw")) {
			byte[] data = inputString.getBytes(); // Convert string to bytes

			System.out.println("Original content before encoding: " + inputString);

			for (byte b : data) {
				encodedFile.write(b + 5); // Encode by adding 5 to each byte
			}

			System.out.println("File has been encoded and written to: " + encodedFileName);
		}
	}

	// Method to decode an encrypted file
	public static void decodeFile(String encodedFileName, String decodedFileName) throws IOException {
		File encodedFile = new File(encodedFileName);

		try (RandomAccessFile fileToDecode = new RandomAccessFile(encodedFile, "r");
				RandomAccessFile decodedFile = new RandomAccessFile(decodedFileName, "rw")) {

			byte[] buffer = new byte[(int) encodedFile.length()];

			// Read encoded file contents
			fileToDecode.readFully(buffer);

			System.out.print("Encoded content (as bytes): ");
			for (byte b : buffer) {
				System.out.print(b + " ");
				decodedFile.write(b - 5); // Decode by subtracting 5 from each byte
			}
			System.out.println();

			System.out.println("File has been decoded and written to: " + decodedFileName);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			// Prompt the user for input to encode
			System.out.print("Enter a string to encode: ");
			String inputString = scanner.nextLine();

			// Prompt the user for file names
			System.out.print("Enter the file name to store encoded content: ");
			String encodedFileName = scanner.nextLine();

			// Call the encode method
			encodeFile(inputString, encodedFileName);

			// Prompt the user for the encoded file name to decode
			System.out.print("Enter the file name of the encoded file to decode: ");
			String encryptedFileName = scanner.nextLine();

			System.out.print("Enter the output file name for the decoded content: ");
			String decodedFileName = scanner.nextLine();

			// Call the decode method
			decodeFile(encryptedFileName, decodedFileName);

		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
