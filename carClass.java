
public class carClass {
	private int yearModel;
	private String make;
	private double speed;

	public carClass(int yearModel, String make, double speed) {
		this.yearModel = yearModel;
		this.make = make;
		this.speed = 0;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double accelerate(double speed) {
		return speed + 5;

	}

	public double brake(double speed) {
		return speed - 5;
	}
}
