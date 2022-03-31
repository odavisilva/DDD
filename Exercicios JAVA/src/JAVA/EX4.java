package JAVA;

import java.util.Scanner;

public class EX4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d, result;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextInt();
		
		System.out.printf("Digite o quarto valor: ");
		d = ler.nextInt();
		
		result = (a + b + c + d ) /2;
		
		System.out.printf("A Média é: %d", result);

		}
	
}
