package practise;

public class star {
	public static void main(String[] args) {       //*
		                                           //**
		                                           //***
		                                           //****
	                                           	   //*****
		int star=1;
		int space=4;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" " );
	}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
				
			}
				
			
		
		if (i<=4) {
			space--;
			star=star+2;
		}
		else {
			space++;
			star=star-2;
			
				}
		}
		
	}
}

