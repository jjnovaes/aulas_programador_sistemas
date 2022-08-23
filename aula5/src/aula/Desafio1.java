package aula;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, soma = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe um numero: ");
			n = s.nextInt();
			soma += n;
		}
		System.out.println("Soma dos nuemros: " + soma);

	}

}
