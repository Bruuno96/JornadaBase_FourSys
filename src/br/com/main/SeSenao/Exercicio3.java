package br.com.main.SeSenao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

			
		Scanner scanner = new Scanner(System.in);
		double total;
		System.out.println("===== MAIOR NÚMERO =====");
		
		System.out.println("Digite o primeiro n°: ");
		int a = scanner.nextInt();
		
		System.out.println("Digite o segundo n°: ");
		int b = scanner.nextInt();
		
		if( a > b) {
			System.out.println("Primeiro número é maior");
		}else if (b > a){
			System.out.println("Segundo n° é maior");
		}else
			System.out.println("São iguais");
	}

}
