import java.util.Scanner;

public class recursiveArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insert an integer value as array SIZE: ");
		Scanner scn = new Scanner(System.in);
		int SIZE = scn.nextInt();
		int[] intArray = new int[SIZE];

		recurArraySum(intArray, SIZE, 0);

	}

	private static void recurArraySum(int[] intArray, int SIZE, int total) {
		// TODO Auto-generated method stub

		if (SIZE > 0) {
			System.out.println("Insert an integer value: ");
			Scanner scn = new Scanner(System.in);
			int number = scn.nextInt();
			total = total + number;
			recurArraySum(intArray, SIZE - 1, total);
		} else {
			System.out.println("The total Sum is: " + total);
		}

	}

}
