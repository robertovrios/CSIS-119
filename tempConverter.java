import java.util.Scanner;

public class tempConverter {

	static String typeConv;
	static double temp;
	static double tempConverted;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Which conversion do you want to do?");
		Scanner valor = new Scanner (System.in);
		typeConv=valor.next();
			
		if (typeConv.equals("F") || typeConv.equals("f")) {
			System.out.println("Enter the temperature to be converted to Celsius:");
			Scanner valor1 = new Scanner (System.in);
			temp=valor1.nextDouble();
			tempConverted = ((temp-32)*5)/9;
			System.out.println("Temperature in Celsius is:" + tempConverted);
			
		}else if (typeConv.equals("C") || typeConv.equals("c")){
			System.out.println("Enter the temperature to be converted to Fahrenheit:");
			Scanner valor2 = new Scanner (System.in);
			temp=valor2.nextDouble();
			tempConverted = (9*temp/5) + 32 ;
			System.out.println("Temperature in Fahrenheit is:" + tempConverted);
		}else {
			System.out.println("Please, choose only F or C");
		}
	}
}
