import java.util.Scanner;

public class stadiumSeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please, How many class seat A tickets do you want to buy ($15 each seat)?");
		Scanner val1=new Scanner(System.in);
		// the number of seats must be integer
		int numSeatA=val1.nextInt();
		System.out.println("Please, How many class seat B tickets do you want to buy ($12 each seat)?");
		Scanner val2=new Scanner(System.in);
		int numSeatB=val2.nextInt();
		System.out.println("Please, How many class seat C tickets do you want to buy ($9 each seat)?");
		Scanner val3=new Scanner(System.in);
		int numSeatC=val3.nextInt();
		calculateTickets(numSeatA,numSeatB,numSeatC);
		
	}
	public static void calculateTickets(int x, int y, int z) {
		double costTotal=x*15+y*12+z*9;
		System.out.println("You want to buy "+x+" class A seats for $15 each seat.");
		System.out.println("You want to buy "+y+" class B seats for $12 each seat..");
		System.out.println("You want to buy "+z+" class C seats for $9 each seat..");
		System.out.println("The total for this purchase is "+costTotal);
	}
}
