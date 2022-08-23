package aula;

import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;

		System.out.println("Informe o valor de A");
		a = s.nextInt();

		System.out.println("Informe o valor de B");
		b = s.nextInt();

		if (a == b) {
			System.out.println("Numeros iguais");
		} else if (a > b) {
			System.out.println(a + " é maior numero");
		} else {
			System.out.println(b + " é maior numero");
		}
	}
}
