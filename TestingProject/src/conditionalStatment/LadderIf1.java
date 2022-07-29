package conditionalStatment;

public class LadderIf1 {
	
	public static void main(String[] args) {
		
		String projectDomain = "Telecom";
		
		if(projectDomain =="Healthcare") {
			System.out.println("Medical related work");
		}
		else if (projectDomain == "Banking") {
			System.out.println("Money related transaction work");
		}
		else if (projectDomain == "Telecom") {
			System.out.println("communication related work");
		}
		else if (projectDomain == "Booking portal") {
			System.out.println("Work related to ticket booking");
		}
		else {
			System.out.println("Random project domain");
		}
	}

}
