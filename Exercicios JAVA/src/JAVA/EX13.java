package JAVA;

import java.util.Scanner;

public class EX13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o primeiro número: ");
		a = ler.nextInt();
		
		System.out.printf("Digite segundo número: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro número: ");
		c = ler.nextInt();
		
		if (a > b)	{
			if (a > c) 
				System.out.printf("A é MAIOR");
			else 
				System.out.printf("C é o MAIOR");
		}
		else {
			if (b > c) 
				System.out.printf("B é o MAIOR");
			
			else 
				System.out.printf("C é o maior");
		}
		
	}
	
}

