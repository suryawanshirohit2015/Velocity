package starPattern;

public class StarPatern5 {
	
	public static void main(String[] args) {
		
		int space=4;
		int star =1;
		for(int i=1;i<=5;i++) {
			
			int j;
			
			for(j=1;j<=space;j++) {
				                            //4<=3 false
				System.out.print(" ");
				
				
			}
			for (j= 1;j<=star;j++) {       //2<=1 true
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}

}
