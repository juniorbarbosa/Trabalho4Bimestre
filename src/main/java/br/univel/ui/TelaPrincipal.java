package br.univel.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
					frame.setExtendedState(MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnVenda = new JMenu("Venda");
		menuBar.add(mnVenda);

		JMenuItem mntmEfetuarVenda = new JMenuItem("Efetuar Venda");
		mnVenda.add(mntmEfetuarVenda);

		JMenu mnCadastro = new JMenu("Cadastros");
		menuBar.add(mnCadastro);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirTelaCadastroCliente();
			}
		});
		mnCadastro.add(mntmCliente);

		JMenuItem mntmUsurio = new JMenuItem("Usu\u00E1rio");
		mntmUsurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirTelaCadastroUsuario();
			}
		});
		mnCadastro.add(mntmUsurio);

		JMenuItem mntmProduto = new JMenuItem("Produto");
		mntmProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirTelaCadastroProduto();
			}

		});
		mnCadastro.add(mntmProduto);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);

	}

	/**
	 * M�todo para abrir a aba do cadastro de cliente
	 */
	private void abrirTelaCadastroCliente() {
		final TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.remove(telaCadastroCliente);
			}
		};
		telaCadastroCliente.setCloseAction(action);
		tabbedPane.addTab("Cadastro de Cliente", telaCadastroCliente);
		mostraAbaSelecionada();
	}

	/**
	 * M�todo para abrir a aba do cadastro de cliente
	 */
	private void abrirTelaCadastroProduto() {
		final TelaCadastroProduto telaCadastroProduto = new TelaCadastroProduto();
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.remove(telaCadastroProduto);
			}
		};
		telaCadastroProduto.setCloseAction(action);
		tabbedPane.addTab("Cadastro de Produto", telaCadastroProduto);
		mostraAbaSelecionada();
	}

	/**
	 * M�todo para abrir a aba do cadastro de usu�rio
	 */
	private void abrirTelaCadastroUsuario() {
		final TelaCadastroUsuario telaCadastroUsuario = new TelaCadastroUsuario();
		ActionListener action = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.remove(telaCadastroUsuario);
			}
		};
		telaCadastroUsuario.setCloseAction(action);
		tabbedPane.addTab("Cadastro de Usu�rio", telaCadastroUsuario);
		mostraAbaSelecionada();

	}

	/**
	 * m�todo para abrir direto a �ltima tela selecionada.
	 */
	private void mostraAbaSelecionada() {
		tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
	}
}
