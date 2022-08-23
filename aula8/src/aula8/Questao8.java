package aula8;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("CADASTRO DA AGENDA DO PROFESSOR JOAO");
		System.out.println("Informe a quantidade de contatos: ");
		int n = Integer.parseInt(s.nextLine());
		String agenda[][] = new String[n][3];
		for (int i = 0; i < n; i++) {
			System.out.println("Informe o nome " + i);
			agenda[i][0] = s.nextLine();
			System.out.println("Informe o endereço " + i);
			agenda[i][1] = s.nextLine();
			System.out.println("Informe o telefone: " + +i);
			agenda[i][2] = s.nextLine();
		}
		for (int i = 0; i < n; i++) {
			System.out.print("Nome: " + agenda[i][0] 
					+ " End: " + agenda[i][1]
					+" Fone: " + agenda[i][2]);
		}
	}
}
