import java.util.Scanner;

public class geometryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int OptionSelected = 0;
		double area = 0;
		String option =null; 
		

		do {
			OptionSelected = displayMenu();
			switch (OptionSelected) {
			case 1:
				area = calcAreaCircle();
				option = "Circle";
				break;
			case 2:
				area = calcAreaRectangle();
				option = "Rectangle";
				break;
			case 3:
				area = calcAreaTriangle();
				option = "Triangle";
				break;
			}
			System.out.println("The area of the "+option+" is "+area);
		} while (OptionSelected != 4);

		
	}

	private static double calcAreaRectangle() {
		// TODO Auto-generated method stub
		double area;
		System.out.println("Enter the length of the rectangle");
		Scanner scan1 = new Scanner(System.in);
		double length = scan1.nextDouble();
		System.out.println("Enter the width of the rectangle");
		Scanner scan2 = new Scanner(System.in);
		double width = scan2.nextDouble();
		area = length * width;
		return area;
	}

	private static double calcAreaTriangle() {
		// TODO Auto-generated method stub
		double area;
		System.out.println("Enter the length of the triangle's base");
		Scanner scan1 = new Scanner(System.in);
		double base = scan1.nextDouble();
		System.out.println("Enter the height of the triangle");
		Scanner scan2 = new Scanner(System.in);
		double height = scan2.nextDouble();
		area = base * height * 0.5;
		return area;
	}

	private static double calcAreaCircle() {
		// TODO Auto-generated method stub
		double pi = 3.14159;
		System.out.println("Enter the radius");
		Scanner scan2 = new Scanner(System.in);
		int radius = scan2.nextInt();
		double area = pi * radius * radius;
		return area;
	}

	private static int displayMenu() {
		// TODO Auto-generated method stub

		System.out.println("Main Menu");
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		System.out.println("4. Quit");
		System.out.println("Enter your choice (1-4)");
		Scanner scan1 = new Scanner(System.in);
		int option = scan1.nextInt();

		while (option < 1 || option > 4) {
			System.out.println("This is an invalid option");
			System.out.println("Enter 1,2,3,or 4");
		}
		return option;
	}

}
