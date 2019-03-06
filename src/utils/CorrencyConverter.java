package utils;

public class CorrencyConverter {
	
	
	
public static double convertDollars(double priceDollar, double quantityDollars) {
		
		
		return (priceDollar += priceDollar *0.06) * quantityDollars;
		
	}


}
