package br.com.main.Algoritmo;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		/*
	 	Magreza,  = quando o resultado é menor que 18,5 kg/m2;
		Normal    = quando o resultado está entre 18,5 e 24,9 kg/m2;
		Sobrepeso = quando o resultado está entre 24,9 e 30 kg/m2;
		Obesidade = quando o resultado é maior que 30 kg/m2.
		*/
		
		Scanner scanner = new Scanner(System.in);
		double total;
		System.out.println("===== IMC =====");
		
		System.out.println("Digite o seu PESO (W): ");
		double n1 = scanner.nextDouble();
		
		System.out.println("Digite a sua ALTURA (H): ");
		double n2 = scanner.nextDouble();
			
        double imc = n1 / (n2 * n2);
        System.out.printf("Seu IMC é: %.2f",imc);
        
        
        

       
	}
	
	

	
	

}
