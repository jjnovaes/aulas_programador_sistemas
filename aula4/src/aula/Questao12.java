package aula;

import java.util.Scanner;

public class Questao12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		char sexo;
		double altura, peso_ideal;
		String nome;
		System.out.print("Informe o nome:");
		nome = s.nextLine();
		System.out.print("Informe o sexo:");
		sexo = s.nextLine().charAt(0);
		System.out.print("Informe a altura:");
		altura = s.nextDouble();
		if (sexo == 'M' || sexo == 'm') {
			peso_ideal = (72.7 * altura) - 58;
			System.out.print("Peso ideal: " + peso_ideal);
		} else if (sexo == 'F' || sexo == 'f') {
			peso_ideal = (62.1 * altura) - 44.7;
			System.out.print("Peso ideal: " + peso_ideal);
		} else {
			System.out.print("Sexo inválido");
		}
	}
}
