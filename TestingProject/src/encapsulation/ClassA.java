package encapsulation;

public class ClassA {
	
	private int a=56;
	static private int b=58;
	public static void set (int d) {
		
		b=d;
		
		System.out.println(b);
		
	}
	public int get() {
		return a;
		
	}

}
