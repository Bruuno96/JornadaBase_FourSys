package br.com.main.SeSenao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double total;
		
		
		System.out.println("===== PESO IDEAL =====");
		
		System.out.println("Digite seu NOME: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu RG");
		String rg = scanner.nextLine();
		
		System.out.println("Digite seu CPF");
		String cpf = scanner.nextLine();
		
		System.out.println("Digite seu EMAIL");
		String email = scanner.nextLine();
		
		if(nome == "" || rg == "" || cpf == "" || email== "") {
			System.out.println("PREENCHA CORRETAMENTE OS CAMPOS");
		}else
			System.out.println("ENVIADO COM SUCESSO !");
		
	
	}

}
