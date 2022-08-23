package teste;

public class Usuario {
	String login;
	String senha;
	
	boolean validar() {
		if(login == "joao" && senha == "1234") {
			return true;
		} else {
			return false;
		}
	}
	
	boolean validar2(String l, String s) {		
		if(login == "joao" && senha == "1234") {
			return true;
		} else {
			return false;
		}
	}	
}
