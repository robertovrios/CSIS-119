import java.util.Scanner;

public class recursivePowerMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, enter the number to be raised:");
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();

		System.out.println("Please, enter the exponent:");
		Scanner scn1 = new Scanner(System.in);
		int y = scn1.nextInt();

		recursivePower(x, y, 1);

	}

	private static void recursivePower(int x, int y, int result) {
		// TODO Auto-generated method stub
		if (y > 0) {
			result = result * x;
			recursivePower(x, y - 1, result);
		} else {
			System.out.println("The result is: " + result);
		}
	}

}
