package ClassMethod;

public class staticargument {

	public static void addition(int a, int b) {   //static with argument
	int c=a+b;
	
		System.out.println("Addition="+c);
	}
	public void multiplication(int a,int b) {    //non static argument
		int c=a*b;
		System.out.println("Multiplication="+c);
		}
		
	public static void main(String[] args) {
		
		addition(100,200);
		
		staticargument	x= new staticargument ();//object for non static
		x.multiplication(100,300);
		
	}
}
