package estrutura_repeticao;

import java.util.Scanner;

public class Ex22d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		
		System.out.println("Digite o primeiro valor: ");
		n1 = sc.nextDouble();
		
		
		do {
			System.out.println("Digite o segundo valor: ");
			n2 = sc.nextDouble();
		}
		while(n2 < n1);
		
		System.out.println("Fim");
		
		sc.close();

	}

}