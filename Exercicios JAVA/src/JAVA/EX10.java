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
			System.out.printf("O menor n�mero �: %d", b);
		} else if (a == b) {
			System.out.printf("Os n�meros s�o iguais");
		} else {
			System.out.printf("O menor n�mero �: %d", a);
		}
	}
	
}
