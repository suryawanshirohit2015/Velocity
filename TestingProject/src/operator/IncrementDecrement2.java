package operator;

public class IncrementDecrement2 {
	
	public static void main(String[] args) {
		
		float  a = 1234.34f, b = 3456.45f;
		float Case1, Case2;
		
		System.out.println("value of a:"+ a);
		
		Case1= ++a;
		
		System.out.println("After Increment:"+ Case1);
		
		System.out.println("value of b:" + b);
		
		Case2 = --b;
		
		System.out.println("After Decrement:"+ Case2);
	}

}
