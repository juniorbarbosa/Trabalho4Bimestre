package br.univel.ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class TelaCadastroProduto extends MolduraAbstrata {

	/**
	 * @author João Carlos Barbosa Júnior 29/10/2015 19:45:30
	 */
	public TelaCadastroProduto() {
		super();
	}
	
	/**
	 * metodo que vem da classe abstrata instanciando o miolo no centro do mesmo.
	 */
	@Override
	protected void configuraMiolo() {
		super.add(new MioloCadastroProduto(), BorderLayout.CENTER);
	}

}
