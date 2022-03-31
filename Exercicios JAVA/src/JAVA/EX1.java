package JAVA;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, result;
		
		System.out.printf("Seja-Bem vindo ao Descobre Área" + "\nInforme o valor da BASE: ");
		a = ler.nextInt();
		
		System.out.printf("Informe o valor da ALTURA: ");
		b = ler.nextInt();
		
		result = a * b;
		
		System.out.printf("A área é: %d", result);

	}

}
	