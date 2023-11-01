package model.entities;

import java.time.LocalDate;

public class Installments {
	
	private LocalDate iDate;
	private Double iPrice;
	
	public Installments(LocalDate iDate, Double iPrice) {
		this.iDate = iDate;
		this.iPrice = iPrice;
	}

	public LocalDate getiDate() {
		return iDate;
	}

	public void setiDate(LocalDate iDate) {
		this.iDate = iDate;
	}

	public Double getiPrice() {
		return iPrice;
	}

	public void setiPrice(Double iPrice) {
		this.iPrice = iPrice;
	}

}
