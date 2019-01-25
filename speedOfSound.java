import java.util.Scanner;

public class speedOfSound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = 0;
		int optionInt = 0;
		double sec = 0;
		do {
			optionInt = mainMenu();
			sec = subMenu();
			switch (optionInt) {
			case 1:
				result = airSpeed(sec);
				break;
			case 2:
				result = waterSpeed(sec);
				break;
			case 3:
				result = steelSpeed(sec);
				break;
			}
			if (result != 0) {
				System.out.println("The distance the sound will travel is: " + result);
				result = 0;
			}
		} while (optionInt != 4);
	}

	private static double subMenu() {
		// TODO Auto-generated method stub
		double sec = 0;

		String seconds = " ";
		while (true) {
			try {

				System.out.println("Enter the number of seconds:");
				Scanner scan = new Scanner(System.in);
				seconds = scan.next();
				sec = Double.parseDouble(seconds);
			} catch (Exception e) {
				System.out.println("Enter a valid integer value");
				continue;
				// .args.break;
			}
			return sec;
		}
	}

	private static double steelSpeed(double intSeconds) {
		// TODO Auto-generated method stub
		double result = intSeconds * 16400;
		return result;
	}

	private static double waterSpeed(double intSeconds) {
		// TODO Auto-generated method stub
		double result = intSeconds * 4900;
		return result;
	}

	private static double airSpeed(double intSeconds) {
		// TODO Auto-generated method stub
		double result = intSeconds * 1100;
		return result;
	}

	private static int mainMenu() {
		// TODO Auto-generated method stub

		String option = " ";
		int optionInt = 0;
		double result = 0;
		while (true) {
			try {
				System.out.println("Main Menu");
				System.out.println("1. Air");
				System.out.println("2. Water");
				System.out.println("3. Steel");
				System.out.println("4. Exit");
				System.out.println("Please choose an option:");
				Scanner scan = new Scanner(System.in);
				String opt = scan.nextLine();
				optionInt = Integer.parseInt(opt);
			} catch (Exception e) {

				System.out.println();
				System.out.println("This is an invalid option");
				System.out.println("Please, choose a valid option: 1,2,or 3");
				continue;
			}
			if (optionInt < 1 || optionInt > 4) {
				System.out.println("You chose an invalid option");
				System.out.println("Please, choose a valid option: 1, 2, or 3");

			} else {
				break;
			}

		}
		return optionInt;
	}
}
