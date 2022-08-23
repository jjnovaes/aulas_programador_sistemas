package aula7;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		double salario[] = new double[3];
		String nome[] = new String[3];
		
		for(int i = 0; i<3; i++) {
			System.out.println("Informe o nome: ");
			nome[i] = s.next();
			
			System.out.println("Informe o salario: ");
			salario[i] = s.nextDouble();
		}
		
		for(int i = 0; i<3; i++) {
			if(salario[i] > 1500) {
				System.out.println("Nome: " + nome[i] + " Salario: " + salario[i] );
			}
		}
		
	}

}
