package ClassMethod;

public class NonStatic11 {
int a=20;  //static variable
	
	public static void main(String[] args) {
		
		NonStatic11 x1 = new NonStatic11(); //object creation
		NonStatic11 x2 = new NonStatic11();
		NonStatic11 x3 = new NonStatic11();
		
		//calling variable with refrence variable
		System.out.println(x1.a);
		System.out.println(x2.a);
		System.out.println(x3.a);
		
		x3.a=30;//assign value to a variable with object refrence
	//	x2.a=49;
		
		System.out.println(x3.a);
		System.out.println(x1.a);  //gives output as same value.....
		System.out.println(x2.a);   //....stored in static memory
	
	

}}
