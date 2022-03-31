package JAVA;

import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double lado1, lado2, lado3;
		
		System.out.printf("Digite o primeiro lado do Triângulo: ");
		lado1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo lado do Triângulo: ");
		lado2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro lado do Triângulo: ");
		lado3 = ler.nextDouble();
		
		
		if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.printf("É um Triângulo escaleno: ");				
			}else if(lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado3 != lado2 || lado2 == lado3 && lado3 != lado1){
				System.out.printf("É um Triângulo isósceles: ");
			}else {
				System.out.printf("É um Triângulo equilátero: ");
			}
		}else {
			System.out.printf("Não é um Triângulo! ");
		}

	}

}
