package br.univel.ui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MioloCadastroProduto extends JPanel {
	private JTextField tfxId;
	private JTextField tfxCodigoBarra;
	private JTextField tfxDescricao;
	private JTextField tfxCusto;
	private JTextField tfxMargemLucro;
	private JTable table;

	/**
	 * @author Jo�o Carlos Barbosa J�nior 29/10/2015 19:31:12
	 */
	public MioloCadastroProduto() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{82, 223, 63, 65, 0};
		gridBagLayout.rowHeights = new int[]{20, 20, 20, 20, 20, 20, 20, 23, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo de Barras");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		tfxCodigoBarra = new JTextField();
		tfxCodigoBarra.setColumns(10);
		GridBagConstraints gbc_tfxCodigoBarra = new GridBagConstraints();
		gbc_tfxCodigoBarra.anchor = GridBagConstraints.NORTH;
		gbc_tfxCodigoBarra.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxCodigoBarra.insets = new Insets(0, 0, 5, 0);
		gbc_tfxCodigoBarra.gridwidth = 3;
		gbc_tfxCodigoBarra.gridx = 1;
		gbc_tfxCodigoBarra.gridy = 1;
		add(tfxCodigoBarra, gbc_tfxCodigoBarra);
		
		JLabel lblNewLabel_2 = new JLabel("Categoria");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 3;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 2;
		add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Descri\u00E7\u00E3o");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		tfxDescricao = new JTextField();
		tfxDescricao.setColumns(10);
		GridBagConstraints gbc_tfxDescricao = new GridBagConstraints();
		gbc_tfxDescricao.anchor = GridBagConstraints.NORTH;
		gbc_tfxDescricao.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxDescricao.insets = new Insets(0, 0, 5, 0);
		gbc_tfxDescricao.gridwidth = 3;
		gbc_tfxDescricao.gridx = 1;
		gbc_tfxDescricao.gridy = 3;
		add(tfxDescricao, gbc_tfxDescricao);
		
		JLabel lblNewLabel_4 = new JLabel("Unidade");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Custo");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		tfxCusto = new JTextField();
		tfxCusto.setColumns(10);
		GridBagConstraints gbc_tfxCusto = new GridBagConstraints();
		gbc_tfxCusto.anchor = GridBagConstraints.NORTH;
		gbc_tfxCusto.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxCusto.insets = new Insets(0, 0, 5, 0);
		gbc_tfxCusto.gridwidth = 3;
		gbc_tfxCusto.gridx = 1;
		gbc_tfxCusto.gridy = 5;
		add(tfxCusto, gbc_tfxCusto);
		
		JLabel lblNewLabel_6 = new JLabel("Margem de Lucro");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		tfxMargemLucro = new JTextField();
		tfxMargemLucro.setColumns(10);
		GridBagConstraints gbc_tfxMargemLucro = new GridBagConstraints();
		gbc_tfxMargemLucro.anchor = GridBagConstraints.NORTH;
		gbc_tfxMargemLucro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxMargemLucro.insets = new Insets(0, 0, 5, 0);
		gbc_tfxMargemLucro.gridwidth = 3;
		gbc_tfxMargemLucro.gridx = 1;
		gbc_tfxMargemLucro.gridy = 6;
		add(tfxMargemLucro, gbc_tfxMargemLucro);
		
		JButton btnAlterar = new JButton("Alterar");
		GridBagConstraints gbc_btnAlterar = new GridBagConstraints();
		gbc_btnAlterar.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnAlterar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAlterar.gridx = 1;
		gbc_btnAlterar.gridy = 7;
		add(btnAlterar, gbc_btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnExcluir.insets = new Insets(0, 0, 5, 5);
		gbc_btnExcluir.gridx = 2;
		gbc_btnExcluir.gridy = 7;
		add(btnExcluir, gbc_btnExcluir);
		
		JButton btnGravar = new JButton("Gravar");
		GridBagConstraints gbc_btnGravar = new GridBagConstraints();
		gbc_btnGravar.insets = new Insets(0, 0, 5, 0);
		gbc_btnGravar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnGravar.gridx = 3;
		gbc_btnGravar.gridy = 7;
		add(btnGravar, gbc_btnGravar);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 8;
		add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}

}
