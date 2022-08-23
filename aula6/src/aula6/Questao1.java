package aula6;

import java.util.Scanner;

public class Questao1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int vt[] = new int[5];
		int cont = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o numero " + (i + 1));
			vt[i] = s.nextInt();
			if (vt[i] % 2 == 0) {
				cont++;
			}
		}

		System.out.print("Quantidade de pares: " + cont);

	}
}
