package entities;

public class Individual extends Taxpayers {

	protected Double healthExpenses;
	
	public Individual() {
	}
	
	public Individual(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}
	
	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double totalTaxes() {
		if (annualIncome < 20000.00) {
			if (healthExpenses > 0.00) {
				return (annualIncome * 0.15) - (healthExpenses * 0.50);
			}
			else {
				return annualIncome * 0.15;
			}
		}
		else {
			if (healthExpenses > 0.00) {
				return (annualIncome * 0.25) - (healthExpenses * 0.50);
			}
			else {
				return annualIncome * 0.25;
			}
		}
	}

}
