package br.edu.senac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.edu.senac.classes.Curso;
import br.edu.senac.classes.Usuario;
import br.edu.senac.util.Conexao;

public class UsuarioDao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public UsuarioDao() throws Exception {
		con = Conexao.conectar();
	}
	
	public Boolean validarUsuario(Usuario usuario) throws Exception {
		if (usuario == null) {
			throw new Exception("Objeto vazio");
		}
		try {
			String sql = "select * from usuario where login = ? and senha = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getSenha());
			rs = ps.executeQuery();
			if (rs.next()) { //teste se tem alguma coisa
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			ps.close();
			rs.close();
		}
	}
	
	public void incluir(Usuario usuario) throws Exception {
		if (usuario == null) {
			throw new Exception("Objeto vazio");
		}
		try {
			String sql = "insert into usuario (login, senha, nome, ativo) values (?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getSenha());
			ps.setString(3, usuario.getNome());
			ps.setBoolean(4, usuario.getAtivo());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao incluir dados"+e);
		} finally {
			ps.close();
		}
	}

}
