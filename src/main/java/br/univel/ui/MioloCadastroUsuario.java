package br.univel.ui;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;

import br.univel.util.AtualizadorBancoDados;
import br.univel.util.Cliente;
import br.univel.util.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author João Carlos Barbosa Júnior 10/11/2015 19:34:54
 *
 */

public class MioloCadastroUsuario extends JPanel {
	private JTextField txtIdUsuario;
	private JTextField txtSenha;
	private JTable table;
	private JComboBox cbxIdCliente;
	private TabelaCadastroUsuario model = new TabelaCadastroUsuario();

	/**
	 * Create the panel.
	 */
	public MioloCadastroUsuario() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 46, 209, 89, 89, 0 };
		gridBagLayout.rowHeights = new int[] { 20, 20, 20, 23, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("Id Cliente");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

		AdicionarValorCbxIdCliente();

		GridBagConstraints gbc_cbxIdCliente = new GridBagConstraints();
		gbc_cbxIdCliente.gridwidth = 3;
		gbc_cbxIdCliente.insets = new Insets(0, 0, 5, 5);
		gbc_cbxIdCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbxIdCliente.gridx = 1;
		gbc_cbxIdCliente.gridy = 0;
		add(cbxIdCliente, gbc_cbxIdCliente);

		JLabel lblNewLabel_1 = new JLabel("Id Usu\u00E1rio");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		txtIdUsuario = new JTextField();
		txtIdUsuario.setColumns(10);
		GridBagConstraints gbc_txtIdUsuario = new GridBagConstraints();
		gbc_txtIdUsuario.anchor = GridBagConstraints.NORTH;
		gbc_txtIdUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_txtIdUsuario.gridwidth = 3;
		gbc_txtIdUsuario.gridx = 1;
		gbc_txtIdUsuario.gridy = 1;
		add(txtIdUsuario, gbc_txtIdUsuario);

		JLabel lblNewLabel_2 = new JLabel("Senha");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);

		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		GridBagConstraints gbc_txtSenha = new GridBagConstraints();
		gbc_txtSenha.anchor = GridBagConstraints.NORTH;
		gbc_txtSenha.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtSenha.insets = new Insets(0, 0, 5, 0);
		gbc_txtSenha.gridwidth = 3;
		gbc_txtSenha.gridx = 1;
		gbc_txtSenha.gridy = 2;
		add(txtSenha, gbc_txtSenha);

		JButton btnAlterar = new JButton("Alterar");
		GridBagConstraints gbc_btnAlterar = new GridBagConstraints();
		gbc_btnAlterar.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnAlterar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAlterar.gridx = 1;
		gbc_btnAlterar.gridy = 3;
		add(btnAlterar, gbc_btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exluiUsuario();
			}
		});
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnExcluir.insets = new Insets(0, 0, 5, 5);
		gbc_btnExcluir.gridx = 2;
		gbc_btnExcluir.gridy = 3;
		add(btnExcluir, gbc_btnExcluir);

		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gravarUsuario();
			}
		});
		GridBagConstraints gbc_btnGravar = new GridBagConstraints();
		gbc_btnGravar.insets = new Insets(0, 0, 5, 0);
		gbc_btnGravar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnGravar.gridx = 3;
		gbc_btnGravar.gridy = 3;
		add(btnGravar, gbc_btnGravar);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 4;
		add(scrollPane, gbc_scrollPane);

		table = new JTable(model);
		scrollPane.setViewportView(table);

		initMioloCadastroUsuario();

	}

	private void initMioloCadastroUsuario() {
		atualizaTabela();
		limparCampos();
	}

	private void AdicionarValorCbxIdCliente() {
		try {
			AtualizadorBancoDados atualiza = new AtualizadorBancoDados();
			List<Cliente> lista = atualiza.listaClienteTelaCadastroUsuario();
			Vector<Integer> vetor = new Vector<Integer>();
			for (int i = 0; i < lista.size(); i++) {
				vetor.add(lista.get(i).getId());
				cbxIdCliente = new JComboBox<Integer>(vetor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void gravarUsuario() {
		Object idCliente = cbxIdCliente.getSelectedItem();
		String idUsuario = txtIdUsuario.getText().trim();
		String senha = txtSenha.getText().trim();

		Usuario usuario = new Usuario();
		usuario.setId((Integer) idCliente);
		usuario.setIdUsuario(Integer.parseInt(idUsuario));
		usuario.setSenha(senha);

		gravaUsuarioBancoDados(usuario);

		atualizaTabela();

		limparCampos();
	}

	private void gravaUsuarioBancoDados(Usuario usuario) {
		try {
			AtualizadorBancoDados atualiza = new AtualizadorBancoDados();
			atualiza.gravaUsuarioBanco(usuario);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void exluiUsuario() {
		String idUsuario = txtIdUsuario.getText().trim();

		Usuario usuario = new Usuario();
		usuario.setIdUsuario(Integer.parseInt(idUsuario));

		excluiUsuarioBancoDados(usuario);

		atualizaTabela();

		limparCampos();

	}

	private void excluiUsuarioBancoDados(Usuario usuario) {
		try {
			AtualizadorBancoDados atualiza = new AtualizadorBancoDados();
			atualiza.deletaUsuarioBanco(usuario);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void atualizaTabela() {
		try {
			AtualizadorBancoDados tabela = new AtualizadorBancoDados();
			model.setLista((ArrayList<Usuario>) tabela.listaUsuario());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void limparCampos() {
		txtIdUsuario.setText("");
		txtSenha.setText("");
		cbxIdCliente.setSelectedItem(null);
	}

}
