import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, insert a non negative integer :");
		Scanner val1 = new Scanner(System.in);
		int numFactorial = val1.nextInt();
		if (validateNumber(numFactorial)) {
			calcFactorial(numFactorial);
		} else {
			System.out.println("Enter a valid non negative integer number");
		}

	}

	private static boolean validateNumber(int numFactorial) {
		// TODO Auto-generated method stub
		if (numFactorial > 0) {
			return true;
		} else {
			return false;
		}
	}

	private static void calcFactorial(int numFactorial) {
		// TODO Auto-generated method stub
		int result = 1;
		for (int i = 1; i <= numFactorial; i++) {
			result = result * i;
		}
		System.out.println("The factorial of " + numFactorial + " is: " + result + ".");
	}

}
