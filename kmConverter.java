import java.util.Scanner;

public class kmConverter {
		static double distanceKm;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("Could you enter the distance in Kilometers?");
			Scanner valor = new Scanner (System.in);
			distanceKm = valor.nextDouble();
			//System.out.println("The distance in miles is " + convertMod(distanceKm));
			convertMod(distanceKm);
		}

		public static void convertMod(double a) {
			double salida=0;
			salida=a*0.6214;
			//return salida;
			System.out.println("The distance in miles is " + salida);
		}

}
