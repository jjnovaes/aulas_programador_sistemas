package classes;

public class Teste2 {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setIdcurso(22);
		curso.setNome("Prog de Sistemas");
		curso.setConteudo("Programa��o de coisas");
		
		Curso curso2 = new Curso(22, "Prog de Sistemas", "Programa��o de coisas");

	}

}
