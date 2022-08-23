package aula7;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int mtA[][] = new int[3][2];
		int mtB[][] = new int[3][2];
		int mtC[][] = new int[3][2];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Informe o elemento [" + i + "]" + "[" + j + "]");
				mtA[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println("Informe o elemento [" + i + "]" + "[" + j + "]");
				mtB[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				mtC[i][j] = mtA[i][j] + mtB[i][j];
				System.out.println("Elemento ["+i+"]"+"["+j+"] ->" + mtC[i][j]);
			}
		}

	}

}
