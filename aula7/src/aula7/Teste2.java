package aula7;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
				
		int mt[][] = new int[5][5];
		int cont = 1;
		
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j < 5; j++) {
				mt[i][j] = (int)(Math.random() * 25 ) + 1;
			}			
		}
		System.out.println("....Resultado....");
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j < 5; j++) {
				System.out.print(mt[i][j] + " ");
				if(i == 5) {
					System.out.print("\n");
				}
				
			}			
		}
	}

}
