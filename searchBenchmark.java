import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class searchBenchmark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SIZE = 20;
		int[] numArray = new int[SIZE];
		// enter data to the array
		for (int i = 0; i < SIZE; i++) {
			Random rand = new Random();
			numArray[i] = rand.nextInt(100);
		}
		System.out.println("The array is: " + Arrays.toString(numArray));
		Random rand1 = new Random();
		int valueToSearch = rand1.nextInt(100);
		System.out.println("The value to search is: " + valueToSearch);
		int position = 0;
		position = searchValueInt(numArray, valueToSearch, SIZE);
		if (position > 0) {
			System.out.println("Found the value " + valueToSearch + " in the array");
		} else {
			System.out.println("Not found the value " + valueToSearch + " in the array");
		}
	}

	private static int searchValueInt(int[] numArray, int valueToSearch, int SIZE) {
		// TODO Auto-generated method stub

		int first = 0;
		int last = numArray.length - 1;
		int middle;
		int position = -1;
		boolean found = false;

		while (!found && first <= last) {
			middle = (first + last) / 2;

			if (numArray[middle] == (valueToSearch)) {
				found = true;
				position = middle;
			} else if (numArray[middle] - valueToSearch > 0) {
				last = middle - 1;

			} else {
				first = middle + 1;

			}
			// return position;
		}
		return position;
	}

}
