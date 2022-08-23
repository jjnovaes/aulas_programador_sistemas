package br.edu.senac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.senac.classes.Aluno;
import br.edu.senac.classes.Curso;
import br.edu.senac.util.Conexao;

public class AlunoDao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public AlunoDao() throws Exception {
		con = Conexao.conectar();
	}

	public void incluir(Aluno aluno) throws Exception {
		if (aluno == null) {
			throw new Exception("Objeto vazio");
		}
		try {
			String sql = "insert into aluno (cpf, nome, matricula, curso_idcurso) values (?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, aluno.getCpf());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getMatricula());
			ps.setInt(4, aluno.getCurso().getIdcurso());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao incluir dados" + e);
		} finally {
			ps.close();
		}
	}

	public void alterar(Aluno aluno) throws Exception {
		if (aluno == null) {
			throw new Exception("Objeto vazio");
		}
		try {
			String sql = "update aluno set cpf = ?, nome = ?, matricula = ?, " + "curso_idcurso = ?  where idaluno = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, aluno.getCpf());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getMatricula());
			ps.setInt(4, aluno.getCurso().getIdcurso());
			ps.setInt(5, aluno.getIdaluno());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao alterar dados" + e);
		} finally {
			ps.close();
		}
	}

	public void excluir(Aluno aluno) throws Exception {
		if (aluno == null) {
			throw new Exception("Objeto vazio");
		}
		try {
			String sql = "delete from aluno where idaluno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, aluno.getIdaluno());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao excluir dados" + e);
		} finally {
			ps.close();
		}
	}

	public Aluno buscarUm(Integer id) throws Exception {
		if (id == null) {
			throw new Exception("id vazio");
		}
		try {
			String sql = "select * from aluno where idaluno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (!rs.next()) {
				throw new Exception("Não foi entrado registro");
			}
			String nome = rs.getString("nome");
			String matricula = rs.getString("matricula");
			String cpf = rs.getString("cpf");
			Integer idcurso = rs.getInt("curso_idcurso");
			CursoDao cd = new CursoDao();
			Curso curso = cd.buscarUm(idcurso); // buscando um curso pelo id
			return new Aluno(id, cpf, nome, matricula, curso);
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			ps.close();
			rs.close();
		}
	}

	public List<Aluno> buscarTodos() throws Exception {
		try {
			String sql = "select * from aluno";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			List<Aluno> lista = new ArrayList<Aluno>(); // criando uma lista de cursos
			while (rs.next()) {
				Integer id = rs.getInt("idaluno");
				String nome = rs.getString("nome");
				String matricula = rs.getString("matricula");
				String cpf = rs.getString("cpf");
				Integer idcurso = rs.getInt("curso_idcurso");
				CursoDao cd = new CursoDao();
				Curso curso = cd.buscarUm(idcurso);
				lista.add(new Aluno(id, cpf, nome, matricula, curso));
			}
			return lista; // retorna a lista com os objetos
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			ps.close();
			rs.close();
		}
	}

}
