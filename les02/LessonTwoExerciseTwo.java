package by.cdptr.les02.main;

import java.util.Scanner;
import java.math.BigDecimal;

public class LessonTwoExerciseTwo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = 0, b = 0, c = 0, d = 0;
		int sqrt = 2;
		int cube = 3;
		String err = "error: 'a' can't be equal zero => division by zero is not allowed";

		System.out.print("Enter a> ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		System.out.print("Enter b> ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		System.out.print("Enter c> ");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		}

		double numerator = b + (Math.sqrt(Math.pow(b, sqrt) + 4 * a * c));
		double denominator = 2 * a;
		double addend = Math.pow(a, cube) * c + b;

		for (int i = 0; i < 1; i++) {

			if (denominator != 0) {
				d = numerator / denominator + addend;
				d = BigDecimal.valueOf(d)
						.setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
				// stop the cycle with error message
			} else {
				System.out.println(err);
				break;
			}
			// cycle continuation if denominator !=0
			System.out
					.print("Formula ((b + (Math.sqrt(Math.pow(b, sqrt)+4*a*c)))/(2*a)+Math.pow(a, cube)*c+b)\n");
			System.out.print("result = " + d);
			// System.out.println(numerator);
			// System.out.println(denominator);
		}
	}

}
