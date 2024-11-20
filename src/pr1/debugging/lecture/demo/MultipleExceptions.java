package pr1.debugging.lecture.demo;

public class MultipleExceptions {

	public static void main(String[] args) {
//		try {
//			// statements that might throw several types of
//			// exceptions
//		} catch (InputMismatchException e) {
//			// statements that process InputMismatchException
//		} catch (IOException e) {
//			// statements that process IOException
//		} catch (AnyException e) {
//			// statements that process any other exceptions
//		} catch (Exception e) {
//			// statements that process all other exception types
//		}
		int a = 5;
		int b = 0;
		try {
			int c = a / b;
		} catch (Exception e) {
			System.out.println("Exceptions: " + e.getMessage());
		}

	}

}
