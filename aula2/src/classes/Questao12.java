package classes;

import java.util.Scanner;

public class Questao12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double valor_pago, valor_produto, troco;
		
		System.out.println("Informe o valor pago: ");
		valor_pago = s.nextDouble();
		
		System.out.println("Informe o valor do produto: ");
		valor_produto = s.nextDouble();
		
		troco = valor_pago - valor_produto;
		
		System.out.println("Troco do cliente "+ troco);		
	}
}
