package aula8;

public class ExemploVetorFixo {

	public static void main(String[] args) {
		String semana[] = {"Domingo", "Segunda", "Terça", "Quarta",
				"Quinta", "Sexta", "Sabado"};
		for (int i = 0; i < semana.length; i++) {
			System.out.println(semana[i]);
		}
		
		String agenda[][] = {
				{"Joao", "Rua do Fio", "9999999"},
				{"Maria", "Rua da Lama", "8888888"},
				{"Pedro", "Trav do Mato", "77777777"}
		};
		for (int i = 0; i < agenda.length; i++) {
			for (int j = 0; j < agenda.length; j++) {
				System.out.println(agenda[i][j]);
			}
		}
	}

}
