package br.edu.senac.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static Connection conectar() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
	}
}
