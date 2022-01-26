package br.com.main.Algoritmo;

import java.util.Scanner;

public class Exercicio7 {
	 
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		System.out.println("===== PEDRINHO =====");
		
		System.out.println("Moeda 1 real: ");
		double n1 = scanner.nextDouble();
		total += (n1 * 1);
		
		System.out.println("Moedas de 0,50 centavos: ");
		double n2 = scanner.nextDouble();
		total += (n2 * 0.5);
		
		System.out.println("Moedas de 0,25 centavos: ");
		double n3 = scanner.nextDouble();
		total += (n3 * 0.25);
		
		System.out.println("Moedas de 0,10 centavos: ");
		double n4 = scanner.nextDouble();
		total += (n4 * 0.10);
		
		System.out.println("Moedas de 0,05 centavos: ");
		double n5 = scanner.nextDouble();
		total += (n5 * 0.05);
		
		System.out.println("Moedas de 0,01 centavos: ");
		double n6 = scanner.nextDouble();
		total += (n6 * 0.01);	
		
		// Moeda 1 = 5 = 5$
		// Moeda 0,50 = 5 = 2,50$
		// Moeda 0,25 = 5 = 1,25$
		// Moeda 0,10 = 5 = 0,50$
		// Moeda 0,05 = 5 = 0,25$
		// Moeda 0,01 = 5 = 0,05$
		
	    System.out.printf("Valor: %.2f",total);
	}
}
