import java.util.Scanner;

public class bodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, Could indicate how much do you weight in lbs?");
		Scanner valor=new Scanner(System.in);
		double valWeight=valor.nextDouble();
		System.out.println("Please, Could indicate how much do you height in inches?");
		Scanner valor1=new Scanner(System.in);
		double valHeight=valor1.nextDouble();	
		//calculateBmi(valWeight,valHeight);
		determineHealth(calculateBmi(valWeight,valHeight));
	}
	
	private static void determineHealth(double bmi) {
		// TODO Auto-generated method stub
		if (bmi<25 && bmi>18.5) {
			System.out.println("Your bmi is optimal.");
		}else if (bmi<18.5){
			System.out.println("You are underweight.");
		}else if (bmi>25){
			System.out.println("You are overweight.");
		}else {
			System.out.println("There was something wrong calculating your BMI.");
		}
		
	}

	private static double calculateBmi(double x, double y) {
		double bmi=(x*703)/(y*y);
		System.out.println("Your BMI is " + bmi);
		return bmi;
	}

}
