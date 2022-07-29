package Inheritance;

public class This {
	
	int a= 80;     //global variable
	
	public void add() {
		int a =50;     // local variable
		
		System.out.println(a); //   lobal 
		System.out.println(this.a);  //glocal
	}
	public static void main(String[] args) {
		
		This x = new This();
		x.add();
	}

}
