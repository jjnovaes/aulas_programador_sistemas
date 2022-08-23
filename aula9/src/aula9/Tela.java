package aula9;

public class Tela {
	public static void main(String[] args) {
		//criar um objeto da classe Cliente		
		Cliente cliente = new Cliente();
		cliente.nome = "Joao Silva";  //dados do meu atribulo
		cliente.genero = "M";
		cliente.nascimento = "01/01/1990";
		cliente.cpf = "123.456.789-00";
		
		//acessando os dados dos atributos
		System.out.println("Nome: " + cliente.nome);
		System.out.println("Genero: " + cliente.genero);
		System.out.println("Nascimento: " + cliente.nascimento);
		System.out.println("CPF: " + cliente.cpf);
		
		//invocando um método
		cliente.cadastrar();
		
	
	}

}
