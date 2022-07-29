package starPattern;

public  class StarPattern8 {

	public static void main(String[] args) {
		
		int star=1;
		int i,j;
		for( i=1;i<=10;i++) {
			for( j=1;j<=star;j++) {
				
				System.out.print("*");
			}
		System.out.println();
		
		if(i>=5) {
			star--;
		}
		else {
			star++;
		}
	}
	
}}