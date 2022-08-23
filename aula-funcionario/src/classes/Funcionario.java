package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	public Integer idfuncionario;
	public String cpf;
	public String nome;

	// metodo que retorna uma lista de objtos do tipo Funcionario
	// buscados no banco de dados
	public static List<Funcionario> consultar() throws Exception {
		Connection con = Conexao.conectar(); // conexao com o mysql
		PreparedStatement ps; // classe que armazena uma consulta sql
		ResultSet rs; // classe que armazena o resultado da consulta sql
		String sql = "select * from funcionario"; // comando sql
		ps = con.prepareStatement(sql); // preparando meu o comando para ser executado
		rs = ps.executeQuery(); // executando o comando sql
		List<Funcionario> resultado = new ArrayList<Funcionario>(); // criando uma lista do tipo funcionairo
		// transforma cada linha do rs em um objeto e add na lista
		while (rs.next()) { // repetir enquanto tiver linhas no resultset
			Funcionario f = new Funcionario(); // criando um obj de funcionario
			f.idfuncionario = rs.getInt("idpfuncionario"); // pegando o valor do RS e colocando no atributo
			f.nome = rs.getString("nome");
			f.cpf = rs.getString("cpf");
			resultado.add(f); // adicionar na lista
		}
		return resultado; // retornar a lista
	}

	public static List<Funcionario> consultarNome(String nome) throws Exception {
		Connection con = Conexao.conectar();
		PreparedStatement ps;
		ResultSet rs;
		String sql = "select * from funcionario where nome like ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, "%" + nome + "%");
		rs = ps.executeQuery();
		List<Funcionario> resultado = new ArrayList<Funcionario>();
		while (rs.next()) {
			Funcionario f = new Funcionario();
			f.idfuncionario = rs.getInt("idpfuncionario");
			f.nome = rs.getString("nome");
			f.cpf = rs.getString("cpf");
			resultado.add(f);
		}
		return resultado;
	}

	public static List<Funcionario> consultarPersonalizada(String pista, String tipo) throws Exception {
		Connection con = Conexao.conectar();
		PreparedStatement ps;
		ResultSet rs;
		String sql;
		if(tipo.equals("Nome")) {
			sql = "select * from funcionario where nome like ?";
		} else {
			sql = "select * from funcionario where cpf like ?";
		}
		ps = con.prepareStatement(sql);
		ps.setString(1, "%"+pista+"%");
		rs = ps.executeQuery();
		List<Funcionario> resultado = new ArrayList<Funcionario>();
		while (rs.next()) {
			Funcionario f = new Funcionario();
			f.idfuncionario = rs.getInt("idpfuncionario");
			f.nome = rs.getString("nome");
			f.cpf = rs.getString("cpf");
			resultado.add(f);
		}
		return resultado;
	}
	
	

}
