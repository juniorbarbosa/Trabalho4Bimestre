package br.univel.ui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;

/**
 * 
 * @author João Carlos Barbosa Júnior 29/10/2015 19:21:54
 *
 */
public class MioloCadastroCliente extends JPanel {
	private JTextField tfxId;
	private JTextField tfxNome;
	private JTextField tfxEndereco;
	private JTextField tfxTelefone;
	private JTextField tfxCidade;
	private JTextField tfxUf;
	private JLabel lblEmail;
	private JLabel lblG;
	private JTextField tfxEmail;
	private JTextField tfxGenero;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public MioloCadastroCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 45, 206, 0, 89, 89, 0 };
		gridBagLayout.rowHeights = new int[] { 20, 20, 20, 20, 20, 20, 20, 20,
				23, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0,
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
		gbc_tfxId.gridwidth = 4;
		gbc_tfxId.gridx = 1;
		gbc_tfxId.gridy = 0;
		add(tfxId, gbc_tfxId);

		JLabel lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		add(lblNome, gbc_lblNome);

		tfxNome = new JTextField();
		tfxNome.setColumns(10);
		GridBagConstraints gbc_tfxNome = new GridBagConstraints();
		gbc_tfxNome.anchor = GridBagConstraints.NORTH;
		gbc_tfxNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxNome.insets = new Insets(0, 0, 5, 0);
		gbc_tfxNome.gridwidth = 4;
		gbc_tfxNome.gridx = 1;
		gbc_tfxNome.gridy = 1;
		add(tfxNome, gbc_tfxNome);

		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		tfxEndereco = new JTextField();
		tfxEndereco.setColumns(10);
		GridBagConstraints gbc_tfxEndereco = new GridBagConstraints();
		gbc_tfxEndereco.anchor = GridBagConstraints.NORTH;
		gbc_tfxEndereco.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxEndereco.insets = new Insets(0, 0, 5, 0);
		gbc_tfxEndereco.gridwidth = 4;
		gbc_tfxEndereco.gridx = 1;
		gbc_tfxEndereco.gridy = 2;
		add(tfxEndereco, gbc_tfxEndereco);

		JLabel lblTelefone = new JLabel("Telefone");
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.anchor = GridBagConstraints.EAST;
		gbc_lblTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone.gridx = 0;
		gbc_lblTelefone.gridy = 3;
		add(lblTelefone, gbc_lblTelefone);

		tfxTelefone = new JTextField();
		tfxTelefone.setColumns(10);
		GridBagConstraints gbc_tfxTelefone = new GridBagConstraints();
		gbc_tfxTelefone.anchor = GridBagConstraints.NORTH;
		gbc_tfxTelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxTelefone.insets = new Insets(0, 0, 5, 0);
		gbc_tfxTelefone.gridwidth = 4;
		gbc_tfxTelefone.gridx = 1;
		gbc_tfxTelefone.gridy = 3;
		add(tfxTelefone, gbc_tfxTelefone);

		JLabel lblCidade = new JLabel("Cidade");
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.anchor = GridBagConstraints.EAST;
		gbc_lblCidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblCidade.gridx = 0;
		gbc_lblCidade.gridy = 4;
		add(lblCidade, gbc_lblCidade);

		tfxCidade = new JTextField();
		tfxCidade.setColumns(10);
		GridBagConstraints gbc_tfxCidade = new GridBagConstraints();
		gbc_tfxCidade.anchor = GridBagConstraints.NORTH;
		gbc_tfxCidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxCidade.insets = new Insets(0, 0, 5, 0);
		gbc_tfxCidade.gridwidth = 4;
		gbc_tfxCidade.gridx = 1;
		gbc_tfxCidade.gridy = 4;
		add(tfxCidade, gbc_tfxCidade);

		JLabel lblUf = new JLabel("UF");
		GridBagConstraints gbc_lblUf = new GridBagConstraints();
		gbc_lblUf.anchor = GridBagConstraints.EAST;
		gbc_lblUf.insets = new Insets(0, 0, 5, 5);
		gbc_lblUf.gridx = 0;
		gbc_lblUf.gridy = 5;
		add(lblUf, gbc_lblUf);

		tfxUf = new JTextField();
		tfxUf.setColumns(10);
		GridBagConstraints gbc_tfxUf = new GridBagConstraints();
		gbc_tfxUf.anchor = GridBagConstraints.NORTH;
		gbc_tfxUf.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxUf.insets = new Insets(0, 0, 5, 0);
		gbc_tfxUf.gridwidth = 4;
		gbc_tfxUf.gridx = 1;
		gbc_tfxUf.gridy = 5;
		add(tfxUf, gbc_tfxUf);

		lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 6;
		add(lblEmail, gbc_lblEmail);

		tfxEmail = new JTextField();
		tfxEmail.setColumns(10);
		GridBagConstraints gbc_tfxEmail = new GridBagConstraints();
		gbc_tfxEmail.anchor = GridBagConstraints.NORTH;
		gbc_tfxEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxEmail.insets = new Insets(0, 0, 5, 0);
		gbc_tfxEmail.gridwidth = 4;
		gbc_tfxEmail.gridx = 1;
		gbc_tfxEmail.gridy = 6;
		add(tfxEmail, gbc_tfxEmail);

		lblG = new JLabel("G\u00EAnero");
		GridBagConstraints gbc_lblG = new GridBagConstraints();
		gbc_lblG.anchor = GridBagConstraints.EAST;
		gbc_lblG.insets = new Insets(0, 0, 5, 5);
		gbc_lblG.gridx = 0;
		gbc_lblG.gridy = 7;
		add(lblG, gbc_lblG);

		tfxGenero = new JTextField();
		tfxGenero.setColumns(10);
		GridBagConstraints gbc_tfxGenero = new GridBagConstraints();
		gbc_tfxGenero.anchor = GridBagConstraints.NORTH;
		gbc_tfxGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxGenero.insets = new Insets(0, 0, 5, 0);
		gbc_tfxGenero.gridwidth = 4;
		gbc_tfxGenero.gridx = 1;
		gbc_tfxGenero.gridy = 7;
		add(tfxGenero, gbc_tfxGenero);

		JButton btnAlterar = new JButton("Alterar");
		GridBagConstraints gbc_btnAlterar = new GridBagConstraints();
		gbc_btnAlterar.fill = GridBagConstraints.BOTH;
		gbc_btnAlterar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAlterar.gridx = 2;
		gbc_btnAlterar.gridy = 8;
		add(btnAlterar, gbc_btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setPreferredSize(new Dimension(65, 23));
		btnExcluir.setMinimumSize(new Dimension(65, 23));
		btnExcluir.setMaximumSize(new Dimension(65, 23));
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.fill = GridBagConstraints.BOTH;
		gbc_btnExcluir.insets = new Insets(0, 0, 5, 5);
		gbc_btnExcluir.gridx = 3;
		gbc_btnExcluir.gridy = 8;
		add(btnExcluir, gbc_btnExcluir);

		JButton btnGravar = new JButton("Gravar");
		GridBagConstraints gbc_btnGravar = new GridBagConstraints();
		gbc_btnGravar.fill = GridBagConstraints.BOTH;
		gbc_btnGravar.insets = new Insets(0, 0, 5, 0);
		gbc_btnGravar.gridx = 4;
		gbc_btnGravar.gridy = 8;
		add(btnGravar, gbc_btnGravar);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 9;
		add(scrollPane, gbc_scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
