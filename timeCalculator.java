import java.util.Scanner;

public class timeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, Enter a number of seconds: ");
		Scanner val1=new Scanner(System.in);
		// the number of seats must be integer
		int seconds=val1.nextInt();
		calcTime(seconds);
	}

	private static void calcTime(int seconds) {
		// TODO Auto-generated method stub
		
		if (seconds/60>0){
		System.out.println("There's "+ seconds/60 +" minutes in "+ seconds + " seconds.");
			if(seconds/3600>0) {
				System.out.println("There's "+ seconds/3600 +" hours in "+ seconds + " seconds.");
				if(seconds/86400>0) {
					System.out.println("There's "+ seconds/86400 +" days in "+ seconds + " seconds.");
				}
			}
		}else {
			System.out.println("There's only "+ seconds + " seconds.");
		}
	}
}
