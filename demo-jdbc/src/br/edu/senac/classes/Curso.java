package br.edu.senac.classes;

public class Curso {
	private Integer idcurso;
	private String descricao;
	private String conteudo;

	public Curso() {
	}
	
	public Curso(Integer idcurso, String descricao, String conteudo) {
		this.idcurso = idcurso;
		this.descricao = descricao;
		this.conteudo = conteudo;
	}

	public Integer getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public String toString() {
		return "Curso [idcurso=" + idcurso + ", descricao=" + descricao + ", conteudo=" + conteudo + "]";
	}

}
