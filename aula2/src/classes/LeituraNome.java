package classes;

import java.util.Scanner; //java e util são pacotes e Scanner é uma classe

public class LeituraNome {
	public static void main(String[] args) {
		//classe para leitura do nome
		String nome;
		int idade;
		
		//toda vez que fizer leitura no console adicinar a linha
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe seu nome: "); //escreva
		nome = s.nextLine();  //leia variavel do tipo String
		
		System.out.println("Informe sua idade: ");
		idade = s.nextInt();  //leia variavel do tipo int
		
		System.out.println("Seu nome: " + nome + "\nSua idade: " + idade); //escreva
		
	}

}
