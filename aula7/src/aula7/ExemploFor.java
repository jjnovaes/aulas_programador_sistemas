package aula7;

import java.util.Scanner;

public class ExemploFor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int vt[] = new int[3];
		
		System.out.println("Antes da repetição");
		
		for(int i = 0; i<3; i++) {
			System.out.println("Informe um numero: ");
			vt[i] = s.nextInt();
		}
		
		System.out.println("Depos da repetição");
	}
}
