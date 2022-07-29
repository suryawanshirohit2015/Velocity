
package ClassMethod;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner Demo = new Scanner(System.in); //scanner class object
				
				System.out.println("Entert the integer");
		int value = Demo.nextInt();
		System.out.println("You entered value is"+ value);
		
		System.out.println("Enter the float");
		
		float sd= Demo.nextFloat();
		System.out.println("You entered value is"+ sd);
		System.out.println("Enter the String:");
		
		String sf = Demo.next();
		
		System.out.println("You entered String is "+ sf);
		
		Demo.close();
		
	}
}