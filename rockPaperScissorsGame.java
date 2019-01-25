import java.util.Scanner;
import java.util.Random;


public class rockPaperScissorsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random randomNum= new Random();
		int computerChoice= randomNum.nextInt(3) + 1;

		System.out.println("Please, choose rock (1), paper (2), or scissors (3):");

		Scanner val = new Scanner(System.in);
		
		int userChoice = val.nextInt();
		
		System.out.println("The user chose "+displayChoose(userChoice));
		System.out.println("The computer chose "+displayChoose(computerChoice));
		
		if (computerChoice==userChoice) {
			System.out.println("There's not winners");
		}else if (isUserWinner(computerChoice,userChoice)) {
			System.out.println("User is the winner");
		}else {
			System.out.println("Computer is the winner");
		}
		
		
	}

	private static String displayChoose(int userChoice) {
		// TODO Auto-generated method stub
		String salida=null;
		switch (userChoice){
			case 1:
				salida="Rock";
				break;
			case 2:
				salida="Paper";
				break;
			case 3:
				salida="Scissors";
				break;
			default:
				salida="incorrect";			
		
		}
		return salida;
	}

	private static boolean isUserWinner(int computerChoice, int userChoice) {
		// TODO Auto-generated method stub
		boolean variable=true;
		if((computerChoice==1 && userChoice==2)||(computerChoice==2 && userChoice==3)||(computerChoice==3 && userChoice==1)){
			variable=true;
		}else if((computerChoice==2 && userChoice==1)||(computerChoice==3 && userChoice==2)||(computerChoice==1 && userChoice==3)){
			variable=false;
		}
		return variable;
	}

}
