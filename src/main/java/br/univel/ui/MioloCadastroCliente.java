package br.univel.ui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

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

	/**
	 * Create the frame.
	 */
	public MioloCadastroCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("Id");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

		tfxId = new JTextField();
		GridBagConstraints gbc_tfxId = new GridBagConstraints();
		gbc_tfxId.insets = new Insets(0, 0, 5, 0);
		gbc_tfxId.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxId.gridx = 1;
		gbc_tfxId.gridy = 0;
		add(tfxId, gbc_tfxId);
		tfxId.setColumns(10);

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
		gbc_tfxNome.insets = new Insets(0, 0, 5, 0);
		gbc_tfxNome.anchor = GridBagConstraints.NORTH;
		gbc_tfxNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxNome.gridx = 1;
		gbc_tfxNome.gridy = 1;
		add(tfxNome, gbc_tfxNome);

		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		tfxEndereco = new JTextField();
		tfxEndereco.setColumns(10);
		GridBagConstraints gbc_tfxEndereco = new GridBagConstraints();
		gbc_tfxEndereco.insets = new Insets(0, 0, 5, 0);
		gbc_tfxEndereco.fill = GridBagConstraints.HORIZONTAL;
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
		gbc_tfxTelefone.insets = new Insets(0, 0, 5, 0);
		gbc_tfxTelefone.fill = GridBagConstraints.HORIZONTAL;
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
		gbc_tfxCidade.insets = new Insets(0, 0, 5, 0);
		gbc_tfxCidade.fill = GridBagConstraints.HORIZONTAL;
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
		gbc_tfxUf.insets = new Insets(0, 0, 5, 0);
		gbc_tfxUf.fill = GridBagConstraints.HORIZONTAL;
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
		gbc_tfxEmail.insets = new Insets(0, 0, 5, 0);
		gbc_tfxEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxEmail.gridx = 1;
		gbc_tfxEmail.gridy = 6;
		add(tfxEmail, gbc_tfxEmail);
		
		lblG = new JLabel("G\u00EAnero");
		GridBagConstraints gbc_lblG = new GridBagConstraints();
		gbc_lblG.anchor = GridBagConstraints.EAST;
		gbc_lblG.insets = new Insets(0, 0, 0, 5);
		gbc_lblG.gridx = 0;
		gbc_lblG.gridy = 7;
		add(lblG, gbc_lblG);
		
		tfxGenero = new JTextField();
		tfxGenero.setColumns(10);
		GridBagConstraints gbc_tfxGenero = new GridBagConstraints();
		gbc_tfxGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxGenero.gridx = 1;
		gbc_tfxGenero.gridy = 7;
		add(tfxGenero, gbc_tfxGenero);
	}

}
