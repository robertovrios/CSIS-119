import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class sumNumbers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Create the new file numbers.dat with random 10 integer values
		createFile();
		readFile();

	}

	private static void createFile() throws IOException {
		// TODO Auto-generated method stub
		PrintWriter fileNumbers = new PrintWriter("C:/Users/Roberto/eclipse-java/src/sales.dat");
		Random rand = new Random();
		int totalNumbers = rand.nextInt(100);		
		for (int i = 0; i < totalNumbers; i++) {
			Random rand1 = new Random();
			int numInsert = rand1.nextInt(100);
			fileNumbers.println(numInsert);
		}

		fileNumbers.close();
	}

	private static void readFile() throws IOException {
		// TODO Auto-generated method stub
		int total = 0;
		int numVal = 0;
		int count=0;
		Scanner fileNumbers = new Scanner(new File("C:/Users/Roberto/eclipse-java/src/numbers.dat"));
		while (fileNumbers.hasNextInt()) {
			numVal = fileNumbers.nextInt();
			total = total + numVal;
			count = count + 1;
			System.out.println(numVal);
		}

		System.out.println("The total of the file is " + total);
		double average=total/count;
		System.out.println("The average is " + average);
		fileNumbers.close();
	}

}
