package pr1.collections.lecture.demo;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class AlphabeticalWords {

	public static void main(String[] args) throws IOException {
		// Path to the input file
		String filePath = "./src/demo.txt";
		writeDemoDataToFile();
		List<String> wordsList = new ArrayList<>();

		// Pattern to match words that start with a letter
		Pattern pattern = Pattern.compile("^[a-zA-Z].*");

		try (Scanner scanner = new Scanner(new File(filePath))) {
			// Read words from the file
			while (scanner.hasNext()) {
				String word = scanner.next();
				Matcher matcher = pattern.matcher(word);
				// Add words starting with a letter to the list
				if (matcher.matches()) {
					wordsList.add(word);
				}
			}

			// Sort the list alphabetically
			Collections.sort(wordsList);

			// Display the words in ascending order
			for (String word : wordsList) {
				System.out.println(word);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + filePath);
		}
	}

	public static void writeDemoDataToFile() throws IOException {
		File file = new File("./src/demo.txt");
		if (!file.getParentFile().exists())
			file.getParentFile().mkdirs();
		if (!file.exists())
			file.createNewFile();

		try (
				// Create a file
				PrintWriter output = new PrintWriter(file);) {
			// Write formatted output to the file
			output.println(
					"Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.\n It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n");
			output.println("Where does it come from?\r\n"
					+ "Contrary to popular belief, Lorem Ipsum is not simply random text.\n It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old.\n Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source.\n Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC.\n This book is a treatise on the theory of ethics, very popular during the Renaissance.\n The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\r\n"
					+ "\r\n"
					+ "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested.\n Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.");
			output.println("Why do we use it?\r\n"
					+ "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.\n The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.\n Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy.\n Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
			output.println("Where can I get some?\r\n"
					+ "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.\n If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text.\n All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet.\n It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable.\n The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
