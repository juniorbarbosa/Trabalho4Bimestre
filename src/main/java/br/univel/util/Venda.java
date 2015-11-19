package br.univel.util;

import java.util.ArrayList;

/**
 * 
 * @author João Carlos Barbosa Júnior 19/11/2015 19:16:46
 *
 */
public class Venda {

	private int idVenda;
	private String data;
	private String hora;
	private ArrayList<ProdutoVenda> produtos;
	private Cliente cliente;

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public ArrayList<ProdutoVenda> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<ProdutoVenda> produtos) {
		this.produtos = produtos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
