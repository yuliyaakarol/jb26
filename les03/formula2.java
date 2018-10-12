package by.epam.les08.main;
import java.util.Scanner;
public class formula2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x> ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();

		}
		funcCalc(x);
	}

	public static void funcCalc(int x) {
		double fx = 0;
		if (x <= -3) {
			fx = 9;
		} else if (x > 3) {
			fx = 1 / ((Math.pow(x, 2))+1);
		} else {
			System.out.println("Please re-enter x in interval: '-3 <= x > 3' ");
			return;
			
		}
		printResult(fx);
	}
	
	public static void printResult(Double x){
		System.out.println("f(x) = "+x);
	}
}



