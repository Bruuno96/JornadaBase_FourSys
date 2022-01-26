package br.com.main.SeSenao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double total;
		System.out.println("===== PESO IDEAL =====");
		
		System.out.println("Digite sua altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("Digite seu peso");
		int peso = scanner.nextInt();
		
        double imc = peso / (Math.pow(altura, 2));
		
		if(imc >= 18.5 && imc <= 25) {
			System.out.println("PESO IDEAL");
		}else {
			System.out.println("FORA DO PESO");
		}
		
		System.out.println(imc);
	}

}
