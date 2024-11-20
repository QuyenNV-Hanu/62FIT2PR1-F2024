package pr1.debugging.lecture.demo;

class NegativeRadiusException extends Exception {
	public NegativeRadiusException(String message) {
		super("NegativeRadiusException: " + message);
	}
}

public class AreaCalculator {

	public static double getCircleArea(double radius) throws NegativeRadiusException {
		if (radius < 0) {
			throw new NegativeRadiusException("Radius should not be negative!");
		}
		double area = Math.PI * radius * radius;
		return area;
	}

	public static void main(String[] args) throws NegativeRadiusException {
		try {
			System.out.println(getCircleArea(1));
			System.out.println(getCircleArea(-2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
