import java.util.Arrays;
import java.util.Scanner;

public class sortedNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SIZE = 10;
		String[] stringArray = new String[SIZE];
		// enter data to the array
		for (int i = 0; i < SIZE; i++) {
			System.out.println("Please, Enter a name:");
			Scanner val1 = new Scanner(System.in);
			stringArray[i] = val1.nextLine();
		}
		System.out.println("The unsorted array: " + Arrays.toString(stringArray));
		sortedString(stringArray, SIZE);
		System.out.println("The sorted array: " + Arrays.toString(stringArray));
	}

	private static void sortedString(String[] stringArray, int SIZE) {
		// TODO Auto-generated method stub
		String tempVar;
		for (int i = SIZE - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (stringArray[j].compareTo(stringArray[j + 1]) > 0) {
					tempVar = stringArray[j];
					stringArray[j] = stringArray[j + 1];
					stringArray[j + 1] = tempVar;
				}
			}

		}

	}

}
