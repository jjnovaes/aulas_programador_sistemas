package lista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploLista {

	public static void main(String[] args) {
		List<String> alunos = new ArrayList<String>();
		alunos.add("Joao");
		alunos.add("Maria");
		alunos.add(1, "Pedro");
		alunos.add("Madalena");
		alunos.remove("Pedro");
				
		//System.out.print(alunos);
				
		for(int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i));
		}
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
	}

}
