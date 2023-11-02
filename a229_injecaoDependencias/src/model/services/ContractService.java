package model.services;

import model.entities.Contract;
import model.entities.Installments;

public class ContractService {
	
	private PaymentServices paymentService;
	
	public ContractService(PaymentServices paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processContract(Contract contract, Integer installmentsN) {
		double amount = contract.getPrice() / installmentsN;
		
		for (int i = 1; i <= installmentsN; i++) {
			double interestPlusAmount = paymentService.interest(amount, i);
			double interestPlusFee = paymentService.totalFee(interestPlusAmount);

			Installments inst = new Installments(contract.getDate().plusMonths(i), interestPlusFee);
			contract.getInstList().add(inst);
		}
	}
}
