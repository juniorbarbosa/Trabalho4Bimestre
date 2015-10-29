package br.univel.ui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class MioloCadastroProduto extends JPanel {
	private JTextField tfxId;
	private JTextField tfxCodigoBarra;
	private JTextField tfxDescricao;
	private JTextField tfxCusto;
	private JTextField tfxMargemLucro;
	private JTextField tfxCategoria;

	/**
	 * @author João Carlos Barbosa Júnior 29/10/2015 19:31:12
	 */
	public MioloCadastroProduto() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo de Barras");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		tfxCodigoBarra = new JTextField();
		GridBagConstraints gbc_tfxCodigoBarra = new GridBagConstraints();
		gbc_tfxCodigoBarra.insets = new Insets(0, 0, 5, 0);
		gbc_tfxCodigoBarra.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxCodigoBarra.gridx = 1;
		gbc_tfxCodigoBarra.gridy = 1;
		add(tfxCodigoBarra, gbc_tfxCodigoBarra);
		tfxCodigoBarra.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Categoria");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		tfxCategoria = new JTextField();
		GridBagConstraints gbc_tfxCategoria = new GridBagConstraints();
		gbc_tfxCategoria.insets = new Insets(0, 0, 5, 0);
		gbc_tfxCategoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxCategoria.gridx = 1;
		gbc_tfxCategoria.gridy = 2;
		add(tfxCategoria, gbc_tfxCategoria);
		tfxCategoria.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Descri\u00E7\u00E3o");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		tfxDescricao = new JTextField();
		GridBagConstraints gbc_tfxDescricao = new GridBagConstraints();
		gbc_tfxDescricao.insets = new Insets(0, 0, 5, 0);
		gbc_tfxDescricao.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxDescricao.gridx = 1;
		gbc_tfxDescricao.gridy = 3;
		add(tfxDescricao, gbc_tfxDescricao);
		tfxDescricao.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Unidade");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
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
		GridBagConstraints gbc_tfxCusto = new GridBagConstraints();
		gbc_tfxCusto.insets = new Insets(0, 0, 5, 0);
		gbc_tfxCusto.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxCusto.gridx = 1;
		gbc_tfxCusto.gridy = 5;
		add(tfxCusto, gbc_tfxCusto);
		tfxCusto.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Margem de Lucro");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		tfxMargemLucro = new JTextField();
		GridBagConstraints gbc_tfxMargemLucro = new GridBagConstraints();
		gbc_tfxMargemLucro.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfxMargemLucro.gridx = 1;
		gbc_tfxMargemLucro.gridy = 6;
		add(tfxMargemLucro, gbc_tfxMargemLucro);
		tfxMargemLucro.setColumns(10);

	}

}
