package aula7;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int mt[][] = new int[3][3];
		
		for(int i = 0; i < 3; i++) { //vai controlar indice das linhas
			for(int j = 0; j < 3; j++) {//vai controlar indice das colunas
				//LxC ixj
				System.out.println("Informe o elemento ["+i+"]"+"["+j+"]");
				mt[i][j] = s.nextInt();
			}			
		}
		

		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Elemento ["+i+"]"+"["+j+"] ->" + mt[i][j]);
			}			
		}

	}

}
