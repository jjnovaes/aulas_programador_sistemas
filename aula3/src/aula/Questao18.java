package aula;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double valor_compra, quant_parcelas, valor_parcelas;
		
		System.out.println("Informe o valor da compra");
		valor_compra = s.nextDouble();
		
		System.out.println("Informe a quant de parcelas");
		quant_parcelas = s.nextDouble();
		
		valor_parcelas = valor_compra / quant_parcelas;
		
		System.out.println("Valor compra: " + valor_compra
				+ "\nQuant parcelas: " + quant_parcelas
				+ "\nValor parcelas: " + valor_parcelas);

	}

}
