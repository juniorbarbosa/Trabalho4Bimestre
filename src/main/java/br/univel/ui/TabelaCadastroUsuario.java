package br.univel.ui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.univel.util.Usuario;

/**
 * 
 * @author João Carlos Barbosa Júnior 12/11/2015 19:17:41
 *
 */

public class TabelaCadastroUsuario extends AbstractTableModel {

	/**
	 * criada lista para poder utilizar todos os dados do cliente na tabela, com
	 * get e set.
	 */
	private ArrayList<Usuario> lista = new ArrayList<Usuario>();

	public ArrayList<Usuario> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Usuario> lista) {
		this.lista = lista;
	}

	public int getRowCount() {
		return lista.size();
	}

	public int getColumnCount() {
		return 3;
	}

	public Object getValueAt(int row, int column) {
		Usuario usuario = lista.get(row);
		switch (column) {
		case 0:
			return usuario.getId();
		case 1:
			return usuario.getIdUsuario();
		case 2:
			return usuario.getSenha();
		}
		return "Erro";
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Id Cliente";
		case 1:
			return "Id Usuário";
		case 2:
			return "Senha";
		}
		return "Erro";
	}

}
