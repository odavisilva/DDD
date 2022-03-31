package JAVA;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, result;
		
		System.out.printf("Digite o valor da aresta do quadrado");
		a = ler.nextInt();
		
		result = a * a;
		
		System.out.printf("A área é: %d", result);

	}

}
	
