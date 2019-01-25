import java.util.Scanner;

public class salesCalculation {
	static double priceProd;
	static int numProducts = 5;
	static double tax=0.06;
	static double subtotal;
	static double total;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=numProducts;i++) {
			System.out.println("How much does the product " + i + " cost?");
			Scanner valor = new Scanner (System.in);
			priceProd = valor.nextDouble();
			subtotal = subtotal + priceProd;
			
		}
		
		System.out.println("The subtotal is $ " + subtotal); 
		total = subtotal * ( 1 + tax);
		System.out.println("The subtotal is $ " + total); 
				
	}
	
}
