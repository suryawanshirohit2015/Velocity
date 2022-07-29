package starPattern;

public class StarPattern12 {
	
	public static void mai(String[] args){
		
		int star=5;
		int space=0;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			
			if(i<=4) {
			star++;
			space--;
		}
		else {
			star--;
			space++;
		}
			System.out.println();
		}		
	}
}
		
	
