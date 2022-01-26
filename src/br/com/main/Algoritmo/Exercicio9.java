package br.com.main.Algoritmo;

import java.util.Scanner;

public class Exercicio9 {
	 
	
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("===== TABUADA =====");
		
		System.out.println("Digite um número: ");
		int n1 = scanner.nextInt();
		
		for(int i = 0; i < 11; i++) {
			System.out.println(n1+" X "+i+" = "+n1*i);
		}
	}
}
