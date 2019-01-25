import java.util.Scanner;

public class tictactoeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=3;
		int columns=3;
		int[][] arrayTablero={{1,2,3},{4,5,6},{7,8,9}};
		

		System.out.print(arrayTablero);
		System.out.println("Where do you want to put your mark position");
		Scanner val1=new Scanner(System.in);
		int position=val1.nextInt();

		
		// valid input for position
		while (position>9||position<0) {
			System.out.print(arrayTablero);
			System.out.println("Choose a valid position");
			System.out.println("Where do you want to put your mark position");
			Scanner val2=new Scanner(System.in);
			position=val2.nextInt();	
		}
		
		
		// search the position and check it is available
		int value=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if (arrayTablero[rows][columns]!=0 ||arrayTablero[rows][columns]!=10) {
					arrayTablero[rows][columns]=value;
					checkWinner(arrayTablero,rows,columns);
			}else {}
			}
		}
			
	   }
			
	


	private static boolean checkWinner(int[][] arrayTablero,int rows, int columns) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				total=total+arrayTablero[rows][columns];
				}
			
			if (total==0 || total==30) {
				System.out.println("YOU WIN");
				break;
			}
		}
		return false;
	}



}
