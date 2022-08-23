package app;

public class Usuario {
	public String login;
	public String senha;
	
	public boolean logar() {
		if(login.equals("joao") && senha.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
}
