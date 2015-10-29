package br.univel.ui;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import br.univel.util.Cliente;

public class TabelaCadastroCliente extends AbstractTableModel {

	/**
	 * @author João Carlos Barbosa Júnior 29/10/2015 19:59:25
	 */

	private ArrayList<Cliente> lista = new ArrayList<Cliente>();

	public int getRowCount() {
		return lista.size();
	}

	public int getColumnCount() {
		return 8;
	}

	public Object getValueAt(int row, int column) {
		Cliente c = lista.get(row);
		switch (column) {
		case 0:
			return c.getId();
		case 1:
			return c.getNome();
		case 2:
			return c.getTelefone();
		case 3:
			return c.getEndereco();
		case 4:
			return c.getCidade();
		case 5:
			return c.getEstado();
		case 6:
			return c.getEmail();
		case 7:
			return c.getGenero();
		}
		return "Erro";
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Id";
		case 1:
			return "Nome";
		case 2:
			return "Telefone";
		case 3:
			return "Endereco";
		case 4:
			return "Cidade";
		case 5:
			return "Estado";
		case 6:
			return "Email";
		case 7:
			return "Gênero";
		}
		return "Erro";
	}

	public void adicionarClienteTabela(Cliente c) {
		this.lista.add(c);
		int row = this.lista.size() - 1;
		super.fireTableStructureChanged();
	}

}
