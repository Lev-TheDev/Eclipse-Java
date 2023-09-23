package entities;

public class SavingsAccount extends Account {
	// public final class não deixa existir uma classe que herde dela
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override
	public void withdraw(double amount) {
		// public final void não deixa o método ser sobreposto
		balance -= amount;
	}
}

// final serve para segurança, evitar criação de subclasses e métodos
// adicionar final em métodos sobrepostos, pois múltiplas sobreposições
// podem ser portas de entrada para inconsistências
// classe final aumenta performance, é analisado mais rápido
