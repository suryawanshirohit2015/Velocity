package conditionalStatment;

public class Ifelse3 {
	
	public static void main(String[] args) {
	
	double balance = 120;
    int score = 8;
    if(score >= 8) 
    {
      
    	balance = balance + 50; // + $50 from his father
    }
   
    if(score > 6) {
       balance = balance + 20; // + $20 from his uncle 
    }
    else {
       balance = balance - 10;
    }
    System.out.print(balance);
 }
}


