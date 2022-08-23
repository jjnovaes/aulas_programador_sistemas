package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Inserir {

	public static void main(String[] args) {
		try {
			//conectando com o banco de dados
			Conexao conexao = new Conexao();
			Connection con = conexao.conectar();			
			//System.out.println("Conexao realizada com sucesso");			
			PreparedStatement ps; //classe que escrevemos comandos SQL
			//definindo o comando sql que vou executar
			String sql = "insert into pessoa (nome, telefone) values (?,?)";
			ps = con.prepareStatement(sql); //junção da conexao com o comando SQL
			ps.setString(1, "João Silva"); //substituindo minhas interrogações
			ps.setString(2, "(91)9999-1010"); //substituindo minhas interrogações
			ps.executeUpdate(); //executando o comando SQL
			System.out.println("Registro inserido com sucesso");
		} catch (Exception e) {
			System.out.println("Ocorreu um erro " + e);
		}
	}

}
