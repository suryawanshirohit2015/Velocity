package conditionalStatment;

public class SwitchStatment {
	
	public static void main(String[] args) {
		
		int num = 5;
		
		switch (num) {
		
		case 1:
			System.out.println("Today is Monday");
			break;
			
		case 2:
			System.out.println("Today is Tuesday");
			break;
			
		case 3:
			System.out.println("Today is wednesday");
			break;
			
		case 4:
			System.out.println("Today is Thursday");
			break;
			
		case 5:
			System.out.println("Today is Friday");
			break;
			
		case 6:
			System.out.println("Today is Saturday");
			break;
			
			default :
				
				System.out.println("Enter correct input from 1 to 6");
			
			
		}
	}

}
