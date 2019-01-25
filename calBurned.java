
public class calBurned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double totalCal=0;
	
	for (int counter=1; (counter<=30); counter++) {
		totalCal= totalCal + 3.90;
		if (counter%5==0 && counter>=10) {
		System.out.println("The number of calories burned after " +counter+ " minutes is "+totalCal+".");
		}
	}
	}

}
