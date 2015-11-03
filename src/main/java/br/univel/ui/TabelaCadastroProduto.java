package br.univel.ui;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import br.univel.util.Cliente;
import br.univel.util.Produto;

/**
 * 
 * @author João Carlos Barbosa Júnior 03/11/2015 19:12:35
 *
 */

public class TabelaCadastroProduto extends AbstractTableModel {

	private ArrayList<Produto> lista = new ArrayList<Produto>();

	public ArrayList<Produto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Produto> lista) {
		this.lista = (ArrayList<Produto>) lista;
		this.fireTableDataChanged();
	}

	public int getRowCount() {
		return lista.size();
	}

	public int getColumnCount() {
		return 8;
	}

	/**
	 * Método para dar valor as colunas
	 */
	public Object getValueAt(int row, int column) {
		Produto produto = lista.get(row);
		switch (column) {
		case 0:
			return produto.getId();
		case 1:
			return produto.getNome();
		case 2:
			return produto.getCodigoBarra();
		case 3:
			return produto.getCategoria();
		case 4:
			return produto.getDescricao();
		case 5:
			return produto.getUnidade();
		case 6:
			return produto.getCusto();
		case 7:
			return produto.getMargemLucro();
		}
		return "Erro";
	}

	/**
	 * Método para dar nome as colunas
	 */

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Id";
		case 1:
			return "Nome";
		case 2:
			return "Código de Barra";
		case 3:
			return "Categoria";
		case 4:
			return "Descrição";
		case 5:
			return "Unidade";
		case 6:
			return "Custo";
		case 7:
			return "Margem de Lucro";
		}
		return "Erro";
	}

}
