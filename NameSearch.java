import java.util.Arrays;
import java.util.Scanner;

public class NameSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int SIZE = 4;
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

		System.out.println("Please, Enter a name to search:");
		Scanner val1 = new Scanner(System.in);
		String searchValue = val1.nextLine();

		int position = 0;
		position = searchName(stringArray, searchValue, SIZE);
		if (position > 0) {
			System.out.println("We found " + searchValue + " in the array.");
		} else {
			System.out.println("We dont found " + searchValue + " in the array.");
		}

	}

	private static int searchName(String[] stringArray, String searchValue, int sIZE) {
		// TODO Auto-generated method stub

		int first = 0;
		int last = stringArray.length - 1;
		int middle;
		int position = -1;
		boolean found = false;

		while (!found && first <= last) {
			middle = (first + last) / 2;

			if (stringArray[middle].equals(searchValue)) {
				found = true;
				position = middle;
			} else if (stringArray[middle].compareTo(searchValue) > 0) {
				last = middle - 1;

			} else {
				first = middle + 1;

			}
			// return position;
		}
		return position;

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
