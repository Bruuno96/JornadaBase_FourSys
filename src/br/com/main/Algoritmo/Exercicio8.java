package br.com.main.Algoritmo;

import java.util.Scanner;

public class Exercicio8 {
	 
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		System.out.println("===== FÁBRICA DE REFRIGERANTES =====");
		
		System.out.println("Lata de 350ml: ");
		int n1 = scanner.nextInt();
		total += (n1 * 0.350);
		
		System.out.println("Lata de 600ml: ");
		int n2 = scanner.nextInt();
		total += (n2 * 0.600);
		
		System.out.println("Garrafa 2L: ");
		int n3 = scanner.nextInt();
		total += (n3 * 2);
		
	    System.out.printf("Valor em litros: %.2f",total);
	}
}
