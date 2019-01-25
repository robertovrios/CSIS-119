import java.util.Scanner;

public class hotDogCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, Enter the number of people attending the cookout: ");
		Scanner val1=new Scanner(System.in);
		// the number of seats must be integer
		int totalConsumers=val1.nextInt();
		calculateGoods(totalConsumers);
	}
	public static void calculateGoods(int x){
		int numpackHotdog;
		int numpackBuns;
		int numHotdogsleft;
		int numHotbunsleft;
		
		if (x%10>0) {
			numpackHotdog=x/10 +1;
			numHotdogsleft=10-(x%10);
		}else {
			numpackHotdog=x/10;
			numHotdogsleft=0;
		}
					
		if (x%8>0){
			numpackBuns=x/8 +1;	
			numHotbunsleft=8-(x%8);	
		}else {
			numpackBuns=x/8;
			numHotbunsleft=0;
		}

		System.out.println("The minimun number of packages of hot dogs required: "+numpackHotdog);
		System.out.println("The minimun number of packages of buns required: "+numpackBuns);
		System.out.println("The number of hot dogs that will be left over: "+numHotdogsleft);
		System.out.println("The number of hot dogs that will be left over: "+numHotbunsleft);
	}
}
