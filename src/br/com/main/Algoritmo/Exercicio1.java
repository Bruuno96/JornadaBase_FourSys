package br.com.main.Algoritmo;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double total;
		System.out.println("===== ÁREA DE UM RETÂNGULO");
		
		System.out.println("Digite a medida da base (b): ");
		double b = scanner.nextDouble();
		
		System.out.println("Digite a medida da altura (h): ");
		double h = scanner.nextDouble();
		
		total = calculaRetangulo(b, h);
		
		System.out.println("A área calculada do retângulo é: "+total);
	}
	
	public static double calculaRetangulo(double b,double h) {
		return b*h;
	}

	
	

}
