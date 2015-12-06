package br.univel.ui;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.univel.util.AtualizadorBancoDados;
import br.univel.util.Cliente;
import br.univel.util.Produto;
import br.univel.util.ProdutoVenda;
import br.univel.util.Venda;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author João Carlos Barbosa Júnior 19/11/2015 19:19:37
 *
 */
public class MioloCadastroVenda extends JPanel {
	private JTextField txtNumeroVenda;
	private JTextField txtData;
	private JTextField txtHora;
	private JTextField txtQuantidade;
	private JTextField txtTotal;
	private JTextField txtValorPago;
	private JTextField txtTroco;
	private JTable table;
	private TabelaCadastroVenda model = new TabelaCadastroVenda();
	private JComboBox cbxProduto;
	private JComboBox cbxCliente;

	/**
	 * Create the panel.
	 */
	public MioloCadastroVenda() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("N\u00FAmero");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

		txtNumeroVenda = new JTextField();
		GridBagConstraints gbc_txtNumeroVenda = new GridBagConstraints();
		gbc_txtNumeroVenda.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumeroVenda.insets = new Insets(0, 0, 5, 5);
		gbc_txtNumeroVenda.gridx = 1;
		gbc_txtNumeroVenda.gridy = 0;
		add(txtNumeroVenda, gbc_txtNumeroVenda);
		txtNumeroVenda.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Data");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		txtData = new JTextField();
		GridBagConstraints gbc_txtData = new GridBagConstraints();
		gbc_txtData.insets = new Insets(0, 0, 5, 5);
		gbc_txtData.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtData.gridx = 3;
		gbc_txtData.gridy = 0;
		add(txtData, gbc_txtData);
		txtData.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Hora");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 0;
		add(lblNewLabel_2, gbc_lblNewLabel_2);

		txtHora = new JTextField();
		GridBagConstraints gbc_txtHora = new GridBagConstraints();
		gbc_txtHora.insets = new Insets(0, 0, 5, 5);
		gbc_txtHora.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHora.gridx = 5;
		gbc_txtHora.gridy = 0;
		add(txtHora, gbc_txtHora);
		txtHora.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Cliente");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.gridx = 6;
		gbc_lblNewLabel_3.gridy = 0;
		add(lblNewLabel_3, gbc_lblNewLabel_3);

		adicionarValorCbxCliente();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 7;
		gbc_comboBox.gridy = 0;
		add(cbxCliente, gbc_comboBox);

		JLabel lblProduto = new JLabel("Produto");
		GridBagConstraints gbc_lblProduto = new GridBagConstraints();
		gbc_lblProduto.anchor = GridBagConstraints.EAST;
		gbc_lblProduto.insets = new Insets(0, 0, 5, 5);
		gbc_lblProduto.gridx = 0;
		gbc_lblProduto.gridy = 1;
		add(lblProduto, gbc_lblProduto);

		adicionarValorCbxProduto();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 1;
		add(cbxProduto, gbc_comboBox_1);

		JLabel lblQuantidade = new JLabel("Quantidade");
		GridBagConstraints gbc_lblQuantidade = new GridBagConstraints();
		gbc_lblQuantidade.anchor = GridBagConstraints.EAST;
		gbc_lblQuantidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuantidade.gridx = 2;
		gbc_lblQuantidade.gridy = 1;
		add(lblQuantidade, gbc_lblQuantidade);

		txtQuantidade = new JTextField();
		GridBagConstraints gbc_txtQuantidade = new GridBagConstraints();
		gbc_txtQuantidade.insets = new Insets(0, 0, 5, 5);
		gbc_txtQuantidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtQuantidade.gridx = 3;
		gbc_txtQuantidade.gridy = 1;
		add(txtQuantidade, gbc_txtQuantidade);
		txtQuantidade.setColumns(10);

		JLabel lblValorTotal = new JLabel("Valor total");
		GridBagConstraints gbc_lblValorTotal = new GridBagConstraints();
		gbc_lblValorTotal.anchor = GridBagConstraints.EAST;
		gbc_lblValorTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblValorTotal.gridx = 0;
		gbc_lblValorTotal.gridy = 2;
		add(lblValorTotal, gbc_lblValorTotal);

		txtTotal = new JTextField();
		GridBagConstraints gbc_txtTotal = new GridBagConstraints();
		gbc_txtTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTotal.gridx = 1;
		gbc_txtTotal.gridy = 2;
		add(txtTotal, gbc_txtTotal);
		txtTotal.setColumns(10);

		JLabel lblValorPago = new JLabel("Valor Pago");
		GridBagConstraints gbc_lblValorPago = new GridBagConstraints();
		gbc_lblValorPago.anchor = GridBagConstraints.EAST;
		gbc_lblValorPago.insets = new Insets(0, 0, 5, 5);
		gbc_lblValorPago.gridx = 2;
		gbc_lblValorPago.gridy = 2;
		add(lblValorPago, gbc_lblValorPago);

		txtValorPago = new JTextField();
		GridBagConstraints gbc_txtValorPago = new GridBagConstraints();
		gbc_txtValorPago.insets = new Insets(0, 0, 5, 5);
		gbc_txtValorPago.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtValorPago.gridx = 3;
		gbc_txtValorPago.gridy = 2;
		add(txtValorPago, gbc_txtValorPago);
		txtValorPago.setColumns(10);

		JLabel lblTroco = new JLabel("Troco");
		GridBagConstraints gbc_lblTroco = new GridBagConstraints();
		gbc_lblTroco.anchor = GridBagConstraints.EAST;
		gbc_lblTroco.insets = new Insets(0, 0, 5, 5);
		gbc_lblTroco.gridx = 4;
		gbc_lblTroco.gridy = 2;
		add(lblTroco, gbc_lblTroco);

		txtTroco = new JTextField();
		GridBagConstraints gbc_txtTroco = new GridBagConstraints();
		gbc_txtTroco.insets = new Insets(0, 0, 5, 5);
		gbc_txtTroco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTroco.gridx = 5;
		gbc_txtTroco.gridy = 2;
		add(txtTroco, gbc_txtTroco);
		txtTroco.setColumns(10);

		JButton btnAdicionarItem = new JButton("Adicionar item");
		btnAdicionarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastroItemTabela();
			}
		});
		GridBagConstraints gbc_btnAdicionarItem = new GridBagConstraints();
		gbc_btnAdicionarItem.insets = new Insets(0, 0, 5, 5);
		gbc_btnAdicionarItem.gridx = 1;
		gbc_btnAdicionarItem.gridy = 3;
		add(btnAdicionarItem, gbc_btnAdicionarItem);

		JButton btnRemoverItem = new JButton("Remover Item");
		GridBagConstraints gbc_btnRemoverItem = new GridBagConstraints();
		gbc_btnRemoverItem.insets = new Insets(0, 0, 5, 5);
		gbc_btnRemoverItem.gridx = 3;
		gbc_btnRemoverItem.gridy = 3;
		add(btnRemoverItem, gbc_btnRemoverItem);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 11;
		gbc_scrollPane.gridwidth = 8;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 4;
		add(scrollPane, gbc_scrollPane);

		table = new JTable(model);
		scrollPane.setViewportView(table);

		JButton btnGravar = new JButton("Finalizar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gravarVenda();
			}
		});
		GridBagConstraints gbc_btnGravar = new GridBagConstraints();
		gbc_btnGravar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGravar.gridx = 5;
		gbc_btnGravar.gridy = 15;
		add(btnGravar, gbc_btnGravar);

	}

	private void adicionarValorCbxCliente() {
		try {
			AtualizadorBancoDados atualiza = new AtualizadorBancoDados();
			List<Cliente> lista = atualiza.listaClienteTelaCadastroUsuario();
			Vector<String> vetor = new Vector<String>();
			for (int i = 0; i < lista.size(); i++) {
				vetor.add(lista.get(i).getId() + " - " + lista.get(i).getNome());
				cbxCliente = new JComboBox<String>(vetor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void adicionarValorCbxProduto() {
		try {
			AtualizadorBancoDados atualiza = new AtualizadorBancoDados();
			List<Produto> lista = atualiza.listaProdutoComboBox();
			Vector<String> vetor = new Vector<String>();
			for (int i = 0; i < lista.size(); i++) {
				vetor.add(lista.get(i).getId() + " - " + lista.get(i).getNome());
				cbxProduto = new JComboBox<String>(vetor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * metodo que vai adicionar o item, a quantidade e o valor total na tabela.
	 */
	private void cadastroItemTabela() {
		String quantidade = txtQuantidade.getText().trim();
		String valorTotal = txtTotal.getText().trim();
		BigDecimal valor = new BigDecimal(valorTotal);
		ProdutoVenda item = new ProdutoVenda();
		item.setNomeProduto(cbxProduto.getSelectedItem().toString());
		item.setQuantidade(Integer.parseInt(quantidade));
		item.setValorTotal(valor);
		model.adicionarProdutoTabela(item);
	}

	
	/**
	 * método para gravar a venda no BD.
	 */
	private void gravarVenda() {
		String idVenda = txtNumeroVenda.getText().trim();
		Object idCliente = cbxCliente.getSelectedItem();
		String data = txtData.getText().trim();
		String hora = txtHora.getText().trim();

		Venda venda = new Venda();
		venda.setIdVenda(Integer.parseInt(idVenda));
//		venda.setCliente((Cliente) idCliente);
		venda.setData(data);
		venda.setHora(hora);
		
		gravaVendaBD(venda);

	}

	/**
	 * 
	 * método para instanciar o método para gravação da venda no Bd.
	 */
	private void gravaVendaBD(Venda venda) {
		try {
			AtualizadorBancoDados grava = new AtualizadorBancoDados();
			grava.gravaVenda(venda);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
