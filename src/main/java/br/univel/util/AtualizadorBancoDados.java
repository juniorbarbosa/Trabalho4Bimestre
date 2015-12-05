package br.univel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
				.prepareStatement("update cliente set nome = ?,telefone = ?, endereco = ?, cidade = ?, email = ?, estado = ?, genero = ? where idcliente = ?");

		ps.setString(1, c.getNome());
		ps.setString(2, c.getTelefone());
		ps.setString(3, c.getEndereco());
		ps.setString(4, c.getCidade());
		ps.setString(5, c.getEmail());
		ps.setObject(6, c.getEstado().toString());
		ps.setObject(7, c.getGenero().toString());
		ps.setInt(8, c.getId());

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
	 * Método para apresentar o id e o nome do cliente no comboBox do usuário
	 * 
	 * @return
	 * @throws SQLException
	 */

	public List<Cliente> listaClienteTelaCadastroUsuario() throws SQLException {
		String sql = "SELECT IDCLIENTE, NOME FROM CLIENTE";
		List<Cliente> lista = new ArrayList<Cliente>();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Cliente cliente = new Cliente();
			cliente.setId(rs.getInt("IDCLIENTE"));
			cliente.setNome(rs.getString("NOME"));
			lista.add(cliente);
		}
		return lista;

	}

	public List<Produto> listaProdutoComboBox() throws SQLException {
		String sql = "SELECT IDPRODUTO, NOME FROM PRODUTO";
		List<Produto> lista = new ArrayList<Produto>();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Produto produto = new Produto();
			produto.setId(rs.getInt("IDPRODUTO"));
			produto.setNome(rs.getString("NOME"));
			lista.add(produto);
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
				.prepareStatement("INSERT INTO PRODUTO (IDPRODUTO, NOME, CODIGOBARRA, CATEGORIA, DESCRICAO, UNIDADE, CUSTO, MARGEMLUCRO) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

		ps.setInt(1, produto.getId());
		ps.setString(2, produto.getNome());
		ps.setString(3, produto.getCodigoBarra());
		ps.setObject(4, produto.getCategoria().toString());
		ps.setString(5, produto.getDescricao());
		ps.setObject(6, produto.getUnidade().toString());
		ps.setBigDecimal(7, produto.getCusto());
		ps.setBigDecimal(8, produto.getMargemLucro());

		ps.executeUpdate();

		ps.close();

	}

	/**
	 * 
	 * @param produto
	 * @throws SQLException
	 *             Método para deletar o produto no Banco de Dados
	 */
	public void deletaProdutoBanco(Produto produto) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("delete from Produto where idproduto = ?");

		ps.setInt(1, produto.getId());

		ps.executeUpdate();

		ps.close();
	}

	/**
	 * 
	 * Método para alterar o produto no BD
	 */
	public void alteraProdutoBanco(Produto produto) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("update produto set nome = ?,codigobarra = ?, categoria = ?, descricao = ?, unidade = ?, custo = ?, margemlucro =? where idproduto = ?");

		ps.setString(1, produto.getNome());
		ps.setString(2, produto.getCodigoBarra());
		ps.setString(3, produto.getCategoria().toString());
		ps.setString(4, produto.getDescricao());
		ps.setString(5, produto.getUnidade().toString());
		ps.setBigDecimal(6, produto.getCusto());
		ps.setBigDecimal(7, produto.getMargemLucro());
		ps.setInt(8, produto.getId());
		ps.executeUpdate();

		ps.close();

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
			produto.setCusto(rs.getBigDecimal("CUSTO"));
			produto.setMargemLucro(rs.getBigDecimal("MARGEMLUCRO"));

			lista.add(produto);
		}
		return lista;
	}

	/**
	 * 
	 * @param usuario
	 * @throws SQLException
	 */
	public void gravaUsuarioBanco(Usuario usuario) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("insert into usuario (idcliente, idusuario, senha) values (?, ?, ?)");

		ps.setInt(1, usuario.getId());
		ps.setInt(2, usuario.getIdUsuario());
		ps.setString(3, usuario.getSenha());

		ps.executeUpdate();

		ps.close();

	}

	/**
	 * Método para deletar um usuário no BD.
	 * 
	 */

	public void deletaUsuarioBanco(Usuario usuario) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("delete from usuario where idusuario = ?");

		ps.setInt(1, usuario.getIdUsuario());

		ps.executeUpdate();

		ps.close();
	}

	/**
	 * 
	 * Método para alterar o usuario no BD
	 */
	public void alteraUsuarioBanco(Usuario usuario) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("update usuario set senha = ? where idusuario = ?");

		ps.setString(1, usuario.getSenha());
		ps.setInt(2, usuario.getIdUsuario());

		ps.executeUpdate();

		ps.close();

	}

	// /*
	// *Cria uma lista de usuarios para apresentar na tabela os dados do BD.
	// */
	public List<Usuario> listaUsuario() throws SQLException {
		String sql = "SELECT * FROM USUARIO";
		List<Usuario> lista = new ArrayList<Usuario>();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Usuario usuario = new Usuario();
			usuario.setId(rs.getInt("IDCLIENTE"));
			usuario.setIdUsuario(rs.getInt("IDUSUARIO"));
			usuario.setSenha(rs.getString("SENHA"));

			lista.add(usuario);
		}
		return lista;
	}

	/**
	 * Método para validar um usuário no PainelLogin para acessar o sistema.
	 */
	public void validaLogin(Integer textField, String passwordField,
			Runnable acaoOk) {
		try {
			String sql = "select * from usuario where idusuario = ? and senha = ?";
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setInt(1, textField);
			stm.setString(2, passwordField);

			ResultSet rs = stm.executeQuery();

			if (rs.next()) {
				acaoOk.run();
			} else {
				JOptionPane.showMessageDialog(null,
						"Usuário e/ou senha inválidos!");
			}

		} catch (SQLException ex) {
			ex.printStackTrace(System.err);
		}

	}

	public void gravaVenda(Venda venda) throws SQLException {
		PreparedStatement ps = con
				.prepareStatement("insert into venda (idvenda, data_2, hora) values (?, ?, ?)");

		ps.setInt(1, venda.getIdVenda());
		ps.setInt(2, venda.getIdVenda());
		ps.setString(3, venda.getData());
		ps.setString(4, venda.getHora());

		ps.executeUpdate();

		ps.close();
	}

}
