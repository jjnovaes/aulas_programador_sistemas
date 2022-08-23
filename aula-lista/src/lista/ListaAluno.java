package lista;

import java.util.ArrayList;
import java.util.List;

public class ListaAluno {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();

		Aluno a = new Aluno();
		a.matricula = 12345;
		a.nome = "Joao";
		alunos.add(a);

		Aluno a2 = new Aluno();
		a2.matricula = 56478;
		a2.nome = "Maria";
		alunos.add(a2);

		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}

	}
}
