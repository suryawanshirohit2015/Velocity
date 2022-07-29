package ExceptionHandlingJava;

public class Exception2 {
	
	public static void main(String[] args) {
		int a=20;
		int b=0;
		int c=0;
		int []d= {54,87,65,45};
		
		System.out.println("Start");
		
		try {
			c=a/b;
			//System.out.println(d[8]);//risky code
		}
		catch(ArithmeticException e){
			//alternative code
			
			b=4;
			c=a/b;
			System.out.println("alternative code");
			System.out.println("catch block executed ");
			}
	 finally {
		 System.out.println("execution of finally block");
	 }
		System.out.println(c);
		//System.out.println(d[2]);
		System.out.println("end");    //normal flow
	}
	
	}
//exceptoin is not generated -->try -finally - normal flow
//excepton generated but not handled -->try-finally
//exception generated but handled -->try - catch - finally - normal flow



