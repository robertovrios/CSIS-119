import java.util.Scanner;

public class modInsurance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		askUser();
	}
	public static void askUser() {
		System.out.println("Please, insert the replacement value of the cost of your house:");
		Scanner valor=new Scanner(System.in);
		double valHouse=valor.nextDouble();
		double minValueHouse=valHouse*0.8;
		System.out.println("The minimun amount of insurance is: " + minValueHouse);
	}

}
