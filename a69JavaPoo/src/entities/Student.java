package entities;

public class Student {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;

	
	public double fgrade() {
		return n1 + n2 + n3;
	}
	
	public String finalSituation() {
		if (fgrade() >= 60.00){
			return "PASS";			
		}
		else {
			return "FAILED";
		}
	}

	public double missingPoints() {
		return 60.00 - fgrade();
	}
	
}
