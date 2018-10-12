package by.cdptr.les03.main;

import java.util.Scanner;

public class MinMaxString {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int n = 3;
		Scanner sc = new Scanner(System.in);
		String max = "", min = "", str = "";
		for (int i = 0; i < n; i++) {
			System.out.print("> ");
			if (sc.hasNextLine()) {
				str = sc.nextLine();
				if (i == 0) {
					min = str;
				}
				if (str.length() > max.length()) {
					max = str;
				} else if (str.length() < min.length()) {
					min = str;
				}
			}
		}
		printMinMax(max, min);

	}

	public static void printMinMax(String max, String min) {
		System.out.println("max string = " + max + " length=" + max.length());
		System.out.println("min string = " + min + " length=" + min.length());
	}
}