package classes;

public class Teste {

	public static void main(String[] args) {
		// CRIAR UM OBJETO DO TIPO ALUNO

		Aluno aluno = new Aluno();
		aluno.setIdaluno(1);
		aluno.setNome("Joao Silva");
		aluno.setMatricula("102030");
		aluno.setCpf(123456789);
		/*
		 * Curso curso = new Curso(); curso.setIdcurso(22);
		 * curso.setNome("Programador de Sistemas");
		 * curso.setConteudo("Programação de coisas");
		 */
		// Curso curso = new Curso(22, "Prog de Sistemas", "Programação de coisas");
		aluno.setCurso(new Curso(22, "Prog de Sistemas", "Programação de coisas"));

		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Nome Curso: " + aluno.getCurso().getNome());

	}

}
