package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double price = keyboard.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double qtd = keyboard.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.convertCoin(price, qtd));
		keyboard.close();
	}

}
