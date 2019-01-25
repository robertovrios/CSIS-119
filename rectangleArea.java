import java.util.Scanner;

public class rectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, insert the width of the rectangle:");
		Scanner val = new Scanner(System.in);
		int widthRect= val.nextInt();
		System.out.println("Please, insert the lenght of the rectangle:");
		Scanner val1 = new Scanner(System.in);
		int lenghtRect= val1.nextInt();
		int areaRect=rectArea(widthRect,lenghtRect);
		System.out.println("The area of the rectangle is: "+areaRect);
	
	}

	private static int rectArea(int widthRect, int lenghtRect) {
		// TODO Auto-generated method stub
		return widthRect*lenghtRect;
	}
	

}
