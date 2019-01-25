public class fallingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			int t=i;
			double distancia= fallDistance(t);
			System.out.println("The distance for the second "+t+" is: "+distancia);
		}
	}

	private static double fallDistance(int t) {
		// TODO Auto-generated method stub
		double g=9.8;
		return 0.5*g*t;
	}

}
