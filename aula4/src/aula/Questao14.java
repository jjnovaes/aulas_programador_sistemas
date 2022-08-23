package aula;

import java.util.Scanner;

public class Questao14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int dia;
		System.out.print("Informe o dia:");
		dia = s.nextInt();
		
		switch (dia) {
		case 1:
			System.out.print("Domingo");
			break;
		case 2:
			System.out.print("Segunda");
			break;
		case 3:
			System.out.print("Terça");
			break;
		default:
			System.out.print("Dia Inválido");
		}
		
	}
}
