import java.util.Scanner;

public class backwardString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, write a word: ");
		Scanner scn= new Scanner(System.in);
		String str=scn.next();
		
		StringBuilder strBuilder = new StringBuilder(str);
		
		for(int i=0;i<strBuilder.length();i++) {
			System.out.print(strBuilder.charAt(strBuilder.length()-1-i));
		}
		
	}

}
