package classes;

public class Funcionario {
	private Integer matricula;
	private String nome;
	
	//construtor 1
	public Funcionario() {
	}
	//construtor 2
	public Funcionario(Integer matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
