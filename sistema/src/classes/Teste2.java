package classes;

public class Teste2 {

	public static void main(String[] args) {
		//construtor 1
		Funcionario f1 = new Funcionario();
		f1.setMatricula(123456);
		f1.setNome("Joao Silva");

		//construtor 2
		Funcionario f2 = new Funcionario(123456, "Joao Silva");

	}

}
