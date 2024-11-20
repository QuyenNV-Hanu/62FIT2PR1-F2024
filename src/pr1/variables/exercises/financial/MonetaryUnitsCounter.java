package pr1.variables.exercises.financial;

import java.util.Scanner;

public class MonetaryUnitsCounter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount of money (in dollar): ");
		double dollarAmount = input.nextDouble();
		int cents = (int) (dollarAmount * 100);
		int dollar = cents / 100;
		int remainingCents = cents % 100;
		int quater = remainingCents / 25;
		remainingCents %= 25;
		int dimes = remainingCents / 10;
		remainingCents %= 10;
		int nickles = remainingCents / 5;
		remainingCents %= 5;
		System.out.println(dollarAmount + " has " + dollar + " dollars, " + quater + " quaters, " + dimes + " dimes, "
				+ nickles + " nickles, " + remainingCents + " cents.");
	}
}
