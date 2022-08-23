package aula;

import java.util.Scanner;

public class ExemploDecisao {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;

		System.out.println("Informe um numero");
		n = s.nextInt();
/*
		if (n > 0) {
			System.out.println("Numero é positivo");
		} else {
			if (n < 0) {
				System.out.println("Numero é negativo");
			} else {
				System.out.println("Numero é Zero");
			}
		}
*/
		if (n > 0) {
			System.out.println("Numero é positivo");
		} else if (n < 0) {
			System.out.println("Numero é negativo");
		} else {
			System.out.println("Numero é Zero");
		}

	}

}
