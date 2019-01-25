import java.util.Scanner;

public class monthlySalesTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, Enter the total sales for the month: ");
		Scanner val1=new Scanner(System.in);
		double totalSales=val1.nextDouble();
		calculateSalesTax(totalSales);
	}
	public static void calculateSalesTax(double x) {
// defining local constants countyTax and stateTax
		double countyTax=0.02;
		double stateTax=0.04;
		double countySalesTax=x*countyTax;
		double stateSalesTax=x*stateTax;
		double totalSalesTax=x*(countyTax+stateTax);
		
		System.out.println("The amount of county sales tax is "+countySalesTax);
		System.out.println("The amount of state sales tax is "+stateSalesTax);
		System.out.println("The total sales tax is "+totalSalesTax);
	}

}
