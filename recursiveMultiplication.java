import java.io.InputStream;
import java.util.Scanner;

public class recursiveMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please, insert a x value:");
		Scanner scn = new Scanner(System.in);
		int valX=scn.nextInt();
		
		System.out.println("Please, insert a y value:");
		Scanner scn1 = new Scanner(System.in);
		int valY=scn1.nextInt();
		
		recursiveMulti(valX,valY,0);
		}

	private static void recursiveMulti(int valX, int valY, int total) {
		// TODO Auto-generated method stub
		if (valX>0) {
			total= total+valY;
			recursiveMulti(valX-1,valY, total);
		}else {
			System.out.println(total);
		}
	}
}
