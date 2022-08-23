package br.edu.senac.classes;

public class Aluno {
	private Integer idaluno;
	private String cpf;
	private String nome;
	private String matricula;
	private Curso curso; //representa a chave estrangeira
	
	public Aluno() {
	}

	public Aluno(Integer idaluno, String cpf, String nome, String matricula, Curso curso) {
		super();
		this.idaluno = idaluno;
		this.cpf = cpf;
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	
	

	public Integer getIdaluno() {
		return idaluno;
	}

	public void setIdaluno(Integer idaluno) {
		this.idaluno = idaluno;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}
