package by.cdptr.les03.main;

import java.util.Scanner;

public class LastDigit {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("Введите число: ");
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}
		calculateLast(number);
	}
	
	public static void calculateLast(int number) {
		int poslZifra;
		int poslZifraKv;
		poslZifra = number % 10;
		switch (poslZifra) {
		case 0:
			poslZifraKv = 0;
			break;
		case 1:
			poslZifraKv = 1;
			break;
		case 2:
			poslZifraKv = 4;
			break;
		case 3:
			poslZifraKv = 9;
			break;
		case 4:
			poslZifraKv = 6;
			break;
		case 5:
			poslZifraKv = 5;
			break;
		case 6:
			poslZifraKv = 6;
			break;
		case 7:
			poslZifraKv = 9;
			break;
		case 8:
			poslZifraKv = 4;
			break;
		case 9:
			poslZifraKv = 1;
			break;
		default:
			System.out.println("Что-то не то с программой.");
			return;
		}
		printSqrt(number,poslZifraKv); 
	}
	
	public static void printSqrt(int number, int poslZifraKv){
		System.out.println("Квадрат числа " + number + " равняется "
				+ poslZifraKv);
	}
}
