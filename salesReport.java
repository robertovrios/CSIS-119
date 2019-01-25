import java.util.Scanner;
import java.io.*;


public class salesReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double total = 0;
		int SIZE=9;
		double[] salesEmployee= new double[SIZE];
		String[] nameEmployee= new String[SIZE];;   
		Scanner fileSales = new Scanner(new File("C:/Users/Roberto/Desktop/ventas.txt"));
		
		while (fileSales.hasNextLine()) {
			fileSales.useDelimiter(";");
			for (int i=0;i<SIZE;i++) {
				nameEmployee[i] = fileSales.next();
				salesEmployee[i]= Double.parseDouble(fileSales.next());
			}

		}

		fileSales.close();
		//double total=0;
		double subtotal=0;
		System.out.println("Salesperson ID     "+ " Sale Amount");
		System.out.println("===============================================");
		String valueCompare=nameEmployee[0];
		for (int i=0;i<SIZE;i++) {
			if (nameEmployee[i].equals(valueCompare)) {
				subtotal=subtotal+salesEmployee[i];
				System.out.println(nameEmployee[i]+ "                 "+ salesEmployee[i]);
			}else {
				
				System.out.println("Total Sales for this salesperson: $"+ subtotal);
				System.out.println("");
				subtotal=0;
				System.out.println(nameEmployee[i]+ "                 "+ salesEmployee[i]);
				subtotal=subtotal+salesEmployee[i];
				valueCompare=nameEmployee[i];
				
			}
			total = total + salesEmployee[i];
			
		}
		System.out.println("Total Sales for this salesperson: $"+ subtotal);
		System.out.println("The total of all sales: $"+total);
	}
}



