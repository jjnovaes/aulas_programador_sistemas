package classes;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double salario, novosalario;
		
		System.out.println("Informe o salario");
		salario = s.nextDouble();
		
		novosalario = salario * 1.1;
		
		String salarioformatado = String.format("%.2f", novosalario); // formatando para duas casas decimais
		System.out.println("Novo Salario: " + salarioformatado);

	}

}
