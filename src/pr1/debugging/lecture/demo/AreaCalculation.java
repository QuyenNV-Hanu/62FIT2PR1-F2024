package pr1.debugging.lecture.demo;

public class AreaCalculation {
	public static double getTriangleArea(int base, int height) {
		System.out.println();
		double area = (base * height) * 2;
		System.out.println("The area is " + area + ".");
		return area;
	}

	public static int getRectangleArea(int length, int width) {
		System.out.println();
		int area = length * width;
		System.out.println("The area is " + area + ".");
		return area;
	}

	public static double getCircleArea(int radius) {
		System.out.println();
		double area = Math.PI * radius * radius;
		System.out.println("The area is " + area + ".");
		return area;
	}
}
