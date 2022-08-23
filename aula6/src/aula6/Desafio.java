package aula6;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome[] = new String[4];
		double av1[] = new double[4];
		double av2[] = new double[4];
		double media[] = new double[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("Informe a nome do aluno: " + (i + 1));
			nome[i] = s.next();
			System.out.println("Informe a av1 do aluno " + (i + 1));
			av1[i] = s.nextDouble();
			System.out.println("Informe a av2 do aluno " + (i + 1));
			av2[i] = s.nextDouble();
			media[i] = (av1[i] + av2[i]) / 2;
		}

		for (int i = 0; i < 4; i++) {
			if(media[i] >= 7){
				System.out.println(nome[i] + ", aprovado com média "+ media[i]);
			} else {
				System.out.println(nome[i] + ", reprovado com média "+ media[i]);
			}
		}

	}

}
