package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double dollar;
	public static double quantity;
	
	public static double amountBought() {
		double bought = dollar * quantity;
		double tax = bought * IOF;

		return bought + tax; 
	}
	
}
