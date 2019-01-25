import java.util.Scanner;

public class GradedActivity extends Essay {

	public static void main(String[] args) {
		Essay essay = new Essay();

		System.out.println("Enter your score in grammar: ");
		double grammar = (new Scanner(System.in)).nextDouble();

		while(!essay.setGrammarPoints(grammar)) {

			System.out.println("Enter your score in grammar: ");
			grammar = (new Scanner(System.in)).nextDouble();

		}


		System.out.println("Enter your score in spelling: ");
		double spelling = (new Scanner(System.in)).nextDouble();

		while(!essay.setSpellingPoints(spelling)){ 

			System.out.println("Enter your score in spelling: ");
			spelling = (new Scanner(System.in)).nextDouble();
		}


		System.out.println("Enter your score in length: ");
		double length = (new Scanner(System.in)).nextDouble();

		while(!essay.setLenghtPoints(length)) {
			System.out.println("Enter your score in length: ");
			length = (new Scanner(System.in)).nextDouble();
		}


		System.out.println("Enter your score in content: ");
		double content = (new Scanner(System.in)).nextDouble();

		while(!essay.setContentPoints(content)) {
			System.out.println("Enter your score in content: ");
			content = (new Scanner(System.in)).nextDouble();

		}

		double scoreTotal = essay.getGrammarPoints() + essay.getSpellingPoints() + essay.getLenghtPoints()
		+ essay.getContentPoints();
		System.out.println("The total score is: " + scoreTotal);
		System.out.println("The total grade is: " + scoreTotal/4);
	}
}
