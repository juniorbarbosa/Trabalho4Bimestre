package br.univel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author João Carlos Barbosa Júnior 30/10/2015 19:42:02
 *
 */
public class AtualizadorBancoDados {

	public AtualizadorBancoDados() throws SQLException {
		abrirConexaoBancoDados();
	}

	/**
	 * 
	 * Metodo para conexão com o Banco de dados
	 */
	private static void abrirConexaoBancoDados() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/SistemaVendas";
		String user = "postgres";
		String pass = "univel";
		Connection con = DriverManager.getConnection(url, user, pass);
	}
	
}
