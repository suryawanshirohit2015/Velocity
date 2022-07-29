package Generalization;

public class TestGeneraization {
	
  public static void main(String[] args) {
	
	  System.out.println("******Feature of Idea******");
	  
	  Idea I = new Idea();
	  
	  I.audiocalling();
	  I.Internet();
	  I.SMS();
	  I.NewFeatureB();
	  
	  System.out.println("*****Feature of JIO******");
			
	  JIO J = new JIO();
	  
	  J.audiocalling();
	  J.Internet();
	  J.SMS();
	  J.NewFeatureA();
  }
}