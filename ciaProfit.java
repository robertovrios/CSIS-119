import java.util.Scanner;

public class ciaProfit {

	static double totalSales;
	static double companyProfit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your total sales $ ?");
		Scanner valor = new Scanner (System.in);
		totalSales = valor.nextDouble();
		companyProfit = totalSales*0.23;
		System.out.println("The company profit is $ " + companyProfit); 
	}

}
