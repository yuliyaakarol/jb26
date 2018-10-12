package by.epam.les05.main;

import java.util.Scanner;

public class fraction_main {

	public static void main(String[] args) {
		int len = 0;
		fraction f = new fraction();
		@SuppressWarnings("resource")
		Scanner sck = new Scanner(System.in);
		for (int i = 0; i < 1; i++) {
			System.out.print("Please enter array length K > ");
			if (sck.hasNextInt()) {
				f.k = sck.nextInt();
				len = f.k;
			}
		}

		@SuppressWarnings("resource")
		Scanner scm = new Scanner(System.in);
		int[] masnum = new int[len];
		int[] masdenom = new int[len];
		for (int ii = 0; ii < masnum.length; ii++) {
			System.out.print("Please enter numerator > ");
			if (scm.hasNextInt()) {
				masnum[ii] = scm.nextInt();
			}
			System.out.print("Please enter denominator > ");
			if (scm.hasNextInt()) {
				masdenom[ii] = scm.nextInt();
			}
		}
		System.out.println("");
		System.out.println("------------------");
		print(masnum, masdenom);
		calsulateFraction(masnum, masdenom);
	}

	public static void print(int[] masnum, int[] masdenom) {
		for (int i = 0; i < masnum.length | i < masdenom.length; i++)

			System.out.print("Numerator[" + i + "]=" + masnum[i] + "; ");
		System.out.println("");
		System.out.println("------------------");
		for (int ii = 0; ii < masdenom.length; ii++)
			System.out.print("Denominator[" + ii + "]=" + masdenom[ii] + "; ");
		System.out.println("");
		System.out.println("------------------");

	}

	public static void calsulateFraction(int[] masnum, int[] masdenom) {
		fraction f = new fraction();
		System.out.println("The fraction array is: ");
		for (int concat = 0; concat < masnum.length; concat++) {
			f.fracArray = masnum[concat] + "/" + masdenom[concat];
			System.out.print("fraction[" + concat + "]=" + f.fracArray + ";");
		}
	}

}