package br.edu.senac.classes;

public class Teste {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setIdcurso(10);
		curso.setDescricao("Informatica");
		curso.setConteudo("Muitas coisas loucas");
		
		Aluno aluno = new Aluno();
		aluno.setCpf("123456789");
		aluno.setMatricula("9999");
		aluno.setNome("Joao Silva");
		aluno.setCurso(curso);

	}

}
