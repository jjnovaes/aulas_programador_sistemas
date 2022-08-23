package classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public Connection conectar() throws Exception {
		//carregando a classe com o drive de conexao com o mysql
		Class.forName("com.mysql.cj.jdbc.Driver");
		//parametros de conexao
		return DriverManager.getConnection("jdbc:mysql://localhost/aula","root","");
	}
}
