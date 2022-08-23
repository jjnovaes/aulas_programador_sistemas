package aula;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;

		System.out.println("Informe um numero");
		n = s.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Numero PAR");
		} else {
			System.out.println("Numero IMPAR");
		}
	}
}
