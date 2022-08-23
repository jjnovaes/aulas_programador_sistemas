package combo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	public String nome;
	public Integer matricula;
	
	public String toString() {  
        return this.nome;  
    }  

	public List getAlunos()
	{
		List lista = new ArrayList();

		Aluno a1 = new Aluno();
		nome = "Joao";
		matricula = 123;
		lista.add(a1.toString());
		
		Aluno a2 = new Aluno();
		nome = "Maria";
		matricula = 456;
		lista.add(a1.toString());
		
		return lista;
	}
}
