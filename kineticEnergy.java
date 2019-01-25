import java.util.Scanner;

public class kineticEnergy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, insert the mass of the object (in kilograms):");
		Scanner val = new Scanner(System.in);
		double massObj= val.nextDouble();
		System.out.println("Please, insert the velocity of the object (in meters per second):");
		Scanner val1 = new Scanner(System.in);
		double speedObj= val1.nextDouble();
		double ke=kineticEnerFunction(massObj,speedObj);
		System.out.println("The Kinetic Energy for an object with a mas of "+massObj+" and velocity of "+speedObj+" is: "+ke);
	}

	private static double kineticEnerFunction(double massObj, double speedObj) {
		// TODO Auto-generated method stub
		return 0.5*massObj*speedObj*speedObj;
	}

}
