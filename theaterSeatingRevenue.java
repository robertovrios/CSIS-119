import java.util.Scanner;

public class theaterSeatingRevenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numAvailableSeatsA = 300;
		int numAvailableSeatsB = 500;
		int numAvailableSeatsC = 200;
		double total = 0;
		String userChoice = validateSeats();
		int numSeats = 0;

		switch (userChoice.toLowerCase()) {
		case "a":
			numSeats = isValidNumber(userChoice, numAvailableSeatsA,numAvailableSeatsB,numAvailableSeatsC);
			numAvailableSeatsA = numAvailableSeatsA - numSeats;
			total = total + 20 * numSeats;
			break;
		case "b":
			numSeats = isValidNumber(userChoice, numAvailableSeatsA,numAvailableSeatsB,numAvailableSeatsC);
			numAvailableSeatsB = numAvailableSeatsA - numSeats;
			total = total + 15 * numSeats;
			break;
		case "c":
			numSeats = isValidNumber(userChoice, numAvailableSeatsA,numAvailableSeatsB,numAvailableSeatsC);
			numAvailableSeatsC = numAvailableSeatsA - numSeats;
			total = total + 10 * numSeats;
			break;
		}
		
		
		
		System.out.println("Do you want to finish (Y/N)");
		Scanner val2 = new Scanner(System.in);
		String respUser = val2.nextLine();
		while (respUser.toLowerCase().equals("n")) {
			userChoice = validateSeats();
			switch (userChoice.toLowerCase()) {
			case "a":
				numSeats = isValidNumber(userChoice, numAvailableSeatsA,numAvailableSeatsB,numAvailableSeatsC);
				numAvailableSeatsA = numAvailableSeatsA - numSeats;
				total = total + 20 * numSeats;
				break;
			case "b":
				numSeats = isValidNumber(userChoice, numAvailableSeatsA,numAvailableSeatsB,numAvailableSeatsC);
				numAvailableSeatsB = numAvailableSeatsB - numSeats;
				total = total + 15 * numSeats;
				break;
			case "c":
				numSeats = isValidNumber(userChoice, numAvailableSeatsA,numAvailableSeatsB,numAvailableSeatsC);
				numAvailableSeatsC = numAvailableSeatsC - numSeats;
				total = total + 10 * numSeats;
				break;
			}

			System.out.println("Do you want to finish (Y/N)");
			Scanner val4 = new Scanner(System.in);
			respUser = val4.nextLine();

		}
		System.out.println("Total is:" + total);
	}

	private static int isValidNumber(String userChoice, int numAvailableSeatsA,int numAvailableSeatsB, int numAvailableSeatsC) {
		// TODO Auto-generated method stub

		System.out.println("How many seats in section " + userChoice.toUpperCase() + " do you want to purchase: ");
		Scanner val1 = new Scanner(System.in);
		int numSeats = val1.nextInt();

		while (((userChoice.toLowerCase().equals("a")) && (numSeats < 0 || numAvailableSeatsA < numSeats))
				|| ((userChoice.toLowerCase().equals("b")) && (numSeats < 0 || numAvailableSeatsB < numSeats))
				|| ((userChoice.toLowerCase().equals("c")) && (numSeats < 0 || numAvailableSeatsC < numSeats))) 
				{
			System.out.println("There's not more seats for the section " + userChoice.toUpperCase() + " available.");
			System.out.println("How many seats in section " + userChoice.toUpperCase() + " do you want to purchase: ");
			Scanner val2 = new Scanner(System.in);
			numSeats = val2.nextInt();

		}

		return numSeats;
	}

	private static String validateSeats() {
		// TODO Auto-generated method stub
		System.out.println("Section A seats cost $20 each.");
		System.out.println("Section B seats cost $15 each.");
		System.out.println("Section C seats cost $10 each.");
		System.out.println("Please, Indicate the section seat to you want to purchase:");
		Scanner val = new Scanner(System.in);
		String userChoice = val.nextLine();

		while (!userChoice.toLowerCase().equals("a") && !userChoice.toLowerCase().equals("b")
				&& !userChoice.toLowerCase().equals("c")) {
			System.out.println("Section A seats cost $20 each.");
			System.out.println("Section B seats cost $15 each.");
			System.out.println("Section C seats cost $10 each.");
			System.out.println("Please, Indicate the section seat to you want to purchase:");
			Scanner val1 = new Scanner(System.in);
			userChoice = val1.nextLine();

		}

		return userChoice;

	}

}
