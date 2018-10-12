package by.epam.les04.main;
	import java.util.Arrays;
public class massive3 {
		public static void main(String[] args) {
			int[] array = { 0, 1, 0, 3, 20, 75, 0, 8, 145, 0 };
			System.out.println("Array is: "+Arrays.toString(array));
			calculate(array);
			System.out.print("]");
		}

		public static void calculate(int[] array) {
			
			System.out.print("The zero massive numbers is: [");
			for (int i = 0; i < array.length; i++) {
				
				if (array[i] == 0) {
					int[] newArray = { i };

					printRes(newArray);

				}
			}
		}

		public static void printRes(int[] newArray) {

			for (int finalArray : newArray) {
				
				System.out.print(finalArray + " ");

			}
		}
	}