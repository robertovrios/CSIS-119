
public class PetClassTest extends petClass{


	public PetClassTest(String n, String t, int a) {
		
		super(n, t, a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  n="Bobby";
		String t="Golden Retriever";
		int a=8;
		petClass mypet = new petClass(n, t, a);
		System.out.println("My pet name is: "+mypet.getName());
		System.out.println("My pet type is: "+mypet.getType());
		System.out.println("My pet age is: "+mypet.getAge());
	}
}
