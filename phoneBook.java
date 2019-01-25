import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class phoneBook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int option = 0;

		do {
			option = callMenu();
			switch (option) {
			case 1:
				addNewRecord();
				break;
			case 2:
				searchName();
				break;
			case 3:
				modifyPhone();
				break;
			case 4:
				deleteRecord();
				break;
			}

		} while (option != 5);
	}

	private static int callMenu() {
		// TODO Auto-generated method stub
		// int
		String option = " ";
		int optionInt = 0;
		while (true) {

			try {
				// do {
				System.out.println("Main Menu");
				System.out.println("1. Add new record");
				System.out.println("2. Search for a name");
				System.out.println("3. Modify a phone number");
				System.out.println("4. Delete a record");
				System.out.println("5. Exit the program");
				Scanner scan = new Scanner(System.in);
				option = scan.next();
				optionInt = Integer.parseInt(option);
			} catch (Exception e) {
				System.out.println();
				System.out.println("This is an invalid option");
				System.out.println("Enter 1,2,3,4,or 5");
				continue;
			}
			if (optionInt < 1 || optionInt > 5) {
				System.out.println();
				System.out.println("This is an invalid option");
				System.out.println("Enter 1,2,3,4,or 5");
			} else {
				break;
			}

		}
		return optionInt;

	}

	private static void addNewRecord() throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Adding a new record");
		System.out.println("Enter the name:");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Enter the phone number:");
		Scanner scan2 = new Scanner(System.in);
		String phone = scan2.nextLine();
		String newRecord = name + ";" + phone;
		File phoneFile = new File("C:/Users/Roberto/Desktop/phone_book.txt");
		FileWriter fw;
		if (phoneFile.exists()) {
			fw = new FileWriter(phoneFile, true);
		} else {
			phoneFile.createNewFile();
			fw = new FileWriter(phoneFile);
		}
		PrintWriter pw = new PrintWriter(fw);
		pw.println(newRecord);
		pw.close();
	}

	private static void searchName() throws IOException {
		// TODO Auto-generated method stub
		boolean foundName = false;
		System.out.println("Searching a record");
		System.out.println("Enter the name to search:");
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.nextLine();

		Scanner phoneFile = new Scanner(new File("C:/Users/Roberto/Desktop/phone_book.txt"));
		if (name != null || name.isEmpty()) {
			while (phoneFile.hasNextLine() && !foundName) {
				if (phoneFile.next().contains(name)) {
					foundName = true;
				} else {
					foundName = false;
					break;
				}
			}
			if (foundName = true) {
				System.out.println("The name was found in the file");
			} else {
				System.out.println("The name was NOT found in the file");
			}
		} else {
			System.out.println("Please, enter a not null value");
		}
		phoneFile.close();
	}

	private static void modifyPhone() throws IOException {
		// TODO Auto-generated method stub
		boolean foundName = false;
		Scanner phoneFile = new Scanner(new File("C:/Users/Roberto/Desktop/phone_book.txt"));

		String[] line = new String[2];
		System.out.println("Modify a Phonw Number");
		System.out.println("Enter the name to modify:");
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.nextLine();

		if (name != null || name.isEmpty()) {
			// if (name != null || name.isEmpty()) {
			File phoneFileTemp = new File("C:/Users/Roberto/Desktop/phone_book_temp.txt");
			FileWriter fw;
			if (phoneFileTemp.exists()) {
				fw = new FileWriter(phoneFileTemp, true);
			} else {
				phoneFileTemp.createNewFile();
				fw = new FileWriter(phoneFileTemp);

			}
			PrintWriter pw = new PrintWriter(fw);
			while (phoneFile.hasNextLine() && phoneFile.hasNext()) {
				phoneFile.useDelimiter(";|\\n");
				line[0] = phoneFile.next();
				line[1] = phoneFile.next();
				if (line[0].contains(name) && !foundName) {
					foundName = true;
					System.out.println("Enter the new phone number: ");
					Scanner scan2 = new Scanner(System.in);
					String newPhone = scan2.nextLine();
					line[1] = newPhone;
					String newRecord = line[0] + ";" + line[1];

					pw.println(newRecord);
				} else {
					String newRecord = line[0] + ";" + line[1];
					pw.println(newRecord);
				}

			}

			if (foundName = false) {
				System.out.println("The name was NOT found in the file");
			}

			fw.close();

		}

		phoneFile.close();

		File fileOld = new File("C:/Users/Roberto/Desktop/phone_book.txt");
		fileOld.delete();
		File fileNew = new File("C:/Users/Roberto/Desktop/phone_book_temp.txt");

		if (fileNew.renameTo(fileOld)) {
			System.out.println("renamed");
		} else {
			System.out.println("error");
		}

	}

	private static void deleteRecord() throws IOException {
		// TODO Auto-generated method stub
		boolean foundName = false;
		Scanner phoneFile = new Scanner(new File("C:/Users/Roberto/Desktop/phone_book.txt"));
		String[] line = new String[2];

		System.out.println("Enter the name to delete: ");
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.nextLine();

		if (name != null || name.isEmpty()) {
			File phoneFileTemp = new File("C:/Users/Roberto/Desktop/phone_book_temp.txt");
			FileWriter fw;
			if (phoneFileTemp.exists()) {
				fw = new FileWriter(phoneFileTemp, true);
			} else {
				phoneFileTemp.createNewFile();
				fw = new FileWriter(phoneFileTemp);
			}
			PrintWriter pw = new PrintWriter(fw);

			while (phoneFile.hasNextLine() && phoneFile.hasNext()) {
				phoneFile.useDelimiter(";|\\n");
				line[0] = phoneFile.next();
				line[1] = phoneFile.next();
				if (line[0].contains(name) && !foundName) {
					foundName = true;
				} else {
					String newRecord = line[0] + ";" + line[1];
					pw.println(newRecord);
				}

			}
			fw.close();

			if (foundName = false) {
				System.out.println("The name was NOT found in the file");
			}
		}

		phoneFile.close();

		File fileOld = new File("C:/Users/Roberto/Desktop/phone_book.txt");
		fileOld.delete();
		File fileNew = new File("C:/Users/Roberto/Desktop/phone_book_temp.txt");

		if (fileNew.renameTo(fileOld)) {
			System.out.println("renamed");
		} else {
			System.out.println("error");
		}

	}

}
