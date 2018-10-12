package by.cdptr.les03.main;

import java.util.Scanner;

public class Line01 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("������� �����: ");
		if (sc.hasNextInt())
			number = sc.nextInt();
		calcDigit(number);
	}

	public static void calcDigit(int number) {
		int digit = 0;
		while (number != 0) {
			digit = number % 10;
			number = number / 10;
			
		}
		printDigit(digit);
	}
	
	public static void printDigit(int digit) {
			if (digit % 2 == 0) {
				System.out.println("� ����� ���� ������ �����.");
				return;
			}
			System.out.println("� ����� ��� ������ ����.");
		}
}
	


