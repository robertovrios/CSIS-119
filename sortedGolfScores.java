import java.util.Arrays;
import java.util.Scanner;

public class sortedGolfScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SIZE = 4;
		int[] numArray = new int[SIZE];
		// enter data to the array
		for (int i = 0; i < SIZE; i++) {
			System.out.println("Please, Enter a number:");
			Scanner val1 = new Scanner(System.in);
			numArray[i] = val1.nextInt();
		}

		System.out.println("The unsorted array: " + Arrays.toString(numArray));

		sortedScores(numArray, SIZE);
		System.out.println("The sorted array: " + Arrays.toString(numArray));

	}

	private static void sortedScores(int[] numArray, int SIZE) {
		// TODO Auto-generated method stub
		// int maxElement;
		int tempVar;
		for (int i = SIZE - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (numArray[j] > numArray[j + 1]) {
					tempVar = numArray[j];
					numArray[j] = numArray[j + 1];
					numArray[j + 1] = tempVar;
				}
			}

		}
	}

}
