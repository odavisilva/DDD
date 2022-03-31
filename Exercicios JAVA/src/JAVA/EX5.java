package JAVA;

import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, result;
		
		System.out.printf("Digite o valor em Grau Celsius: ");
		a = ler.nextInt();
		
		result = a * 1.8 + 32;
		System.out.printf("A valor em fahrenheit é: %.2f", result);

		}
	
}
