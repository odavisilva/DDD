package JAVA;

import java.util.Scanner;

public class EX16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double h,c1, c2;
		
		System.out.printf("Digite o primeiro lado do Tri�gulo: ");
		h = ler.nextDouble();
		
		System.out.printf("Digite o segundo lado do Tri�gulo: ");
		c1 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro lado do Tri�gulo: ");
		c2 = ler.nextDouble();
		
		if (h == 90)
			if (h == ((c1*c1) + (c2+c2))) {
				System.out.printf("Formam um Tri�ngulo! ");		
			}
			else {
				System.out.printf("N�o formam um Tri�ngulo! ");
		}
	}
}
