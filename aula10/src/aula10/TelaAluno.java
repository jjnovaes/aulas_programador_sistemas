package aula10;

public class TelaAluno {

	public static void main(String[] args) {
		//criando um objeto
		Aluno a = new Aluno();
		//definindo os valores dos atributos
		a.nome = "Joao";
		a.email = "joao@gmail.com";
		a.senha = "1234";
		//acessar um método
		a.cadastrar();

	}

}
