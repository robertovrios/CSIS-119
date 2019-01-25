import java.util.Scanner;

public class numberAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int SIZE = 10;
		double[] numArray = new double[SIZE];
		// enter data to the array
		for (int i = 0; i < SIZE; i++) {
			System.out.println("Please, Enter a number:");
			Scanner val1 = new Scanner(System.in);
			numArray[i] = val1.nextDouble();
		}

		// find the lowest number
		lowestNumber(numArray, SIZE);
		// find the highest number
		highestNumber(numArray, SIZE);
		// Find the total of the numbers in the array
		double totalNumbers = totalNumbers(numArray, SIZE);
		System.out.println("The total of the numbers is: " + totalNumbers);
		// The average of the numbers in the array
		System.out.println("The total of the numbers is: " + totalNumbers / SIZE);
	}

	private static double totalNumbers(double[] numArray, int size) {
		// TODO Auto-generated method stub
		double total = 0;
		for (int i = 0; i < size; i++) {
			total = total + numArray[i];
		}
		return total;

	}

	private static void lowestNumber(double[] numArray, int size) {
		// TODO Auto-generated method stub
		double lowestVal = numArray[0];
		for (int i = 0; i < size; i++) {
			if (numArray[i] < lowestVal) {
				lowestVal = numArray[i];
			}
		
		}
		System.out.println("The lowest number is: " + lowestVal);
	}

	private static void highestNumber(double[] numArray, int size) {
		// TODO Auto-generated method stub
		double highestVal = numArray[0];
		for (int i = 0; i < size; i++) {
			if (numArray[i] > highestVal) {
				highestVal = numArray[i];
			}

		}
		System.out.println("The lowest number is: " + highestVal);
	}

}
