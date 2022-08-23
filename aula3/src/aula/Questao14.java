package aula;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double n1, n2, n3, media;

		System.out.println("Informe a nota 1");
		n1 = s.nextDouble();

		System.out.println("Informe a nota 2");
		n2 = s.nextDouble();

		System.out.println("Informe a nota 3");
		n3 = s.nextDouble();

		media = (n1 + n2 + n3) / 3;

		System.out.println("Média: " + media);

		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}

}
