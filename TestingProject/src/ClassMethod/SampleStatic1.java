package ClassMethod;

public class SampleStatic1 {    // static method call from same class
	
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		M1();
		M2();
		System.out.println("Main method ended");
	}
		
		public static void M1() {   //static user define
			System.out.println("Static method from M1" );
		
	}
		public static void M2() {
			System.out.println("Static method from M2");
		}

}
