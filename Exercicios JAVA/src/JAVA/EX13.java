package JAVA;

import java.util.Scanner;

public class EX13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite o primeiro n�mero: ");
		a = ler.nextInt();
		
		System.out.printf("Digite segundo n�mero: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro n�mero: ");
		c = ler.nextInt();
		
		if (a > b)	{
			if (a > c) 
				System.out.printf("A � MAIOR");
			else 
				System.out.printf("C � o MAIOR");
		}
		else {
			if (b > c) 
				System.out.printf("B � o MAIOR");
			
			else 
				System.out.printf("C � o maior");
		}
		
	}
	
}

