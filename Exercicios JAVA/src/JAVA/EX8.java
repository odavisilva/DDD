package JAVA;

import java.util.Scanner;

public class EX8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Digite um VALOR: ");
		a = ler.nextInt();
		
		System.out.printf("Digite outro VALOR: ");
		b = ler.nextInt();
		
		if (a < b)	{
			System.out.printf("O maior número é: %d", b);
		} else {
			System.out.printf("O maior número é: %d", a);
			
		}
	}
}
