package aula7;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de linas: ");
		int l = Integer.parseInt(s.nextLine());
		System.out.println("Informe a quantidade de colunas: ");
		int c = Integer.parseInt(s.nextLine());
		
		int mt[][] = new int[l][c];
		int cont = 1;
		
		for(int i = 0; i < l; i++) { 
			for(int j = 0; j < c; j++) {
				mt[i][j] = cont;
				cont++;
			}			
		}
		System.out.println("....Resultado....");
		for(int i = 0; i < l; i++) { 
			for(int j = 0; j < c; j++) {
				System.out.print(mt[i][j] + " ");
				if(j == c-1) {
					System.out.print("\n");
				}
				
			}			
		}
	}

}
