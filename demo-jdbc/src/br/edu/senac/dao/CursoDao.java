package br.edu.senac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.senac.classes.Curso;
import br.edu.senac.util.Conexao;

public class CursoDao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public CursoDao() throws Exception {
		con = Conexao.conectar();
	}

	public void incluir(Curso curso) throws Exception {
		if (curso == null) {
			throw new Exception("Objeto vazio");
		}
		try {
			String sql = "insert into curso (nome, conteudo) values (?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, curso.getDescricao());
			ps.setString(2, curso.getConteudo());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao incluir dados"+e);
		} finally {
			ps.close();
		}
	}

	public void alterar(Curso curso) throws Exception {
		if (curso == null) {
			throw new Exception("Objeto vazio");
		}
		try {
			String sql = "update curso set nome = ?, conteudo = ? where idcurso = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, curso.getDescricao());
			ps.setString(2, curso.getConteudo());
			ps.setInt(3, curso.getIdcurso());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao alterar dados" + e);
		} finally {
			ps.close();
		}
	}

	public void excluir(Curso curso) throws Exception {
		if (curso == null) {
			throw new Exception("Objeto vazio");
		}
		try {
			String sql = "delete from curso where idcurso = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, curso.getIdcurso());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao alterar dados");
		} finally {
			ps.close();
		}
	}

	public Curso buscarUm(Integer id) throws Exception {
		if (id == null) {
			throw new Exception("id vazio");
		}
		try {
			String sql = "select * from curso where idcurso = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (!rs.next()) {
				throw new Exception("Não foi entrado registro");
			}
			String descricao = rs.getString("nome");
			String conteudo = rs.getString("conteudo");
			return new Curso(id, descricao, conteudo);
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			ps.close();
			rs.close();
		}
	}

	public List<Curso> buscarTodos() throws Exception {
		try {
			String sql = "select * from curso";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			List<Curso> lista = new ArrayList<Curso>(); // criando uma lista de cursos
			while (rs.next()) {
				Integer id = rs.getInt("idcurso");
				String descricao = rs.getString("nome");
				String conteudo = rs.getString("conteudo");
				lista.add(new Curso(id, descricao, conteudo));
			}
			return lista; //retorna a lista com os objetos
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			ps.close();
			rs.close();
		}
	}

}
