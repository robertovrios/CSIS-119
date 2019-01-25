
public class Essay {
	private double grammarPoints;
	private double spellingPoints;
	private double lenghtPoints;
	private double contentPoints;

	public double getGrammarPoints() {
		return grammarPoints;
	}

	public boolean setGrammarPoints(double g) {
		boolean b=true;
		if (g > 30) {

			grammarPoints = g;
		} else {
			System.out.println("Please the grammar points must be up to 30");
			b=false;
		}
		return b;
	}

	public double getSpellingPoints() {
		return spellingPoints;
	}

	public boolean setSpellingPoints(double s) {
		boolean b=true;
		if (s > 20) {
			spellingPoints = s;
		} else {
			System.out.println("Please the spelling points must be up to 20");
			b=false;

		}
		return b;
	}

	public double getLenghtPoints() {
		return lenghtPoints;
	}

	public boolean setLenghtPoints(double l) {
		boolean b=true;
		if (l > 20) {
			lenghtPoints = l;
		} else {
			System.out.println("Please the length points must be up to 20");
			b=false;
		}
		return b;
	}

	public double getContentPoints() {
		return contentPoints;
	}

	public boolean setContentPoints(double c) {
		boolean b=true;
		if (c > 30) {
			contentPoints = c;
		} else {
			System.out.println("Please the content points must be up to 30");
			b=false;
		}
		return b;
	}

}
