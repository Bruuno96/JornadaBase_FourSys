package br.com.main.SeSenao;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		double total;
		System.out.println("===== MAIOR NÚMERO =====");
		
		System.out.println("Digite valor de A: ");
		int a = scanner.nextInt();
		
		System.out.println("Digite valor de B: ");
		int b = scanner.nextInt();
		
		System.out.println("Digite valor de C: ");
		int c = scanner.nextInt();
		
		total = a + b;
		
		if(total > c) {
			System.out.println("A+B é maior que C");
		}else if (total < c){
			System.out.println("C é maior que A+B");
		}else
			System.out.println("São iguais");
	}

}
