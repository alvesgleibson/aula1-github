package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CorrencyConverter;

public class ConvertDolar {

	public static void main(String[] args) {
		
		CorrencyConverter c = new CorrencyConverter();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's the dollar price: ");
		double priceDollar = sc.nextDouble();
		System.out.print("How many dollars will be bought: ");
		double quantityDollars = sc.nextDouble();
		
		double receivValueTotal = c.convertDollars(priceDollar, quantityDollars);
		System.out.printf("Amount to be paid in reais %.2f",receivValueTotal);
		
		
		
		sc.close();
	}
	
	
}
