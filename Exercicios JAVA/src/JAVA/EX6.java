package JAVA;

import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, result;
		
		System.out.printf("Informe a cota�ao do dolar: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o VALOR para converter para REAIS: ");
		b = ler.nextDouble();
		
		result = b / a;
		
		System.out.printf("O valor em REAIS �: R$%.2f", result);

		}
	
}
