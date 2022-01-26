package br.com.main.SeSenao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double total;
		System.out.println("===== PESO IDEAL =====");
		
		System.out.println("Digite sua altura: ");
		double a = scanner.nextDouble();
		
		System.out.println("SEXO : 1 - Masculino | 2 - Feminino");
		int opcao = scanner.nextInt();
		
		if(opcao == 1) {
			total = (72.7 * a) - 58;
		}else {
			total = (62.1 * a) - 44.7; 
		}
		
		System.out.println(total);
	}

}
