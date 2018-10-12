package by.cdptr.les02.main;

import java.util.Scanner;
import java.math.BigDecimal;

public class LessonTwoExerciseThree {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double radius = 0, c = 0, p = 0;
		double pi = 3.141592653589793238462643;
		int sqrt = 2;
		String err = "Radius can be equal to zero ?";

		System.out.print("Please enter Radius value> ");
		if (sc.hasNextDouble()) {
			radius = sc.nextDouble();
		}

		double diameter = 2 * radius;
		double circle = pi * diameter;
		double square = pi * (Math.pow(radius, sqrt));
		c = circle;
		p = square;

		for (int i = 0; i < 1; i++) {
			if (radius == 0) {
				System.out.println(err);
				break;

			} else {
				// c = circle;
				// p = square;

				c = BigDecimal.valueOf(circle)
						.setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
				p = BigDecimal.valueOf(square)
						.setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
				// System.out.printf("Circle =" + " " + "%.2f\n", c);
				System.out.println("Circle =" + " " + c);
				System.out.println("Square =" + " " + p);
			}

		}

	}

}
