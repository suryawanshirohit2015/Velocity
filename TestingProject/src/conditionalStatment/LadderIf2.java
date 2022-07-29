package conditionalStatment;

public class LadderIf2 {
	
	public static void main(String[] args) {
		
		int population = 1000;
				
		
		if(population == 9500000);{
			System.out.println("It is a District");
		}
		 if (population == 5000000)  {
			System.out.println("It is a Taluka");
		}
		else if (population == 1000000) {
			System.out.println("It is City");
		}
		else if (population == 100000) {
			
		}
		else if (population == 10000) {
			System.out.println("It is a village");
			
		}
		else {
			System.out.println("Does not exist other");
		}
			
			
	}
	
}


