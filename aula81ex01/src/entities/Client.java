package entities;

import java.util.Locale;

public class Client {
	
	private String name;
	private int account;
	private double funds;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFunds() {
		return funds;
	}
	public void setFunds(double funds) {
		this.funds = funds;
	}
	public int getAccount() {
		return account;
	}
	
	public Client() {
	}
	
	public Client(String name, int account, double funds) {
		this.name = name;
		this.account = account;
		this.funds = funds;
	}
	
	public void addFunds(double amount) {
		Locale.setDefault(Locale.US);

		this.funds += amount;
	}
	
	public void removeFunds(double withdraw) {
		Locale.setDefault(Locale.US);

		this.funds -= (withdraw + 5.00);
	}
	@Override
	public String toString() {
		return "Account: "
				+ account
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", funds);
	}
	
}
