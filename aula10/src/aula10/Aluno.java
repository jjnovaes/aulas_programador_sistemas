package aula10;

public class Aluno {	
	//atributos
	public String nome;
	public String email;
	public String senha;
	
	//m�todos
	public void cadastrar() {
		//fingir que o aluno t� sendo cadastrado
		System.out.println(nome + " agora voc� � nosso aluno");
	}
	
	public void realizarLogin() {
		System.out.println("Login realizado");
	}
}
