package br.com.main.Algoritmo;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int total;
		System.out.println("===== CALCULAR A SOMA DE 2 NÚMEROS =====");
		
		System.out.println("Digite o primeiro número: ");
		int n1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int n2 = scanner.nextInt();
		
		total = calculaRetangulo(n1, n2);
		
		System.out.println("A área calculada do retângulo é: "+total);
	}

	public static int calculaRetangulo(int b,int h) {
		return b+h;
	}
		
}
