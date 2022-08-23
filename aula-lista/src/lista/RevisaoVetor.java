package lista;

public class RevisaoVetor {

	public static void main(String[] args) {
		String[] alunos = new String[5];
		alunos[0] = "Joao";
		alunos[1] = "Maria";
		alunos[2] = "Madalena";
		alunos[3] = "Jose";
		alunos[4] = "Pedro";
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i]);
		}
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
	}

}
