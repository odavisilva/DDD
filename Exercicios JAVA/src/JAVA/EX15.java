package JAVA;

import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double lado1, lado2, lado3;
		
		System.out.printf("Digite o primeiro lado do Tri�ngulo: ");
		lado1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo lado do Tri�ngulo: ");
		lado2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro lado do Tri�ngulo: ");
		lado3 = ler.nextDouble();
		
		
		if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.printf("� um Tri�ngulo escaleno: ");				
			}else if(lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado3 != lado2 || lado2 == lado3 && lado3 != lado1){
				System.out.printf("� um Tri�ngulo is�sceles: ");
			}else {
				System.out.printf("� um Tri�ngulo equil�tero: ");
			}
		}else {
			System.out.printf("N�o � um Tri�ngulo! ");
		}

	}

}
