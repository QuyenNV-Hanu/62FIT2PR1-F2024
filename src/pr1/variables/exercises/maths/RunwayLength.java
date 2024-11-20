package pr1.variables.exercises.maths;

import java.lang.Math;
import java.util.Scanner;

public class RunwayLength {
	public static void main(String[] args) {
		// Declaration and Initialization
		Scanner input = new Scanner(System.in);
		double speed, acceleration;
		// Prompt
		System.out.print("Enter speed and acceleration: ");
		// Get input from users
		speed = input.nextDouble();
		acceleration = input.nextDouble();
		// Caculation
//		double length = (speed * speed) / (2 * acceleration);
		double minLength = Math.pow(speed, 2) / (2 * acceleration);
		// Print result
		System.out.println("The minimum runway length of the airplane: " + minLength);
	}
}
