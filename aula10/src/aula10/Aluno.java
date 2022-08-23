package aula10;

public class Aluno {	
	//atributos
	public String nome;
	public String email;
	public String senha;
	
	//métodos
	public void cadastrar() {
		//fingir que o aluno tá sendo cadastrado
		System.out.println(nome + " agora você é nosso aluno");
	}
	
	public void realizarLogin() {
		System.out.println("Login realizado");
	}
}
