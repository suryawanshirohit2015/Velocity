package ClassMethod;

public class overload {
	
	public static void main(int a) { //user define/regular
		System.out.println(a);
	}
	
	public static void main(String[] args) {   //system define
		System.out.println("Main method started");
		main(65);
		main('$');
	}
	
	//public static void main(char x) {   //user define
	//	System.out.println(x);
	//}

}
