import java.util.Scanner;

public class firstandLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, How many people :");
		Scanner val1 = new Scanner(System.in);
		int numPeople = val1.nextInt();
		sortPeople(numPeople);

	}

	private static void sortPeople(int numPeople) {
		// TODO Auto-generated method stub

		String upPerson =askName();
		String downPerson="";
		int i=1;
		do {			
			String namePerson = askName();
			if(namePerson.compareTo(upPerson)<0) {
				upPerson=namePerson;
			}
			if(namePerson.compareTo(downPerson)>0) {
				downPerson=namePerson;
				
			}
		i++;		
		}while (i<numPeople);
		System.out.println(upPerson);
		System.out.println(downPerson);
	}

	private static String askName() {
		// TODO Auto-generated method stub
		System.out.println("Please, Write a name:");
		Scanner val = new Scanner(System.in);
		String namePerson = val.next();
		return namePerson;
	}
}
