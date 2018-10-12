package by.epam.les04.main;
	//import java.util.Random;
	import java.util.Scanner;
public class massive2 {
		public static void main(String[] args) {
			int[] array = new int[5];
			// randomArray(array);
			arrayCreate(array);
			arrayPrintArray(array);
			checkArray(array);
		}

		/* public static void randomArray(int[] array){
		 Random myrand = new Random();
		 for (int i = 0; i < array.length; i++){
		 array[i] = myrand.nextInt(10);
		 }

		 }*/

		public static void arrayCreate(int[] array) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < array.length; i++) {
				System.out.print("Please enter item " + i + " to array > ");
				if (sc.hasNextInt()) {
					array[i] = sc.nextInt();
				}

			}
		}

		public static void arrayPrintArray(int[] array) {
			System.out.println("------------------------------------------------");
			System.out.print("the massive is: ");
			for (int i = 0; i < array.length; i++) {

				System.out.print("array[" + i + "]=" + array[i] + "; ");
			}
			System.out.println();
			System.out.println("------------------------------------------------");
		}

		public static void checkArray(int[] array) {
			boolean flag = true;

			for (int i = 0; i < array.length;) {
				if (array[i] < array[i + 1]) {
					flag = true;
					System.out.print("The massive is ASC, "+"flag is "+flag);
					break;
				} else{
					flag = false;
					System.out.print("The massive is NOT ASC, "+"flag is "+flag);
					break;
				}
			} 
		}
		
		
		
		

	}

