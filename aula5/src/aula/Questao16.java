package aula;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int filhos, soma_filhos = 0, cont = 0;
		double salario, soma_salario = 0, media_salario = 0, media_filhos = 0;
		
		do {
			System.out.println("Informe o salario: ");
			salario = s.nextDouble();
			if(salario < 0) {
				break;
			}
			System.out.println("Informe a quant de filhos: ");
			filhos = s.nextInt();
			soma_salario += salario;
			soma_filhos += filhos;
			cont++;
		}while(salario > 0);
		media_filhos = soma_filhos / cont;
		media_salario = soma_salario / cont;
		System.out.println("Media de filho: "+media_filhos);
		System.out.println("Media de salario: "+media_salario);
	}

}
