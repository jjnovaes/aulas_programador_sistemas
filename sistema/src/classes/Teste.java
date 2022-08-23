package classes;

public class Teste {
	public static void main(String[] args) {		
		Produto produto = new Produto(); //criando objeto
		produto.codigo = 10; //definindo
		produto.descricao = "Teclado";
		System.out.println(produto.codigo); //acessando
		System.out.println(produto.descricao);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setMatricula(123456); //definindo
		funcionario.setNome("Joao Silva");
		System.out.println(funcionario.getMatricula()); //acessando
		System.out.println(funcionario.getNome());
		
	}
}
