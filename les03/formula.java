package by.epam.les03.main;
	import java.util.Scanner;
	import java.math.BigDecimal;
    import java.math.RoundingMode;
public class formula {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			double a = 0, b = 0;
			double h = 0;
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter the beginning of the line segment a: ");
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
			}
			System.out.print("Enter the ending of the line segment b: ");
			if (sc.hasNextDouble()) {
				b = sc.nextDouble();
			}

			System.out.print("Step h: ");
			if (sc.hasNextDouble()) {
				h = sc.nextDouble();
			}
			System.out.println("Аргумент функции, x " + " | " + "Значение функции, F(x) ");
			fx(a, b, h);
			System.out.println("Finish");
		}

		public static void fx(double a, double b, double h) {
			for (double i = a; i <= b; i = i + h) {
				double fx = 2 * Math.tan(i / 2) + 1;
				i = BigDecimal.valueOf(i).setScale(2,RoundingMode.HALF_EVEN)
						.doubleValue();

				printRes(i, fx);
			}

		}
		public static void printRes(double i, double fx) {
			
			System.out.println(i + " | " + fx);
		}
	}


