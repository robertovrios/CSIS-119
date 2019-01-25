import java.util.Scanner;

public class averageRainfall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, Insert the number of years:");
		Scanner val1=new Scanner(System.in);
		int years=val1.nextInt();
		double totalLluvia=0;
		for (int i=1;i<=years;i++) {
			double totalAnioLluvia=0;
			for (int j=1;j<=12;j++) {
				String month = null;
				
				switch(j){
				case 1 : month="January";
				break;
				case 2 : month="February";
				break;
				case 3 : month="March";
				break;
				case 4 : month="April";
				break;
				case 5 : month="May";
				break;
				case 6 : month="June";
				break;
				case 7 : month="July";
				break;
				case 8 : month="August";
				break;
				case 9 : month="September";
				break;
				case 10 : month="October";
				break;
				case 11 : month="November";
				break;
				case 12 : month="December";
				break;
				}
				
				System.out.println("How many inches of rainfall for the year "+i+" in "+month+" :");				
				Scanner val2=new Scanner(System.in);
				double cantidadLluvia=val2.nextDouble();
				
				totalAnioLluvia=totalAnioLluvia + cantidadLluvia;
			}
			System.out.println("The total of rainfall for the year "+i+" is: "+totalAnioLluvia+".");
			totalLluvia=totalLluvia+totalAnioLluvia;
		}
		System.out.println("The total of rainfall for "+years+" years is: "+totalLluvia+".");
		double averageRainfall=(totalLluvia)/(years*12);		
		System.out.println("The average rainfall per month for "+years*12+" months is: "+averageRainfall+".");
	}

}
