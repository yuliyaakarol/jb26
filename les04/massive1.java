package by.epam.les04.main;
	import java.util.Random;
	import java.util.Scanner;
	
public class massive1 {
		public static void main(String[] args) {

			int[] mas = new int[10];
			enterArrayWithRandom(mas);
			printArrayFull(mas);
			calcMas(mas);

		}

		public static void enterArrayWithRandom(int[] mas) {
			Random rand = new Random();
			for (int i = 0; i < mas.length; i++) {
				mas[i] = rand.nextInt(10);
			}
		}

		public static void printArrayFull(int[] mas) {
			System.out.println("------------------------------------------------");
			System.out.print("full massive: ");
			for (int i = 0; i < mas.length; i++) {

				System.out.print("mas[" + i + "]=" + mas[i] + "; ");
			}
			System.out.println();
			System.out.println("------------------------------------------------");
		}

		public static void calcMas(int[] mas) {

			int sum = 0;
			int k = 0;
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < 1; i++) {
				System.out.print("Please enter K > ");
				if (sc.hasNextInt()) {
					k = sc.nextInt();
				}
			}
			System.out.print("calculated massive: ");
			for (int i = 0; i < mas.length; i++) {

				if (mas[i] % k == 0) {
					sum += mas[i];

					System.out.print("mas[" + i + "]=" + mas[i] + "; ");

				}

			}
			printArraySum(sum);
		}

		public static void printArraySum(int sum) {
			System.out.println();
			System.out.println("------------------------------------------------");
			System.out.println("calculated massive sum = " + sum);
			System.out.println("------------------------------------------------");
		}

	}
