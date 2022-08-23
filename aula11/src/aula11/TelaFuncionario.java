package aula11;

public class TelaFuncionario {

	public static void main(String[] args) {
		//construindo objeto 1
		Funcionario f = new Funcionario();		
		//colocando informações nos atributos
		f.setNome("Joao");
		f.setIdade(33);
		
		//construindo objeto 2
		Funcionario f2 = new Funcionario("Maria", 22);
		
	
		
		
		

		//recuperando informações dos atributos
		System.out.print(f.getNome());
		System.out.print(f.getIdade());
	}

}
