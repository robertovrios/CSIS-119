import java.util.Scanner;

public class romanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, Enter an integer between 1 and 10");
		Scanner val1=new Scanner(System.in);
		// the number of seats must be integer
		int var1=val1.nextInt();
		validRoman(var1);
	}

	public static void validRoman(int num) {
		String numOutput = null;
		boolean i=true;
		switch (num) 
		{
		case 1:
			numOutput="I";
			break;
		case 2:
			numOutput="II";
			break;
		case 3:
			numOutput="III";
			break;
		case 4:
			numOutput="IV";
			break;
		case 5:
			numOutput="V";
			break;
		case 6:
			numOutput="VI";
			break;
		case 7:
			numOutput="VII";
			break;
		case 8:
			numOutput="VIII";
			break;
		case 9:
			numOutput="IX";
			break;
		case 10:
			numOutput="X";
			break;
		default:
			System.out.println("Error message: This number is outside the range of 1 through 10");
			i=false;
			//break;
		}
		
		if (i==true) {
		System.out.println("The number in Roman is:"+ numOutput);
		}
		
	}
}
