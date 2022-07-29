package String;

public class TestJava {
	
	public static void main(String[] args) {
		
		String a = "Velocity";
		String b = "Velocity";
		
		
		String c = new String("Velocity");
		String d = new String("Velocity");
		
		System.out.println(a==b);   //true
		System.out.println(c==d);   //false
		System.out.println(a==d);   //false
		
		System.out.println("------------------");
		
		b="class";
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);
		System.out.println("-----------------");
		
		b="Velocity";
		
		System.out.println(b);
		System.out.println(a);
		System.out.println(a==b);
		
		
		
				
				
		
	}

}
