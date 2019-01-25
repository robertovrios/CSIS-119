
public class carTest extends carClass {

	public carTest(int yearModel, String make, double speed) {
		super(yearModel, make, speed);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 2018;
		String m = "Ford";
		double s = 80;
		carClass carro = new carClass(y, m, s);
		double newSpeed = carro.accelerate(s);
		System.out.println("The speed of the car is: " + newSpeed);

		for (int i = 0; i < 5; i++) {
			newSpeed = carro.brake(newSpeed);
			System.out.println("The speed of the car is: " + newSpeed);
		}

	}

}
