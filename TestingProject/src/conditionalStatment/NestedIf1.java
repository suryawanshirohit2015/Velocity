package conditionalStatment;

public class NestedIf1 {
	
	public static void main(String[] args) {
		
		String UserName = "ABD";
		String Password = "XYZ";
		
		if (UserName == "ABD") {
			System.out.println("Correct user name");
			
		if (Password == "XYZ") {
			System.out.println("Password is correct");
			System.out.println("Login is succesful");
			
		}
		else {
			System.out.println("Wrong password");
			System.out.println("Login is failed");
		}
		}
		else {
			System.out.println("Wrong username");
			System.out.println("Login failed");
		}
		
	}

}
