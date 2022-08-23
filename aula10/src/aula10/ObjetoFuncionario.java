package aula10;

import java.util.Scanner;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		Funcionario f = new Funcionario();
		
		System.out.print("Informe o nome:");
		f.nome = s.nextLine();
		//System.out.print("Informe o telefone:");
		//f.telefone = s.nextLine();
		System.out.print("Informe o salário:");
		f.salario = s.nextDouble();
		
		System.out.print("Informe o valor do reajuste:");
		int r = s.nextInt();
		
		f.reajustar(r);
		
		System.out.print(f.exibir());

	}

}
