package br.com.main.Algoritmo;

import java.util.Scanner;

public class Exercicio2 {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double total;
		System.out.println("===== FERRADURAS DE CAVALOS =====");
		
		System.out.println("Quantos cavalos precisam de ferraduras: ");
		int cavalos = scanner.nextInt();
		
		total = calculaFerraduras(cavalos);
		
		System.out.println("Valor total de ferraduras seu(s) cavalo(s) precisa(m): "+total);
	}
	
	public static double calculaFerraduras(int a) {
		double unidadeFerradura = 9.90;
		double valor = a*unidadeFerradura;
		return valor;
	}
	
	

}
