package aula8;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int mt[][] = new int[3][3];
		int cont = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Informe o elemento [" + i + "]" + "[" + j + "]");
				mt[i][j] = s.nextInt();
				if(mt[i][j] % 2 == 0) {
					cont++;
				}
			}
		}
		System.out.println("A quantidade de pares é " + cont);
	}
}
