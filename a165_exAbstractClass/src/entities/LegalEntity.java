package entities;

public class LegalEntity extends Taxpayers {
	
	protected Integer employeesNumber;
	
	public LegalEntity() {
	}
	
	public LegalEntity(String name, Double annualIncome, Integer employeesNumber) {
		super(name, annualIncome);
		this.employeesNumber = employeesNumber;
	}
	
	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}

	@Override
	public Double totalTaxes() {
		if (employeesNumber > 10) {
			return annualIncome * 0.14;
		}
		else {
			return annualIncome * 0.16;
		}
	}

}
