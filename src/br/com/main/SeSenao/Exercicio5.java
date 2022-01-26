package br.com.main.SeSenao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double total;
		System.out.println("===== DESCONTO NO PAGAMENTO A VISTA =====");
		
		System.out.println("Calcular valor do pagamento: ");
		double a = scanner.nextInt();
		
		System.out.println("\n=====Forma de pagamento =====");
		System.out.println("1 - À VISTA");
		System.out.println("2 - PARCELADO");
		int opcao = scanner.nextInt();
//		
//		if(opcao == 1) total = a * 0.90;
//			else
//			total = a * 0.95;
//		
//		total = a * 0.90;
		
		System.out.printf("Total do pagamento : %.2f",(opcao == 1) ?  a*0.90 : a*0.95);
		
//		System.out.printf("Total do pagamento: %.2f",total);
	}

}
