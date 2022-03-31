package JAVA;

import java.util.Scanner;

public class EX14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, resposta;
		
		System.out.printf("Digite o seu PESO: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite a ALTURA em cm: ");
		altura = ler.nextDouble();
		
		
		double imc = peso / (altura * altura) ;
		
		
		if ( imc <= 18.5 )	{
			System.out.printf("Você está ABAIXO do PESO! ");	
		}
		else {
			if  (( imc >= 18.5 && imc <= 24.9 )) {
			System.out.printf("Você está com o peso NORMAL! ");
			}
			else { 
				if (( imc >= 25.0 && imc <= 29.9 )) {
					System.out.printf("Você está com SOBREPESO! ");
				}
				else {
					if (( imc >= 30.0 && imc <= 39.9)) {
						System.out.printf("Você está com OBESIDADE! ");
					}
					else {
							System.out.printf("Você está com OBESIDADE grave!! ");
							
					}
				}
			}
		}
	}	
}
		

	
	
