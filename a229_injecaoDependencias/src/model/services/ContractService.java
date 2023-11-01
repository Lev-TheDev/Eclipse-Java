package model.services;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.entities.Contract;
import model.entities.Installments;

public class ContractService {
	
	private Integer months;
	
	private PaymentServices paymentService;
	
	public ContractService(Integer months, PaymentServices paymentService) {
		this.months = months;
		this.paymentService = paymentService;
	}
	
	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

	public void processContract(Contract contract, Integer installmentsN) {
		List<Installments> list = new ArrayList<>();
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		for (int i = 1; i <= installmentsN; i++) {
			double amount = contract.getPrice() / installmentsN;
			double interest = paymentService.interest(amount, i);
			double iPlusFee = paymentService.totalFee(interest);

			Installments inst = new Installments(contract.getDate().plusMonths(i), iPlusFee);
			list.add(inst);
		}
		
		for (Installments i : list) {
			System.out.println(i.getiDate().format(fmt2) + " - " + String.format("%.2f", i.getiPrice()));
		}
	}
}
