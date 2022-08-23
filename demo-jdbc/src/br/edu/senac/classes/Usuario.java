package br.edu.senac.classes;

public class Usuario {
	private Integer idusuario;
	private String login;
	private String senha;
	private String nome;
	private Boolean ativo;
	
	public Usuario() {
		
	}
	
	public Usuario(Integer idusuario, String login, String senha, String nome, Boolean ativo) {
		this.idusuario = idusuario;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.ativo = ativo;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
}
