package JAVA;

import java.util.Scanner;

public class EX7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, num3, num4, num5, troco, total,  result;
		
		System.out.printf("Digite o primeiro valor: ");
		num1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		num2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		num3 = ler.nextDouble();
		
		System.out.printf("Digite o quarto valor: ");
		num4 = ler.nextDouble();
		
		System.out.printf("Digite o quinto valor: ");
		num5 = ler.nextDouble();
		
		System.out.printf("Digite o valor pago: ");
		troco = ler.nextDouble();
		
		total = num1 + num2 + num3 + num4 + num5;
		result = num1 + num2 + num3 + num4 + num5 - troco;
		
		if (troco < 0)
		troco = troco * (-1);
		
		System.out.printf("O total é %.1f", total);
		System.out.printf("O troco é %.1f", result);

		}
	
}
