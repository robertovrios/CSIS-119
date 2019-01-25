import java.util.Arrays;
import java.util.Random;

public class sortingBenchmark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SIZE = 20;
		int[] constantArray  = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			Random rand = new Random();
			constantArray[i] = rand.nextInt(100);
		}

		int[] numArray1 = constantArray.clone();
		System.out.println("The array 1 is: " + Arrays.toString(numArray1));
		int countBubble = sortedScores(numArray1, SIZE);
		//System.out.println("The array 1 is: " + Arrays.toString(numArray1));
		System.out.println("The number of iterations for Array 1 is " + countBubble);


		int[] numArray2 = constantArray.clone();
		System.out.println("The array 2 is: " + Arrays.toString(numArray2));
		int countSelection = selectionArray(numArray2);
		
		System.out.println("The number of iterations for Array 2 is " + countSelection);
		

		
		int[] numArray3 = constantArray.clone();
		System.out.println("The array 3 is: " + Arrays.toString(numArray3));
		int countInsertion = insertionArray(numArray3);
		//System.out.println("The array 3 is: " + Arrays.toString(numArray3));
		System.out.println("The number of iterations for Array 3 is " + countInsertion);
	}

	private static int sortedScores(int[] numArray1, int SIZE) {
		// TODO Auto-generated method stub
		// int maxElement;\
		int count = 0;
		int tempVar;
		for (int i = SIZE - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (numArray1[j] > numArray1[j + 1]) {
					tempVar = numArray1[j];
					numArray1[j] = numArray1[j + 1];
					numArray1[j + 1] = tempVar;
					count = count + 1;
				}

			}

		}
		System.out.println("The array 2 is: " + Arrays.toString(numArray1));
		return count;
	}

	private static int selectionArray(int[] numArray2) {
		// TODO Auto-generated method stub
		// int maxElement;
		int count = 0;
		int index;
		int minIndex;
		int minValue;

		for (int i = 0; i < numArray2.length - 1; i++) {
			minIndex = i;
			minValue = numArray2[i];

			for (int j = i + 1; j < numArray2.length; j++) {
				if (numArray2[j] < minValue) {
					minValue = numArray2[j];
					minIndex = j;
					count = count + 1;
					
				}
				

			}
			numArray2[minIndex]=numArray2[i];
			numArray2[i]=minValue;
		}
		System.out.println("The array 2 is: " + Arrays.toString(numArray2));
		return count;

	}

	private static int insertionArray(int[] numArray3) {
		// TODO Auto-generated method stub
		// int maxElement;
		int count = 0;
		int unsortedValue;
		int scan;

		for (int i = 1; i < numArray3.length; i++) {

			unsortedValue = numArray3[i];
			scan = i;

			while (scan > 0 && numArray3[scan - 1] > unsortedValue) {
				numArray3[scan] = numArray3[scan - 1];
				scan--;
				count = count + 1;
				
			}
			numArray3[scan] = unsortedValue;
			
		}
		System.out.println("The array 2 is: " + Arrays.toString(numArray3));
		return count;

	}

}
