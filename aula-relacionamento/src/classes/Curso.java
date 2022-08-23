package classes;

public class Curso {
	private Integer idcurso;
	private String nome;
	private String conteudo;
	
	public Curso() {		
	}
	
	
	public Curso(Integer idcurso, String nome, String conteudo) {
		this.idcurso = idcurso;
		this.nome = nome;
		this.conteudo = conteudo;
	}
	public Integer getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
