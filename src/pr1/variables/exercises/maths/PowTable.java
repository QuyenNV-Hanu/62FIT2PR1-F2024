package pr1.variables.exercises.maths;
import java.lang.Math;

public class PowTable {
	public static void main(String[] args) {
		int a = 1, b = 2;
		System.out.println("a          b          pow(a, b)");
		System.out.println(a + "          " + b + "          " + (int) Math.pow(a, b));
		a = 2;
		b = 3;
		System.out.println(a + "          " + b + "          " + (int) Math.pow(a, b));
		a = 3;
		b = 4;
		System.out.println(a + "          " + b + "          " + (int) Math.pow(a, b));
		a = 4;
		b = 5;
		System.out.println(a + "          " + b + "          " + (int) Math.pow(a, b));
		a = 5;
		b = 6;
		System.out.println(a + "          " + b + "          " + (int) Math.pow(a, b));
		a = 6;
		b = 7;
		System.out.println(a + "          " + b + "          " + (int) Math.pow(a, b));
	}
}
