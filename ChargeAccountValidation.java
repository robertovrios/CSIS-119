import java.util.Scanner;

public class ChargeAccountValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int SIZE=15;
		double[] numArray= {5658845,4520125,7895122,877541,8451277,1302850,8080152,4562555,5552012,5050552,7825877,1250255,1005231,6545231,7576651,7881200,4581002};
		System.out.println("Enter a charge account number: ");
		Scanner val1 = new Scanner(System.in);
		double accountNumber=val1.nextDouble();
		
		if (validAccountNumber(numArray,accountNumber)) {
			System.out.println("The number account is valid.");
		}else {
			System.out.println("The number account is invalid.");
		}
	}

	private static boolean validAccountNumber(double[] numArray, double accountNumber) {
		// TODO Auto-generated method stub
		boolean salida=false;
		for (int i=0;i<numArray.length;i++) {
			if(numArray[i]==accountNumber) {
				salida=true;
				break;
			}else {
				salida=false;
			}
		}
		return salida;
	}
}
