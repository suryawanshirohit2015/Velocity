package polymorphism;

public class Poly {
	
	public void addition(int a , int b) {
		System.out.println("addition = "+ (a+b));
	}
	
	public void addition(int a,int b,int c) {
		System.out.println("addition="+(a+b+c));
	}
	
	public static void main(String[] args) {
		Poly p = new Poly();
		p.addition(230,340);
		p.addition(300,400,500);
	}

}
