import java.util.Scanner;

public class morseCodeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, write a word: ");
		Scanner scn= new Scanner(System.in);
		String str=scn.next();
		
		StringBuilder strBuilder = new StringBuilder(str);
		
		for(int i=0;i<strBuilder.length();i++) {
			
			String letterMorse=convertToMorse(strBuilder.charAt(i));
			System.out.print(letterMorse+" ");
		}
				
	}

	private static String convertToMorse(char input) {
		String letter=null;
		switch (Character.toUpperCase(input)) {
		case ('A'):
			letter=".-";
			break;
		case ('B'):
			letter="-...";
			break;
		case ('C'):
			letter="-.-.";
			break;
		case ('D'):
			letter="-..";
			break;
		case ('E'):
			letter=".";
			break;
		case ('F'):
			letter="..-.";
			break;
		case ('G'):
			letter="--.";
			break;
		case ('H'):
			letter="....";
			break;
		case ('I'):
			letter="..";
			break;
		case ('J'):
			letter=".---";
			break;
		case ('K'):
			letter="-.-";
			break;
		case ('L'):
			letter=".-..";
			break;
		case ('M'):
			letter="--";
			break;
		case ('N'):
			letter="-.";
			break;
		case ('O'):
			letter="---";
			break;
		case ('P'):
			letter=".---.";
			break;
		case ('Q'):
			letter="--.-";
			break;
		case ('R'):
			letter=".-.";
			break;
		case ('S'):
			letter="...";
			break;
		case ('T'):
			letter="-";
			break;
		case ('U'):
			letter="..-";
			break;
		case ('V'):
			letter="...-";
			break;
		case ('W'):
			letter=".--";
			break;
		case ('X'):
			letter="-..-";
			break;
		case ('Y'):
			letter="-.--";
			break;
		case ('Z'):
			letter="--..";
			break;
		case (' '):
			letter=" ";
			break;
		case (','):
			letter="--..--";
			break;
		case ('.'):
			letter=".-.-.-";
			break;
		case ('?'):
			letter="..--..";
			break;
		case ('0'):
			letter="-----";
			break;
		case ('1'):
			letter=".----";
			break;
		case ('2'):
			letter="..---";
			break;
		case ('3'):
			letter="...--";
			break;
		case ('4'):
			letter="....-";
			break;
		case ('5'):
			letter=".....";
			break;
		case ('6'):
			letter="-....";
			break;
		case ('7'):
			letter="--...";
			break;
		case ('8'):
			letter="---..";
			break;
		case ('9'):
			letter="----.";
			break;
		}
		
		return letter;
		
		
	}
	
	

}
