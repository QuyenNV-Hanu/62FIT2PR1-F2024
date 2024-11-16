package pr1.debugging.lecture.demo;

//class NegativeRadiusException extends Exception {
//	public NegativeRadiusException(String message) {
//		super("NegativeRadiusException: " + message);
//	}
//}

public class MyCustomDemoException {
	public static void main(String[] args) {
//		int a = 5;
//		int b = 0;
//		try {
//			int c = a / b;
//			System.out.println(c);
//		} catch (ArithmeticException e) {
//			System.err.println("Exception: / by 0");
//		}

		double radius = -4;
		try {
			double area = getCircleArea(radius);
			System.out.println(area);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally!");
		}
	}

	public static double getCircleArea(double radius) throws NegativeRadiusException {
		if (radius < 0) {
			throw new NegativeRadiusException("Radius should not be negative!");
		}
		return Math.PI * radius * radius;
	}
}
