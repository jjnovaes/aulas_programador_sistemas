package app;

public class Aluno {
	public String nome;
	public Integer idade;
	public String curso;

	public String exibir() {
		return "Nome: "+nome
				+"\nIdade: " + idade
				+"\nCurso: " + curso;
	}
}
