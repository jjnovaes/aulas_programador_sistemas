package aula;

import java.util.Scanner;

public class ExemploFor {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int inicio, fim;
		
		System.out.println("Informe o numero inicial");
		inicio = s.nextInt();
		
		System.out.println("Informe o numero final");
		fim = s.nextInt();
		
		for (int i = inicio; i <= fim; i++) {
			System.out.println(i);
		}

	}
}
