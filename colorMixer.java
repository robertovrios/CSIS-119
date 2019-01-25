import java.util.Scanner;

public class colorMixer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. red");
	    System.out.println("2. blue");
	    System.out.println("3. yellow");
		System.out.println("Please, Choose a color from the options above:");
		Scanner val1=new Scanner(System.in);
		String color1=val1.nextLine();
		
		System.out.println("Please, Choose another color from the options above:");
		Scanner val2=new Scanner(System.in);
		String color2=val2.nextLine();
		mixColor(color1, color2);
		
	}
	private static void mixColor(String color1, String color2) {
		// TODO Auto-generated method stub
		String resultColor = null;
		if (color1.equals(color2)) {
			resultColor=color1;
		}else{
			if ((color1.equals("red") && color2.equals("blue")) || (color1.equals("blue") && color2.equals("red"))) {
				resultColor="purple";			
			}else if((color1.equals("red") && color2.equals("yellow")) || (color1.equals("yellow") && color2.equals("red"))){
				resultColor="orange";
			}else if((color1.equals("yellow") && color2.equals("blue")) || (color1.equals("blue") && color2.equals("yellow"))){
				resultColor="green";
			}else {
				resultColor=null;
			}
		}
						
		if (resultColor != null) {
		System.out.println("When you mix " + color1 +" and " + color2 + " , you get "+ resultColor);
		}else {
			System.out.println("Please, only use 2 colors from the options");
		}
	}

}
