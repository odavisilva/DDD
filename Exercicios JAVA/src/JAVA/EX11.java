package JAVA;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, result;
		
		System.out.printf("Digite um a BASE de um RET�NGULO: ");
		a = ler.nextInt();
		
		System.out.printf("Digite um a ALTURA do mesmo RET�NGULO: ");
		b = ler.nextInt();
		
		System.out.printf("Digite um a ALTURA do mesmo RET�NGULO: ");
		c = ler.nextInt();
		
		result = a * b;
		
		if (result > 100)	{
			System.out.printf("Terreno grande"); 	
		}
	}
}
