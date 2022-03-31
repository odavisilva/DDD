package JAVA;

import java.util.Scanner;

public class EX16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double h,c1, c2;
		
		System.out.printf("Digite o primeiro lado do Triâgulo: ");
		h = ler.nextDouble();
		
		System.out.printf("Digite o segundo lado do Triâgulo: ");
		c1 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro lado do Triâgulo: ");
		c2 = ler.nextDouble();
		
		if (h == 90)
			if (h == ((c1*c1) + (c2+c2))) {
				System.out.printf("Formam um Triângulo! ");		
			}
			else {
				System.out.printf("Não formam um Triângulo! ");
		}
	}
}
