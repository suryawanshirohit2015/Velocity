package ExceptionHandlingJava;

public class EXCEPTION1 {
	
	public static void main(String[] args) {
		int a=20;
		int b=0;
		int c=0;
		int []d= {54,87,65,45};
		
		System.out.println("Start");
		
		try {
			c=a/b;
			System.out.println(d[8]);//risky code
		}
		catch(ArithmeticException e){
			//alternative code
			System.out.println("alternative code");
			b=2;
			c=a/b;
			}
	 catch(ArrayIndexOutOfBoundsException e){
		 System.out.println("Index out of bound");
	 }
		System.out.println(c);
		System.out.println(d[2]);
	}

}
