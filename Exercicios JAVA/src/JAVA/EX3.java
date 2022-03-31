package JAVA;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, result;
		
		System.out.printf("Digite o valor da BASE");
		a = ler.nextInt();
		
		System.out.printf("Digite o valor da ALTURA");
		b = ler.nextInt();
		
		result = a * b /2;
		
		System.out.printf("A área é: %d", result);

		}
	
}
