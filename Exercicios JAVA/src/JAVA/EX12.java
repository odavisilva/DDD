package JAVA;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, result;
		
		System.out.printf("Digite um a BASE de um RETÂNGULO: ");
		a = ler.nextInt();
		
		System.out.printf("Digite um a ALTURA do mesmo RETÂNGULO: ");
		b = ler.nextInt();
		
		result = a * b;
		
		if (result > 100)	{
			System.out.printf("Terreno grande");
		} else {
			System.out.printf("Terreno pequeno");
		}
	}
	
}
