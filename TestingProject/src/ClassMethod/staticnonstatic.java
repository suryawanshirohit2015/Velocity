package ClassMethod;

public class staticnonstatic {
	
	static int a=10; //static variable
	int b=30; //non static
	
	staticnonstatic(){  //user defined constructor with zero argument
		a=23;
		b=57;
	}
	staticnonstatic(int z){ //user defined constructor with argument
		a=45;
		b=67;
	}
	staticnonstatic(char c){
		c=56;
	}
	public static void main(String[] args) {
		System.out.println(a);
		
		staticnonstatic x = new staticnonstatic();//calling constructor
		System.out.println(a);
		System.out.println(x.b);
		
		staticnonstatic z = new staticnonstatic(83);//calling constructor
		System.out.println(z.a);
		System.out.println(z.b);
		
		staticnonstatic y = new staticnonstatic('&');
				System.out.println(y.a);
				System.out.println(y.b);
				
		 
	
		
		
	}
	

}
