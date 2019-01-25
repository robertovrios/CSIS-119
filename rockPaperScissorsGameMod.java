import java.util.Scanner;
import java.util.Random;

public class rockPaperScissorsGameMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please, choose rock, paper, or scissors :");
		Scanner val = new Scanner(System.in);
		String userChoice = val.nextLine();
		userChoice = validChoose(userChoice);
		System.out.println("The user chose " + userChoice);
		int userIntChoice = displayIntChoose(userChoice);

		Random randomNum = new Random();
		int computerChoice = randomNum.nextInt(3) + 1;
		String computerStrChoice = displayChoose(computerChoice);
		System.out.println("The computer chose " + computerStrChoice);

		if (computerChoice == userIntChoice) {
			System.out.println("There's not winners");
		} else if (isUserWinner(computerChoice, userIntChoice)) {
			System.out.println("User is the winner");
		} else {
			System.out.println("Computer is the winner");
		}

	}

	private static String validChoose(String userChoice) {
		// TODO Auto-generated method stub

		while (!userChoice.toLowerCase().equals("rock") && !userChoice.toLowerCase().equals("paper")
				&& !userChoice.toLowerCase().equals("scissors")) {
			System.out.println("Please, choose rock, paper, or scissors :");
			Scanner val1 = new Scanner(System.in);
			userChoice = val1.nextLine();
		}
		return userChoice;
	}

	private static boolean isUserWinner(int computerChoice, int userChoice) {
		// TODO Auto-generated method stub
		boolean variable = true;
		if ((computerChoice == 1 && userChoice == 2) || (computerChoice == 2 && userChoice == 3)
				|| (computerChoice == 3 && userChoice == 1)) {
			variable = true;
		} else if ((computerChoice == 2 && userChoice == 1) || (computerChoice == 3 && userChoice == 2)
				|| (computerChoice == 1 && userChoice == 3)) {
			variable = false;
		}
		return variable;
	}

	private static String displayChoose(int userChoice) {
		// TODO Auto-generated method stub
		String salida = null;
		switch (userChoice) {
		case 1:
			salida = "Rock";
			break;
		case 2:
			salida = "Paper";
			break;
		case 3:
			salida = "Scissors";
			break;
		default:
			salida = "incorrect";

		}
		return salida;
	}

	private static int displayIntChoose(String userChoice) {
		// TODO Auto-generated method stub
		int salida = 0;
		switch (userChoice.toLowerCase()) {
		case "rock":
			salida = 1;
			break;
		case "paper":
			salida = 2;
			break;
		case "scissors":
			salida = 3;
			break;
		default:
			salida = 0;

		}
		return salida;
	}

}
