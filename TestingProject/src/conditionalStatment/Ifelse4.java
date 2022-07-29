package conditionalStatment;

public class Ifelse4 {
	
	public static void main(String[] args)
	{
	
	int age = 50;
    double productPrice = 100.0;
   
    if(age >= 60)
    {
       productPrice = productPrice - 10;
    }
   
    if(age < 18)
    {
       productPrice = productPrice - 20;
    }
    else {
       productPrice = productPrice - 5;
    }
    System.out.print(productPrice);
}
}
