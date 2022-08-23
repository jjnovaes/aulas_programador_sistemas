package aula;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// String nome = "";
		String nomes[] = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o nome " + i);
			nomes[i] = s.nextLine();
		}

		System.out.print("O nome do segundo aluno é " + nomes[1]);

	}

}
