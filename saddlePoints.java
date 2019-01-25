import java.util.Arrays;
import java.util.Random;

public class saddlePoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 7;
		int columns = 7;
		int[][] twoDimArray = new int[rows][columns];

		storageValues(twoDimArray, rows, columns);
		int[] saddlerArray = new int[rows];
		saddlerArray = saddlePoints(twoDimArray, rows, columns);

		System.out.println(Arrays.deepToString(twoDimArray));
		System.out.println("The saddler point is " + Arrays.toString(saddlerArray));
	}

	private static int[] saddlePoints(int[][] twoDimArray, int rows, int columns) {
		// TODO Auto-generated method stub
		int[] saddlerArray = new int[rows];
		for (int i = 0; i < rows; i++) {
			saddlerArray[i] = twoDimArray[i][0];
			for (int j = 0; j < columns; j++) {
				if (twoDimArray[i][j] < saddlerArray[i]) {
					saddlerArray[i] = twoDimArray[i][j];

				}

			}

		}

		return saddlerArray;
	}

	private static void storageValues(int[][] twoDimArray, int rows, int columns) {
		// TODO Auto-generated method stub
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				Random randomNum = new Random();
				int computerChoice = randomNum.nextInt(100) + 1;
				twoDimArray[i][j] = computerChoice;
			}
		}

	}
}
