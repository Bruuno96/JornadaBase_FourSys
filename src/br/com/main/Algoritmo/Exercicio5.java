package br.com.main.Algoritmo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double total;
		System.out.println("===== LOJA DE 1,99 ====");
		
		System.out.println("Quantos itens foram vendidos : ");
		double n1 = scanner.nextInt();
		
		total = calculaRetangulo(n1);
		
		System.out.printf("Valor total com 5 porcento de desconto: %.2f",total);
		// new DecimalFormat("0.##").format(total) >  forma alternativa
	}
	
	public static double calculaRetangulo(double n1) {
		double total = (n1 * 1.99) * 0.95;
		return total;
	}

}
