package JAVA;

import java.util.Scanner;

public class EX18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double ac, t, vI, v, vF;

		System.out.printf("Digite a Velocidade Inicial do Carro: ");
		vI = ler.nextDouble();
		
		System.out.printf("Digite a aceleração do automóvel: ");
		ac = ler.nextDouble();
		
		System.out.printf("Digite o (em segundos) tempo gasto pelo automóvel para completar o percurso: ");
		t = ler.nextDouble();
		
		v = vI + (ac * t);
		
		vF = v * 3.6;
		
		if(vF < 40) {
			System.out.printf("Veículo muito lento");
		}
		else if(vF <= 60) {
			System.out.printf("Velocidade Permitida");
		}
		else if(vF <= 80) {
			System.out.printf("Velocidade de Cruzeiro");
		}
		else if(vF <= 120) {
			System.out.printf("Veículo rápido");
		}
		else if(vF > 120) {
			System.out.printf("Veículo muito rápido");
		}
		else {
		}

	}

}
