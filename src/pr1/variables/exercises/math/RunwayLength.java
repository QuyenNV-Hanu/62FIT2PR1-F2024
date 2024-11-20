package pr1.variables.exercises.math;

import java.util.*;

public class RunwayLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter speed and acceleration: ");
		int speed = sc.nextInt();
		double acceleration = sc.nextDouble();
		double minRunwayLength = Math.pow(speed, 2) / (2 * acceleration);
		System.out.printf("The minimum runway length of this airplane is %.3f", minRunwayLength);
	}
}
