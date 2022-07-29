package operator;

public class IncrementDecrement3 {
	
	public static void main(String[] args)

	{
		
		double w = 34.5675889, z = 12.5678;
	    double Report1 , Report2;
		
		System.out.println("value of w:"+ w);
		
		Report1 = ++w;
		System.out.println("After Inecrement:" + Report1);
		
		System.out.println("value of z:" + z);
		
		Report2 = --z;
		System.out.println("After Decrement" + Report2);
	}
}
