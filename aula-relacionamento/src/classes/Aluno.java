package classes;

public class Aluno {
	private Integer idaluno;
	private String nome;
	private String matricula;
	private Integer cpf;
	private Curso curso;
	
	public Aluno() {		
	}
	
	public Aluno(Integer idaluno, String nome, String matricula, Integer cpf, Curso curso) {
		this.idaluno = idaluno;
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.curso = curso;
	}
	public Integer getIdaluno() {
		return idaluno;
	}
	public void setIdaluno(Integer idaluno) {
		this.idaluno = idaluno;
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
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
