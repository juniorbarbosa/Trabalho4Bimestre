package br.univel.ui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import br.univel.util.ProdutoVenda;

/**
 * 
 * @author João Carlos Barbosa Júnior 19/11/2015 20:21:21
 *
 */
public class TabelaCadastroVenda extends AbstractTableModel {

	private ArrayList<ProdutoVenda> lista = new ArrayList<ProdutoVenda>();

	public int getRowCount() {
		return lista.size();
	}

	public int getColumnCount() {
		return 3;
	}

	public Object getValueAt(int row, int column) {
		ProdutoVenda produto = lista.get(row);
		switch (column) {
		case 0:
			return produto.getNomeProduto();
		case 1:
			return produto.getQuantidade();
		case 2:
			return produto.getValorTotal();
		}
		return "Erro";
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Nome Produto";
		case 1:
			return "Quantidade";
		case 2:
			return "Valor Total";
		}

		return "Erro";

	}

	/**
	 * 
	 * metodo que vai adicionar o produtoVenda na tabela
	 */
	public void adicionarProdutoTabela(ProdutoVenda item) {
		this.lista.add(item);
        super.fireTableStructureChanged();
	}

}
