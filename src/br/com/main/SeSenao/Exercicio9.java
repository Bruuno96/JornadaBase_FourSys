package br.com.main.SeSenao;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double total;
		System.out.println("===== PESO IDEAL =====");
		
		System.out.println("Digite sua altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("Digite seu peso: ");
		double peso = scanner.nextInt();
		
        double imc = peso / (Math.pow(altura, 2));
        		
		if(imc < 18.5) {
			System.out.println("Abaixo do peso");
		}else if (imc >= 18.5 && imc <= 24.9){
			System.out.println("Peso normal"); 
		}else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso"); 
		}else if(imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade Grau I"); 
		}else if(imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade Grau II"); 
		}else
			System.out.println("Obesidade Grau III ou Mórbida");
	}
}