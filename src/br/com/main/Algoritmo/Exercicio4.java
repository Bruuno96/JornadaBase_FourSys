package br.com.main.Algoritmo;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double total;
		System.out.println("===== CALCULO MÉDIO =====");
		
		System.out.println("Digite a medida da base (b): ");
		int n1 = scanner.nextInt();
		
		System.out.println("Digite a medida da altura (h): ");
		int n2 = scanner.nextInt();
		
		System.out.println("Digite a medida da altura (h): ");
		int n3 = scanner.nextInt();
		
		total = calculaRetangulo(n1,n2,n3);
		
		System.out.println("A área calculada do retângulo é: "+total);
	}
	
	public static double calculaRetangulo(int n1,int n2,int n3) {
		double total = (n1 + n2 + n3) / 3;
		return total;
	}

	
	

}
