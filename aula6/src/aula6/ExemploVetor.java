package aula6;

import java.util.Scanner;

public class ExemploVetor {
	public static void main(String args[]) {
		// criar uma classe que leia e armazene as notas e nomes de 4 alunos
		Scanner s = new Scanner(System.in);
		double notas[] = new double[4]; // declarando um vetor de 4 posições
		String nomes[] = new String[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("Informe a nome do aluno " + (i + 1));
			nomes[i] = s.next();
			
			System.out.println("Informe a nota do aluno " + (i + 1));
			notas[i] = s.nextDouble();
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("A nota do aluno "+ nomes[i] + " -> " + notas[i]);
		}
	}
}
