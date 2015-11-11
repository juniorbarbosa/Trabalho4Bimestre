package br.univel.ui;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.univel.util.AtualizadorBancoDados;
import br.univel.util.Categoria;
import br.univel.util.Cliente;
import br.univel.util.Estado;
import br.univel.util.Genero;
import br.univel.util.Produto;
import br.univel.util.Unidade;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;

public class MioloCadastroProduto extends JPanel {
	private JTextField tfxId;
	private JTextField tfxNome;
	private JTextField tfxCodigoBarra;
	private JTextField tfxDescricao;
	private JTextField tfxCusto;
	private JTextField tfxMargemLucro;
	private JTable table;
	private TabelaCadastroProduto model = new TabelaCadastroProduto();
	private JComboBox cbxCategoria;
	private JComboBox cbxUnidade;

	/**
	 * @author João Carlos Barbosa Júnior 29/10/2015 19:31:12
	 */
	public MioloCadastroProduto() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 82, 173, 89, 89, 0 };
		gridBagLayout.rowHeights = new int[] { 20, 20, 20, 20, 20, 20, 20, 20,
				23, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("Id");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

		tfxId = new JTextField();
		tfxId.setColumns(10);
		GridBagConstraints gbc_tfxId = new GridBagConstraints();
		gbc_tfxId.anchor = GridBagConstraints.NORTH;
		gbc_tfxId.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxId.insets = new Insets(0, 0, 5, 0);
		gbc_tfxId.gridwidth = 3;
		gbc_tfxId.gridx = 1;
		gbc_tfxId.gridy = 0;
		add(tfxId, gbc_tfxId);

		JLabel lblNewLabel_1 = new JLabel("Nome");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		tfxNome = new JTextField();
		tfxNome.setColumns(10);
		GridBagConstraints gbc_tfxNome = new GridBagConstraints();
		gbc_tfxNome.anchor = GridBagConstraints.NORTH;
		gbc_tfxNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxNome.insets = new Insets(0, 0, 5, 0);
		gbc_tfxNome.gridwidth = 3;
		gbc_tfxNome.gridx = 1;
		gbc_tfxNome.gridy = 1;
		add(tfxNome, gbc_tfxNome);

		JLabel lblNewLabel_2 = new JLabel("C\u00F3digo de Barra");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);

		tfxCodigoBarra = new JTextField();
		tfxCodigoBarra.setColumns(10);
		GridBagConstraints gbc_tfxCodigoBarra = new GridBagConstraints();
		gbc_tfxCodigoBarra.anchor = GridBagConstraints.NORTH;
		gbc_tfxCodigoBarra.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxCodigoBarra.insets = new Insets(0, 0, 5, 0);
		gbc_tfxCodigoBarra.gridwidth = 3;
		gbc_tfxCodigoBarra.gridx = 1;
		gbc_tfxCodigoBarra.gridy = 2;
		add(tfxCodigoBarra, gbc_tfxCodigoBarra);

		JLabel lblNewLabel_3 = new JLabel("Categoria");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);

		cbxCategoria = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		add(cbxCategoria, gbc_comboBox);

		JLabel lblNewLabel_4 = new JLabel("Descri\u00E7\u00E3o");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		add(lblNewLabel_4, gbc_lblNewLabel_4);

		tfxDescricao = new JTextField();
		tfxDescricao.setColumns(10);
		GridBagConstraints gbc_tfxDescricao = new GridBagConstraints();
		gbc_tfxDescricao.anchor = GridBagConstraints.NORTH;
		gbc_tfxDescricao.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxDescricao.insets = new Insets(0, 0, 5, 0);
		gbc_tfxDescricao.gridwidth = 3;
		gbc_tfxDescricao.gridx = 1;
		gbc_tfxDescricao.gridy = 4;
		add(tfxDescricao, gbc_tfxDescricao);

		JLabel lblNewLabel_5 = new JLabel("Unidade");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		add(lblNewLabel_5, gbc_lblNewLabel_5);

		cbxUnidade = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 3;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 5;
		add(cbxUnidade, gbc_comboBox_1);

		JLabel lblNewLabel_6 = new JLabel("Custo");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		add(lblNewLabel_6, gbc_lblNewLabel_6);

		tfxCusto = new JTextField();
		tfxCusto.setColumns(10);
		GridBagConstraints gbc_tfxCusto = new GridBagConstraints();
		gbc_tfxCusto.anchor = GridBagConstraints.NORTH;
		gbc_tfxCusto.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxCusto.insets = new Insets(0, 0, 5, 0);
		gbc_tfxCusto.gridwidth = 3;
		gbc_tfxCusto.gridx = 1;
		gbc_tfxCusto.gridy = 6;
		add(tfxCusto, gbc_tfxCusto);

		JLabel lblNewLabel_7 = new JLabel("Margem de Lucro");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 7;
		add(lblNewLabel_7, gbc_lblNewLabel_7);

		tfxMargemLucro = new JTextField();
		tfxMargemLucro.setColumns(10);
		GridBagConstraints gbc_tfxMargemLucro = new GridBagConstraints();
		gbc_tfxMargemLucro.anchor = GridBagConstraints.NORTH;
		gbc_tfxMargemLucro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxMargemLucro.insets = new Insets(0, 0, 5, 0);
		gbc_tfxMargemLucro.gridwidth = 3;
		gbc_tfxMargemLucro.gridx = 1;
		gbc_tfxMargemLucro.gridy = 7;
		add(tfxMargemLucro, gbc_tfxMargemLucro);

		JButton btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alterarProduto();
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 8;
		add(btnNewButton_2, gbc_btnNewButton_2);

		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				excluirProduto();
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 8;
		add(btnNewButton_1, gbc_btnNewButton_1);

		JButton btnNewButton = new JButton("Gravar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionarProduto();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 8;
		add(btnNewButton, gbc_btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 9;
		add(scrollPane, gbc_scrollPane);

		table = new JTable(model);
		scrollPane.setViewportView(table);

		initTelaProduto();

	}

	/**
	 * método que iniciara todos os métodos
	 */

	private void initTelaProduto() {
		adicionarEnumComboBoxCategoria();
		adicionarEnumComboBoxUnidade();
		limparCampos();
		atualizaTabela();
		adicionarValorCampos();
	}

	/**
	 * Método para adicionar valores da Enum Categoria no comboBox
	 */
	private void adicionarEnumComboBoxCategoria() {
		Categoria[] categorias = Categoria.values();
		ComboBoxModel cbxModelCategoria = new DefaultComboBoxModel(categorias);
		cbxCategoria.setModel(cbxModelCategoria);
	}

	/**
	 * Método para adicionar valores da Enum Unidade no comboBox
	 */
	private void adicionarEnumComboBoxUnidade() {
		Unidade[] unidade = Unidade.values();
		ComboBoxModel cbxModelUnidade = new DefaultComboBoxModel(unidade);
		cbxUnidade.setModel(cbxModelUnidade);
	}

	/**
	 * método para adicionar produto no Bd.
	 */
	private void adicionarProduto() {
		String id = tfxId.getText().trim();
		String nome = tfxNome.getText().trim();
		String codigoBarra = tfxCodigoBarra.getText().trim();
		Object categoria = cbxCategoria.getSelectedItem();
		String descricao = tfxDescricao.getText().trim();
		Object unidade = cbxUnidade.getSelectedItem();
		String custoString = tfxCusto.getText().trim();
		String margemLucro = tfxMargemLucro.getText().trim();

		Produto produto = new Produto();
		produto.setId(Integer.parseInt(id));
		produto.setNome(nome);
		produto.setCodigoBarra(codigoBarra);
		produto.setCategoria((Categoria) categoria);
		produto.setDescricao(descricao);
		produto.setUnidade((Unidade) unidade);
		BigDecimal custoBigDecimal = new BigDecimal(custoString);
		produto.setCusto(custoBigDecimal);
		BigDecimal margemLucroBigDecimal = new BigDecimal(margemLucro);
		produto.setMargemLucro(margemLucroBigDecimal);

		gravaProdutoBancoDados(produto);

		limparCampos();

		atualizaTabela();
	}

	/**
	 * Método para excluir Produto do BD.
	 */
	private void excluirProduto() {
		String id = tfxId.getText().trim();

		Produto produto = new Produto();
		produto.setId(Integer.parseInt(id));

		limparCampos();

		excluiProdutoBancoDados(produto);

		atualizaTabela();
	}

	/**
	 * Método para alterar Produto do BD.
	 */
	protected void alterarProduto() {
		String id = tfxId.getText().trim();
		String nome = tfxNome.getText().trim();
		String codigoBarra = tfxCodigoBarra.getText().trim();
		Object categoria = cbxCategoria.getSelectedItem();
		String descricao = tfxDescricao.getText().trim();
		Object unidade = cbxUnidade.getSelectedItem();
		String custoString = tfxCusto.getText().trim();
		String margemLucro = tfxMargemLucro.getText().trim();

		Produto produto = new Produto();
		produto.setId(Integer.parseInt(id));
		produto.setNome(nome);
		produto.setCodigoBarra(codigoBarra);
		produto.setCategoria((Categoria) categoria);
		produto.setDescricao(descricao);
		produto.setUnidade((Unidade) unidade);
		BigDecimal custoBigDecimal = new BigDecimal(custoString);
		produto.setCusto(custoBigDecimal);
		BigDecimal margemLucroBigDecimal = new BigDecimal(margemLucro);
		produto.setMargemLucro(margemLucroBigDecimal);

		alteraProdutoBancoDados(produto);

		limparCampos();

		atualizaTabela();
	}

	/**
	 * Método para gravar o cliente no Bd.
	 * 
	 * @param produto
	 */
	private void gravaProdutoBancoDados(Produto produto) {
		try {
			AtualizadorBancoDados atualizador = new AtualizadorBancoDados();
			atualizador.gravaProdutoBanco(produto);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Método para excluir Produto do BD.
	 */
	private void excluiProdutoBancoDados(Produto produto) {
		try {
			AtualizadorBancoDados atualiza = new AtualizadorBancoDados();
			atualiza.deletaProdutoBanco(produto);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Método para alterar Produto do BD.
	 */
	private void alteraProdutoBancoDados(Produto produto) {
		try {
			AtualizadorBancoDados atualiza = new AtualizadorBancoDados();
			atualiza.alteraProdutoBanco(produto);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * método para limpar os campos
	 */
	private void limparCampos() {
		tfxId.setText("");
		tfxNome.setText("");
		tfxCodigoBarra.setText("");
		tfxDescricao.setText("");
		tfxCusto.setText("");
		tfxMargemLucro.setText("");
		cbxCategoria.setSelectedItem(null);
		cbxUnidade.setSelectedItem(null);
	}

	/**
	 * adiciona o evento do mouse ao clicar 2 vezes e adicionado nos campos os
	 * respectivos valores do campo selecionado
	 */
	private void adicionarValorCampos() {
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					carregaProduto(model.getLista().get(table.getSelectedRow()));
				}
			}
		});
	}

	/**
	 * 
	 * carrega o contato selecionado
	 */
	private void carregaProduto(Produto produto) {
		tfxId.setText(Integer.toString(produto.getId()));
		tfxNome.setText(produto.getNome());
		tfxCodigoBarra.setText(produto.getCodigoBarra());
		tfxDescricao.setText(produto.getDescricao());
		tfxCusto.setText(produto.getCusto().toString());
		tfxMargemLucro.setText(produto.getMargemLucro().toString());
		cbxCategoria.setSelectedItem(produto.getCategoria());
		cbxUnidade.setSelectedItem(produto.getUnidade());
	}

	/**
	 * Atualiza tabela com os dados diretos do BD.
	 */
	private void atualizaTabela() {
		try {
			AtualizadorBancoDados tabela = new AtualizadorBancoDados();
			model.setLista((ArrayList<Produto>) tabela.listaProduto());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
