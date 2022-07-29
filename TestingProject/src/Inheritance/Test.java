package Inheritance;

public class Test implements Interface {
	
	public void M1(){
		
		int a=20;
		int b=10;
		int c=a+b;
		
		System.out.println("Running M1 method");
	}
	public void M2() {
		System.out.println("Running M2 method");
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.M1();
		t.M2();
	//	t.a();
		System.out.println(t.a);
	}
	
	

}
