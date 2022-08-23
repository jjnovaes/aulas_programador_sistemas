package aula10;

public class Funcionario {
	public String nome;
	public String telefone;
	public double salario;

	public void reajustar(int p) { // informar o percentual do reajuste
		salario = salario + (salario * p / 100);
	}

	public String exibir() {
		return "Nome: " + nome + "\nSalario: " + salario;  
	}
}
