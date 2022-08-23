package aula8;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		System.out.println("Informe a quant de linhas");
		int l = s.nextInt();
		System.out.println("Informe a quant de colunas");
		int c = s.nextInt();
		int mt[][] = new int[l][c];
		int cont = 1;
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				mt[i][j] = cont;
				cont++;
			}
		}
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(mt[i][j] + " ");
				if(j == c-1) {
					System.out.print("\n");
				}
			}
		}

	}

}
