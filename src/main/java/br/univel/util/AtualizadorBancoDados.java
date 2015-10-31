package br.univel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author João Carlos Barbosa Júnior 30/10/2015 19:42:02
 *
 */
public class AtualizadorBancoDados {

	private Connection con;

	public AtualizadorBancoDados() throws SQLException {
		abrirConexaoBancoDados();
	}

	/**
	 * 
	 * Metodo para conexão com o Banco de dados
	 */
	private void abrirConexaoBancoDados() throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/SistemaVendas";
		String user = "postgres";
		String pass = "univel";
		con = DriverManager.getConnection(url, user, pass);
	}

	/**
	 * 
	 * @param cliente
	 * @throws SQLException
	 *             Grava o cliente cadastrado no BD
	 */
	public void gravaClienteBanco(Cliente cliente) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("INSERT INTO CLIENTE (IDCLIENTE, NOME, TELEFONE, ENDERECO, CIDADE, EMAIL) VALUES (?, ?, ?, ?, ?, ?)");

		ps.setInt(1, cliente.getId());
		ps.setString(2, cliente.getNome());
		ps.setString(3, cliente.getTelefone());
		ps.setString(4, cliente.getEndereco());
		ps.setString(5, cliente.getCidade());
		ps.setString(6, cliente.getEmail());
		// ps.setObject(7, (Estado) cliente.getEstado());
		// ps.setObject(8, (Genero) cliente.getGenero());

		ps.executeUpdate();

		ps.close();

	}

	/**
	 * 
	 * @param cliente
	 * @throws SQLException
	 *             Método para deletar cliente no Banco de Dados
	 */
	public void deletaClienteBanco(Cliente cliente) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("delete from Cliente where idcliente = ?");

		ps.setInt(1, cliente.getId());

		ps.executeUpdate();

		ps.close();
	}

	/*
	 *Cria uma lista de cliente para apresentar na tabela os dados do BD. 
	 */
	public List<Cliente> listaCliente() throws SQLException {
		String sql = "SELECT * FROM CLIENTE";
		List<Cliente> lista = new ArrayList<Cliente>();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Cliente cliente = new Cliente();
			cliente.setId(rs.getInt("IDCLIENTE"));
			cliente.setNome(rs.getString("NOME"));
			cliente.setEndereco(rs.getString("ENDERECO"));
			cliente.setTelefone(rs.getString("TELEFONE"));
			cliente.setCidade(rs.getString("CIDADE"));
			cliente.setEmail(rs.getString("EMAIL"));
			lista.add(cliente);
		}
		return lista;
	}

}
