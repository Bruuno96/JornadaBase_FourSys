package br.com.main.SeSenao;

public class Exercicio1 {
	
	public static boolean compara(double i) {
		Double resultado = Math.sqrt(i); // Armazena a raiz quadrada de i na variável resultado
		System.out.println(resultado.doubleValue());
		
		// Compara se resultado INTEIRO é IGUAL ao resultado com uma casas decimais
		// Se for TRUE é porque são dois números iguais, portanto é um quadrado perfeito
		// SENÃO é porque a raiz quadrada é um numero quebrado/decimal (1.3675343) portanto nao é perfeito
		return (resultado.intValue() == resultado.doubleValue());
	}

	public static void main(String args[]) {

		double i = 9;
		if (compara(i)) {
			System.out.println("Quadrado Perfeito");
		} else {
			System.out.println("Não é quadrado perfeito");
		}
	}

}
