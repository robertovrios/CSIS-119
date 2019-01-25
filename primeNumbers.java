import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		System.out.println("Please, insert an integer number:");
		Scanner val = new Scanner(System.in);
		String numero = val.nextLine();
		// data type validation for the variable numero 
		try {
			Integer.parseInt(numero);
			num = Integer.parseInt(numero);
		} catch (NumberFormatException e) {
			System.out.println(numero + " is not a valid integer number");
		}

		// create a variable length and concatenate the number 1 with all the 0's according to the length of the number
		int length = String.valueOf(num).length();
		String zerosValue = "0";
		for (int i = 1; i < length; i++) {
			// quantity of zeros in the right
			zerosValue = zerosValue + Integer.toString(0);
		}
		// Concatenate the string "1" to all the zeros in the right
		String stringMaxValue = Integer.toString(1) + zerosValue;
		int maxValue = Integer.parseInt(stringMaxValue);
		
		// evaluate if the number is prime or not
		if (isPrime(num, maxValue)) {
			System.out.println("The number "+num + " is a prime number");
		}else {
			System.out.println("The number "+num + " is not a prime number");			
		}
		;
	}

	private static boolean isPrime(int num, int maxValue) {
		// TODO Auto-generated method stub
		int contador = 0;
		for (int i = 1; i <= maxValue; i++) {
			if (num % i == 0) {
				contador = contador + 1;
			}

		}
		if (contador == 2 || num==1) {
			return true;
		} else {
			return false;
		}

	}

}
