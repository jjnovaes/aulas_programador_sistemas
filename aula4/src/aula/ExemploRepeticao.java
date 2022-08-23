package aula;

import java.util.Scanner;

public class ExemploRepeticao {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		double n, soma = 0, media = 0;
		
		for (int i = 1; i < 5; i++) {
			System.out.print("Informe a nota " + i);
			n = s.nextDouble();
			soma = soma + n;
			media = soma / i;
		}
		
		System.out.print("Media " + media);

	}
}
