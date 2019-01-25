
public class petClass {
	private String name;
	private String type;
	private int age;
	
	public petClass(String n, String t, int a) {
		name=n;
		type=t;
		age=a;
	}
	
	public void setName(String n) {
		name=n;
	}

	public void setType(String t) {
		type=t;
	}
	public void setAge(int a) {
		age=a;
	}
	
	public String getName(){
		return name;
	}
	public String getType() {
		return type;
	}
	public int getAge() {
		return age;
	}

}

