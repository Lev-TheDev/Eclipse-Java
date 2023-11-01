package model.services;

public class Paypal implements PaymentServices {

	@Override
	public double totalFee(Double amount) {
		return amount + (amount * 0.02);
	}

	@Override
	public double interest(Double amount, Integer inst) {
		// juros
		return amount + (0.01 * amount * inst);
	}

}
