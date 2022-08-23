package aula;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int idade;
		int total_21 = 0, total_50 = 0;

		do {
			System.out.println("Informe a idade");
			idade = s.nextInt();
			if (idade < 21 && idade > 0) {
				total_21++;
			}
			if (idade > 50) {
				total_50++;
			}
		} while (idade != 0);
		System.out.println("Total de menores que 21: " + total_21);
		System.out.println("Total de maior que 50: " + total_50);
	}

}
