package pr1.variables.exercises.maths;

import java.util.*;
import java.lang.*;

public class TwoPointDistance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2;
		double distance;
		System.out.print("Enter x1 and y1: ");
		x1 = input.nextFloat();
		y1 = input.nextFloat();
		System.out.print("Enter x2 and y2: ");
		x2 = input.nextFloat();
		y2 = input.nextFloat();
		distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		System.out.println("The distance between two points is: " + distance);
	}
}
