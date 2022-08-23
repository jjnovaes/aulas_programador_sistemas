package aula11;

public class Funcionario {
	private String nome;
	private int idade;
	//construtor 1
	public Funcionario() {
	}
	//construtor 2
	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
}
