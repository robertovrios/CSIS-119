import java.util.Scanner;

public class speedViolationCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is the speed limit: ");
		Scanner val1 = new Scanner(System.in);
		double speedLimit = val1.nextDouble();
		speedLimit=validateSpeedLimit(speedLimit);
		
		
		System.out.println("What is your speed: ");
		Scanner val2 = new Scanner(System.in);
		double yourSpeed = val2.nextDouble();
		yourSpeed = validateYourSpeed(yourSpeed, speedLimit);
		double overSpeedLimit= Math.round((yourSpeed - speedLimit)*100)/100.0;
		System.out.println("The number of miles per hour over the speed limit "+speedLimit+" is "+overSpeedLimit);
	}


	private static double validateYourSpeed(double yourSpeed,double speedLimit) {
		// TODO Auto-generated method stub
		while(yourSpeed<=speedLimit) {
		System.out.println("What is your speed: ");
		Scanner val3 = new Scanner(System.in);
		yourSpeed = val3.nextDouble();
		}
		return yourSpeed;
	}

	private static double validateSpeedLimit(double speedLimit) {
		// TODO Auto-generated method stub
		while(speedLimit<20 || speedLimit>70 ) {
			System.out.println("What is the speed limit: ");
			Scanner val4 = new Scanner(System.in);
			speedLimit = val4.nextDouble();			
		}
		return speedLimit;
	}

}
