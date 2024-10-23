package pr1.variables.exercises.maths;

import java.util.*;
import java.lang.Math;

public class TriangleArea {
	public static void main(String[] args) {
		// declaration
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2, x3, y3;
		double side1, side2, side3;
		// prompt user's input
		System.out.print("Enter three points for a triangle: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		// calculate sides
		side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		side3 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
		// calculate perimeter & area
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
		// print the result
		System.out.println("The area of the triangle is " + area);
	}
}
