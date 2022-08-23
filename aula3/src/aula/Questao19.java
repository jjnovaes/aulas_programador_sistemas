package aula;

import java.util.Scanner;

public class Questao19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double preco_final, preco_fabrica, impostos, lucro;
		
		System.out.println("Informe o preço de fabrica: ");
		preco_fabrica = s.nextDouble();
		
		impostos = preco_fabrica * 0.35;
		lucro = preco_fabrica * 0.1;
		
		preco_final = preco_fabrica + impostos + lucro;
		
		System.out.println("Preço Final: " + preco_final);
	}
}
