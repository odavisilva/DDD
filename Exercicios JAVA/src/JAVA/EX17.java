package JAVA;

import java.util.Scanner;

public class EX17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double sexo, peso, altura, imc;
		
		System.out.printf("Digite 0 se voc� for do sexo masculino ou digite 1 se for do sexo feminino: ");
		sexo = ler.nextDouble();
		
		System.out.printf("Digite o seu peso em KG: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite a sua ALTURA em metros: ");
		altura = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (sexo == 0) {
			if ((20 <= imc) && (imc < 25)) {
				System.out.printf("Voc� est� no peso ideal. Par�bens");
			} 
			else {
				System.out.printf("Voc� N�O est� no peso ideal.");
			}
			}
		else if (sexo == 1) {
				if ((19 <= imc) && (imc < 24)) {
					System.out.printf("Voc� est� no peso ideal. Par�bens");
				} 
				else {
					System.out.printf("Voc� N�O est� no peso ideal.");
			}
		}
	}
}