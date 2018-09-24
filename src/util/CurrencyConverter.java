package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double convertCoin(double price,double qtd) {
		return (price * qtd * IOF) + (price * qtd);
	}
}
