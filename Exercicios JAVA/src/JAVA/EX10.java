package JAVA;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Digite um VALOR: ");
		a = ler.nextInt();
		
		System.out.printf("Digite outro VALOR: ");
		b = ler.nextInt();
		
		if (a > b)	{
			System.out.printf("O menor número é: %d", b);
		} else if (a == b) {
			System.out.printf("Os números são iguais");
		} else {
			System.out.printf("O menor número é: %d", a);
		}
	}
	
}
