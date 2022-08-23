package aula6;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double notas[] = new double[5]; // declarando um vetor de 4 posições
		String nomes[] = new String[5];
		double soma = 0, media = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe a nome do aluno " + (i + 1));
			nomes[i] = s.next();

			System.out.println("Informe a media do aluno " + (i + 1));
			notas[i] = s.nextDouble();
			soma = soma + notas[i];
		}

		for (int i = 0; i < 5; i++) {
			if (notas[i] >= 7) {
				System.out.println(nomes[i] + " Aprovado");
			} else {
				System.out.println(nomes[i] + " Reprovado");
			}
		}
		media = soma / 5;
		System.out.println("Média da turma: " + media);
	}

}
