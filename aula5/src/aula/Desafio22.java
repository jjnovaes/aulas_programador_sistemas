package aula;

import java.util.Scanner;

public class Desafio22 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, soma = 0;
		
		do {
			System.out.println("Informe um numero: ");
			n = s.nextInt();
			soma += n;
		} while (n > 0);
		System.out.println("Soma dos numeros: " + soma);
		
	}
}
