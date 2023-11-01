package model.services;

public interface PaymentServices {
	
	double totalFee(Double amount);
	
	double interest(Double amount, Integer inst);

}
