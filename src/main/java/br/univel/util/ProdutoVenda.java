package br.univel.util;

import java.math.BigDecimal;

/**
 * 
 * @author João Carlos Barbosa Júnior 19/11/2015 19:12:38
 *
 */
public class ProdutoVenda {

	private int quantidade;
	private BigDecimal valorTotal;
	private BigDecimal valorPago;
	private BigDecimal troco;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public BigDecimal getTroco() {
		return troco;
	}

	public void setTroco(BigDecimal troco) {
		this.troco = troco;
	}

}
