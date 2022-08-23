package aula;

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, soma = 0;
		
		System.out.println("Informe um numero: ");
		n = s.nextInt();		
		while(n > 0) {
			soma += n;
			System.out.println("Informe um numero: ");
			n = s.nextInt();			
		}
		System.out.println("Soma dos numeros: " + soma);
	}
}
