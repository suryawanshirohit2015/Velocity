package ClassMethod;

public class ReturnType {
	
	static int Demo() {       //user defined with int return type
		int x=15;
		int y=30;
		int z=x+y;
		return z;
	}
	
	static String Test() {  //user define with string return type
		return "Welcome Velocity";
		
	}
	public static void main(String[] args) {
		
		int z=Demo();     //calling user defined method
		String x =Test();   //calling user defined method
		
		System.out.println(z);
		System.out.println(x);
	}

}
	
	
	
	
	
	
		
		
		
		
		
	
