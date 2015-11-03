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
				.prepareStatement("INSERT INTO CLIENTE (IDCLIENTE, NOME, TELEFONE, ENDERECO, CIDADE, EMAIL, ESTADO, GENERO) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

		ps.setInt(1, cliente.getId());
		ps.setString(2, cliente.getNome());
		ps.setString(3, cliente.getTelefone());
		ps.setString(4, cliente.getEndereco());
		ps.setString(5, cliente.getCidade());
		ps.setString(6, cliente.getEmail());
		ps.setObject(7, cliente.getEstado().toString());
		ps.setObject(8, cliente.getGenero().toString());

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

	/**
	 * 
	 * Método para alterar o cliente no BD
	 */
	public void alteraClienteBanco(Cliente c) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("update cliente set nome = ?,telefone = ?, endereco = ?, cidade = ?, email = ? where idcliente = ?");

		ps.setString(1, c.getNome());
		ps.setString(2, c.getTelefone());
		ps.setString(3, c.getEndereco());
		ps.setString(4, c.getCidade());
		ps.setString(5, c.getEmail());
		// ps.setObject(6, c.getEstado().toString());
		// ps.setObject(7, c.getGenero().toString());
		ps.setInt(6, c.getId());

		ps.executeUpdate();

		ps.close();

	}

	// /*
	// *Cria uma lista de cliente para apresentar na tabela os dados do BD.
	// */
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
			cliente.setEstado(Estado.valueOf(rs.getString("ESTADO")));
			cliente.setGenero(Genero.valueOf(rs.getString("GENERO")));

			lista.add(cliente);
		}
		return lista;
	}

	/**
	 * 
	 * Método para gravar o produto no BD.
	 * 
	 */
	public void gravaProdutoBanco(Produto produto) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("INSERT INTO PRODUTO (IDPRODUTO, NOME, CODIGOBARRA, CATEGORIA, DESCRICAO, UNIDADE) VALUES (?, ?, ?, ?, ?, ?)");

		ps.setInt(1, produto.getId());
		ps.setString(2, produto.getNome());
		ps.setString(3, produto.getCodigoBarra());
		ps.setObject(4, produto.getCategoria().toString());
		ps.setString(5, produto.getDescricao());
		ps.setObject(6, produto.getUnidade().toString());
		// ps.setObject(7, produto.getCusto().toString());
		// ps.setObject(8, produto.getMargemLucro().toString());

		ps.executeUpdate();

		ps.close();

	}

	/**
	 * 
	 * @param cliente
	 * @throws SQLException
	 *             Método para deletar o produto no Banco de Dados
	 */
	public void deletaProdutoBanco(Cliente cliente) throws SQLException {
		// PreparedStatement ps = con
		// .prepareStatement("delete from Cliente where idcliente = ?");
		//
		// ps.setInt(1, cliente.getId());
		//
		// ps.executeUpdate();
		//
		// ps.close();
	}

	/**
	 * 
	 * Método para alterar o produto no BD
	 */
	public void alteraProdutoBanco(Cliente c) throws SQLException {
		// PreparedStatement ps = con
		// .prepareStatement("update cliente set nome = ?,telefone = ?, endereco = ?, cidade = ?, email = ? where idcliente = ?");
		//
		// ps.setString(1, c.getNome());
		// ps.setString(2, c.getTelefone());
		// ps.setString(3, c.getEndereco());
		// ps.setString(4, c.getCidade());
		// ps.setString(5, c.getEmail());
		// // ps.setObject(6, c.getEstado().toString());
		// // ps.setObject(7, c.getGenero().toString());
		// ps.setInt(6, c.getId());
		//
		// ps.executeUpdate();
		//
		// ps.close();

	}

	// /*
	// *Cria uma lista de Produtos para apresentar na tabela do BD.
	// */
	public List<Produto> listaProduto() throws SQLException {
		String sql = "SELECT * FROM PRODUTO";
		List<Produto> lista = new ArrayList<Produto>();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Produto produto = new Produto();
			produto.setId(rs.getInt("IDPRODUTO"));
			produto.setNome(rs.getString("NOME"));
			produto.setCodigoBarra(rs.getString("CODIGOBARRA"));
			produto.setCategoria(Categoria.valueOf(rs.getString("CATEGORIA")));
			produto.setDescricao(rs.getString("DESCRICAO"));
			produto.setUnidade(Unidade.valueOf(rs.getString("UNIDADE")));
			// ps.setObject(7, produto.getCusto().toString());
			// ps.setObject(8, produto.getMargemLucro().toString());

			lista.add(produto);
		}
		return lista;
	}

}
