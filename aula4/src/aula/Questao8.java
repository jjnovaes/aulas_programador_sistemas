package aula;

import java.util.Scanner;

public class Questao8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double n1, n2, recup, media, media_final;
		System.out.print("Informe a nota 1:");
		n1 = s.nextDouble();
		System.out.print("Informe a nota 2:");
		n2 = s.nextDouble();
		media = (n1 + n2) / 2;
		if (media >= 7) {
			System.out.print("Aprovado, com m�dia " + media);
		} else {
			System.out.print("Informe a nota da recupera��o:");
			recup = s.nextDouble();
			media_final = (media + recup) / 2;
			if (media_final >= 5) {
				System.out.print("Aprovado, com m�dia " + media_final);
			} else {
				System.out.print("Reprovado, com m�dia " + media_final);
			}
		}
	}
}
